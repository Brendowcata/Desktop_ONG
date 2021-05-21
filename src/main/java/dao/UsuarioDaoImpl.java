/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Usuario;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Administrador
 */
public class UsuarioDaoImpl extends BaseDaoImpl<Usuario, Long> implements UsuarioDao {

    @Override
    public List<Usuario> listarTodo(Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Usuario");
        return consulta.list();
    }

    @Override
    public List<Usuario> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Usuario WHERE nome LIKE :nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.list();
    }

    @Override
    public Usuario pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Usuario) sessao.get(Usuario.class, id);
    }

    @Override
    public Usuario logar(String login, String senha, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Usuario WHERE login = :login AND senha = :senha");
        consulta.setParameter("login", login);
        consulta.setParameter("senha", senha);
        return (Usuario) consulta.uniqueResult();
    }

    @Override
    public void atualizarUltimoAcesso(Long id, Session sessao) throws HibernateException {
        Transaction transacao = sessao.beginTransaction();
        Query hql = sessao.createQuery("UPDATE Usuario SET ultimoAcesso = current_date() WHERE id = :id");
        hql.setParameter("id", id);
        hql.executeUpdate();
        transacao.commit();
    }

    @Override
    public void alterarStatus(Long id, boolean status, Session sessao) throws HibernateException {
        Transaction transacao = sessao.beginTransaction();
        Query hql = sessao.createQuery("UPDATE Usuario SET ativo = status WHERE id = :id");
        hql.setParameter("id", id);
        hql.setParameter("status", status);
        hql.executeUpdate();
        transacao.commit();
    }

}
