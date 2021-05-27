/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Emprestimo;
import java.io.Serializable;
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
        Query consulta = sessao.createQuery("from Emprestimo where equipamento like :nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.list();
    }

    @Override
    public Emprestimo pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Emprestimo) sessao.get(Emprestimo.class, id);
    }

    
    
}
