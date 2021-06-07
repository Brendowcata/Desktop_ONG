/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Equipamento;
import java.util.*;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static util.UtilGerador.*;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class EquipamentoDaoImplTest {

    private Equipamento equipamento;
    private EquipamentoDao equipamentoDao;
    private Session sessao;

    public EquipamentoDaoImplTest() {
        equipamentoDao = new EquipamentoDaoImpl();
    }

    //   @Test
    public void testSalvar() {
        System.out.println("salvar");
        equipamento = new Equipamento(
                null,
                gerarNomeEquipamento(),
                equipamento.getQuantidadeEstoque() + 1,
                gerarCaracter(4));
        sessao = HibernateUtil.abrirConexao();
        equipamentoDao.salvarOuAlterar(equipamento, sessao);
        sessao.close();
        assertNotNull(equipamento.getId());
    }

    // @Test
    public void testAlterar() {
        System.out.println("alterar");
        buscarEquipamentoBd();
        equipamento.setObservacao("ALTERADO");
        sessao = HibernateUtil.abrirConexao();
        equipamentoDao.salvarOuAlterar(equipamento, sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Equipamento equipamentoAlt = equipamentoDao.pesquisarPorId(equipamento.getId(), sessao);
        sessao.close();
        assertEquals(equipamentoAlt.getObservacao(), equipamento.getObservacao());
    }

//    @Test
    public void testExcluir() {
        System.out.println("excluir");
        buscarEquipamentoBd();
        sessao = HibernateUtil.abrirConexao();
        equipamentoDao.excluir(equipamento, sessao);

        Equipamento equipamentoExcluido = equipamentoDao.pesquisarPorId(equipamento.getId(), sessao);
        sessao.close();
        assertNull(equipamentoExcluido);
    }

    //@Test
    public void testPesquisarEquipamentoPorNome() {
        System.out.println("pesquisar por nome");
        buscarEquipamentoBd();
        sessao = HibernateUtil.abrirConexao();
        List<Equipamento> equipamentos = equipamentoDao.pesquisarEquipamentoPorNome(equipamento.getNome().substring(0, 3), sessao); 
        sessao.close();
        assertTrue(!equipamentos.isEmpty());
        
        JOptionPane.showMessageDialog(null, equipamentos); 
    }

    //@Test
    public void testPesquisarTodo() {
        System.out.println("pesquisar todos");
        buscarEquipamentoBd();
        sessao = HibernateUtil.abrirConexao();
        List<Equipamento> equipamentos = equipamentoDao.pesquisarTodo(sessao);
        sessao.close();
        assertTrue(!equipamentos.isEmpty());
    }

    //   @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");
        // buscarEquipamentoBd();
    }

    public Equipamento buscarEquipamentoBd() {
        sessao = HibernateUtil.abrirConexao();
        Query consulta = sessao.createQuery("FROM Equipamento");
        List<Equipamento> equipamentos = consulta.list();
        sessao.close();
        if (equipamentos.isEmpty()) {
            testSalvar();
        } else {
            equipamento = equipamentos.get(0);
        }
        return equipamento;
    }
}
