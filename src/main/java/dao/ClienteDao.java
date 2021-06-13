/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Cliente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author David
 */
public interface ClienteDao extends BaseDao<Cliente, Long>{
    
    List<Cliente> pesquisarClientesPorNome(String nome, Session sessao)throws HibernateException;
    
    Cliente pesquisaPorCpf(String cpf, Session sessao)throws HibernateException;
    
}
