/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Perfil;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Jhony Vill da Silva.
 */
public interface PerfilDao extends BaseDao<Perfil, Long>{
    
    List<Perfil> pesquisarTodo(Session sessao) throws  HibernateException;
}
