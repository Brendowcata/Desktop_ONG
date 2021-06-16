/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Emprestimo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Brendow
 */
public class EmprestimoDaoImpl extends BaseDaoImpl<Emprestimo, Long> implements EmprestimoDao, Serializable{

    @Override
    public List<Emprestimo> pesquisarEmprestimoPorCliente(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Emprestimo e join fetch e.cliente c WHERE c.nome LIKE :nome");
        consulta.setParameter("nome", nome + "%");
        return consulta.list();
    }

    @Override
    public Emprestimo pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Emprestimo) sessao.get(Emprestimo.class, id);
    }

    @Override
    public List<Emprestimo> emprestimoMes(Date mes, Session sessao) throws HibernateException {
         Query consulta = sessao.createQuery("from Emprestimo where month(cadastro) = month(:pesquisaMes)");
        consulta.setParameter("pesquisaMes", mes);
        return consulta.list();
    }

    @Override
    public List<Emprestimo> listarTodos(Session sessao) throws HibernateException {
         Query consulta = sessao.createQuery("FROM Emprestimo");
         return consulta.list();
    }


    
    
}
