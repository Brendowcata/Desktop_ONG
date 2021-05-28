/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Dinheiro;
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

 
    
    // @Test
    public void testSalvar() {
        System.out.println("Salvar");
        dinheiro = new Dinheiro(null, Double.parseDouble(UtilGerador.gerarNumero(3)));
        sessao = HibernateUtil.abrirConexao();
        dinheiroDao.salvarOuAlterar(dinheiro, sessao);
        sessao.close();
         assertNotNull(dinheiro.getId());
    }
    
    //@Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");
        
    }
    
}
