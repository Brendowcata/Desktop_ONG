/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Dinheiro;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Kamilla
 */
public interface DinheiroDao extends BaseDao<Dinheiro, Long> {
    
    List<Dinheiro> pesquisarPorData (Date data, Session sessao) throws HibernateException;
    
    List<Dinheiro> totalDinheiroPorMes (Date mes, Session sessao) throws HibernateException;
    
    List<Dinheiro> totalDinheiroPorAno (Date ano, Session sessao) throws HibernateException;
            
}
