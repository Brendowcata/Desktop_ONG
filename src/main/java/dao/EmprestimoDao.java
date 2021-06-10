/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Emprestimo;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Brendow
 */
public interface EmprestimoDao extends BaseDao<Emprestimo, Long> {
    
    List<Emprestimo> pesquisarEmprestimoPorCliente(String nome, Session sessao)throws HibernateException;
    
    List<Emprestimo> emprestimoMes (Date mes, Session sessao) throws HibernateException;
    
}
