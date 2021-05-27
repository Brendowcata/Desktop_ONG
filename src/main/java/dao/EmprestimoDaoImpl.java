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
    public List<Emprestimo> pesquisarEmprestimoPorCliente(Long id, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Emprestimo e join fetch e.cliente.endereco"
                                                     + " where e.id = :cliente");
        consulta.setParameter("cliente", id);
        return consulta.list();
    }

    @Override
    public Emprestimo pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Emprestimo) sessao.get(Emprestimo.class, id);
    }

    
    
}
