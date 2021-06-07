/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Perfil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class PerfilDaoImpl extends BaseDaoImpl<Perfil, Long> implements PerfilDao, Serializable{

    @Override
    public List<Perfil> pesquisarTodo(Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Perfil");
        return consulta.list();
    }

    @Override
    public Perfil pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Perfil) sessao.get(Perfil.class, id);
    }

}
