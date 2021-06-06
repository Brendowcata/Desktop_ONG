/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Dinheiro;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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

    @Override
    public List<Dinheiro> pesquisarPorData(Date data, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Dinheiro where Date(dataDoacao) = :data");
        consulta.setParameter("data", data);
        return consulta.list();
    }

    @Override
    public List<Dinheiro> totalDinheiroPorMes(Date mes, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Dinheiro where month(dataDoacao) = month(:pesquisaMes)");
        consulta.setParameter("pesquisaMes", mes);
        return consulta.list();
    }

    @Override
    public List<Dinheiro> totalDinheiroPorAno(Date ano, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("from Dinheiro where year(dataDoacao) = year(:pesquisaAno)");
        consulta.setParameter("pesquisaAno", ano);
        return consulta.list();
    }   
}
