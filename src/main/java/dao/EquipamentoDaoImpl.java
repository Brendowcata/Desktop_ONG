/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Equipamento;
import java.io.Serializable;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class EquipamentoDaoImpl extends BaseDaoImpl<Equipamento, Long> implements EquipamentoDao, Serializable {

    @Override
    public Equipamento pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return (Equipamento) sessao.get(Equipamento.class, id);
    }

    @Override
    public List<Equipamento> pesquisarEquipamentoPorNome(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Equipamento WHERE nome LIKE :nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.list();
    }
    
    @Override
    public List<Equipamento> pesquisarQuantidadeEquipamentoEstoque(String nome, Session sessao) throws HibernateException {
        Query consulta = sessao.createQuery("FROM Equipamento WHERE nome LIKE :nome AND situacao = true");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.list();
    }

}
