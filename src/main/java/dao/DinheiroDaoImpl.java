/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Dinheiro;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Kamilla
 */
public class DinheiroDaoImpl extends BaseDaoImpl<Dinheiro, Long> implements DinheiroDao, Serializable{

    @Override
    public Dinheiro pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Dinheiro) sessao.get(Dinheiro.class, id);
    }
    
}
