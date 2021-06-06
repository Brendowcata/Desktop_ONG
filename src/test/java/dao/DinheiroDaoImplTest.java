/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Dinheiro;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;
import util.UtilGerador;

/**
 *
 * @author Kamilla
 */
public class DinheiroDaoImplTest {

    private Session sessao;
    private Dinheiro dinheiro;
    private DinheiroDao dinheiroDao;

    public DinheiroDaoImplTest() {
        dinheiroDao = new DinheiroDaoImpl();
    }

    //@Test
    public void testSalvar() {
        System.out.println("Salvar");
        dinheiro = new Dinheiro(Double.parseDouble(UtilGerador.gerarNumero(3)), new Date());
        sessao = HibernateUtil.abrirConexao();
        dinheiroDao.salvarOuAlterar(dinheiro, sessao);
        sessao.close();
        assertNotNull(dinheiro.getId());
    }

    //@Test
    public void testAlterar() {
        System.out.println("Alterar");
        buscarDinheiroBd();
        dinheiro.setDinheiro(Double.parseDouble(UtilGerador.gerarNumero(2)));
        sessao = HibernateUtil.abrirConexao();
        dinheiroDao.salvarOuAlterar(dinheiro, sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Dinheiro dinheiroAlterado = dinheiroDao.pesquisarPorId(dinheiro.getId(), sessao);
        sessao.close();

        assertEquals(dinheiro.getId(), dinheiroAlterado.getId());
    }

    //@Test
    public void testExcluir() {
        System.out.println("Excluir");
        buscarDinheiroBd();
        sessao = HibernateUtil.abrirConexao();
        dinheiroDao.excluir(dinheiro, sessao);
        sessao.close();

        sessao = HibernateUtil.abrirConexao();
        Dinheiro dinheiroExcluido = dinheiroDao.pesquisarPorId(dinheiro.getId(), sessao);
        sessao.close();

        assertNull(dinheiroExcluido);
    }

    //@Test
    public void testPesquisarPorData() {
        System.out.println("pesquisarPorData");
        buscarDinheiroBd();
        sessao = HibernateUtil.abrirConexao();
        List<Dinheiro> dinheiros = dinheiroDao.pesquisarPorData(dinheiro.getData(), sessao);
        sessao.close();
        assertTrue(!dinheiros.isEmpty());
    }

    //@Test
    public void testPesquisarPorMes() {
        System.out.println("pesquisarPorMes");
        buscarDinheiroBd();
        sessao = HibernateUtil.abrirConexao();
        List<Dinheiro> dinheiros = dinheiroDao.totalDinheiroPorMes(dinheiro.getData(), sessao);
        sessao.close();
        assertTrue(!dinheiros.isEmpty());
    }

    @Test
    public void testPesquisarPorAno() {
        System.out.println("pesquisarPorAno");
        buscarDinheiroBd();
        sessao = HibernateUtil.abrirConexao();
        List<Dinheiro> dinheiros = dinheiroDao.totalDinheiroPorAno(dinheiro.getData(), sessao);
        sessao.close();
        assertTrue(!dinheiros.isEmpty());
    }

    private Dinheiro buscarDinheiroBd() {
        sessao = HibernateUtil.abrirConexao();
        Query consulta = sessao.createQuery("from Dinheiro");
        List<Dinheiro> listaDinheiro = consulta.list();
        sessao.close();
        if (listaDinheiro.isEmpty()) {
            testSalvar();
        } else {
            dinheiro = listaDinheiro.get(0);
        }
        return dinheiro;
    }

}
