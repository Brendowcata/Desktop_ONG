/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Cliente;
import entidade.Emprestimo;
import entidade.Equipamento;
import entidade.Usuario;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Brendow
 */
public class EmprestimoDaoImplTest {
    
    private Emprestimo emprestimo;
    private EmprestimoDao emprestimoDao;
    private Session session;
    
    public EmprestimoDaoImplTest() {
        emprestimoDao = new EmprestimoDaoImpl();
    }

    //@Test
    public void testPesquisarEmprestimoPorCliente() {
    }

    //@Test
    public void testSalvar() {
        emprestimo = new Emprestimo();
        Cliente cliente;
        ClienteDaoImplTest cdit = new ClienteDaoImplTest();
        EquipamentoDaoImplTest equipamentoDaoImplTest = new EquipamentoDaoImplTest();
        Equipamento equipamento;
        equipamento = equipamentoDaoImplTest.buscarEquipamentoBd();
        cliente = cdit.buscarClienteBD();
        emprestimo.setCadastro(new Date());
        emprestimo.setCliente(cliente);
        emprestimo.setEquipamento(equipamento);
        emprestimo.setUsuario(salvarUsuario());
        
         session = HibernateUtil.abrirConexao();

        emprestimoDao.salvarOuAlterar(emprestimo, session);

        session.close();

        assertNotNull(emprestimo.getId());

    }
    
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Cliente cliente;
        ClienteDaoImplTest cdit = new ClienteDaoImplTest();
        cliente = cdit.buscarClienteBD();
        cdit.testSalvar();
        EquipamentoDaoImplTest equipamentoDaoImplTest = new EquipamentoDaoImplTest();
        Equipamento equipamento;
        equipamentoDaoImplTest.testSalvar();
        equipamento = equipamentoDaoImplTest.buscarEquipamentoBd();
        buscarEmprestimoBd();
        emprestimo.setEquipamento(equipamento);
        emprestimo.setCliente(cliente);
        session = HibernateUtil.abrirConexao();
        emprestimoDao.salvarOuAlterar(emprestimo, session);
        session.close();

        
    }
    
    private Usuario salvarUsuario(){
        Usuario usuario = new Usuario("Usuario3", "loginteste3", "senhateste3");
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        session = HibernateUtil.abrirConexao();
        usuarioDao.salvarOuAlterar(usuario, session);
        session.close();
        assertNotNull(usuario.getId());
        return usuario;
    }
    
     public Emprestimo buscarEmprestimoBd() {
        session = HibernateUtil.abrirConexao();
        Query consulta = session.createQuery("FROM Emprestimo");
        List<Emprestimo> emprestimos = consulta.list();
        session.close();
        if (emprestimos.isEmpty()) {
            testSalvar();
        } else {
            emprestimo = emprestimos.get(0);
        }
        return emprestimo;
    }
    
    
    
}
