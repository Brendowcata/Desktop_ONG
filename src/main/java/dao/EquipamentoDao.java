/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Equipamento;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Jhony Vill da Silva.
 */
public interface EquipamentoDao extends BaseDao<Equipamento, Long>{
    
    List<Equipamento> pesquisarEquipamentoPorNome(String nome, Session sessao)throws HibernateException;
    
    List<Equipamento> pesquisarQuantidadeEquipamentoEstoque (String nome, Session sessao)throws HibernateException;
}
