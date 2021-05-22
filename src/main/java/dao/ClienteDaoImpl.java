/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Cliente;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDaoImpl extends BaseDaoImpl<Cliente, Long> implements ClienteDao, Serializable {

    /*  @Override
    public List<Cliente> pesquisarEmprestimoPorNomeCliente(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Cliente where nome like")
        return null;
    }
     */
    //cliente c left join fetch c.emprestimo
    @Override
    public List<Cliente> pesquisarClientesPorNome(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Cliente where nome like :nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.list();
    }

    @Override
    public Cliente pesquisaPorCpf(String cpf, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Cliente where cpf = :cpf");
        consulta.setParameter("cpf", cpf);
        return (Cliente)consulta.uniqueResult();
    }

    @Override
    public Cliente pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Cliente) sessao.get(Cliente.class, id);
    }

}
