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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    List<Emprestimo> emprestimos;
    private Session session;

    public EmprestimoDaoImplTest() {
        emprestimoDao = new EmprestimoDaoImpl();
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

    //@Test
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
        Usuario usuario;
        usuario = salvarUsuario();
        emprestimo.setEquipamento(equipamento);
        emprestimo.setCliente(cliente);
        emprestimo.setUsuario(usuario);
        session = HibernateUtil.abrirConexao();
        emprestimoDao.salvarOuAlterar(emprestimo, session);
        session.close();

    }
    
    //@Test
    public void testExcluir(){
        EquipamentoDao equipamentoDao = new EquipamentoDaoImpl();
        Equipamento equipamento = new Equipamento();
        buscarEmprestimoBd();
        emprestimo = emprestimos.get(0);
        equipamento = emprestimo.getEquipamento();
        equipamento.setQuantidadeEmprestado(equipamento.getQuantidadeEmprestado() - 1);
        equipamento.setQuantidadeEstoque(equipamento.getQuantidadeEstoque() + 1);
        session = HibernateUtil.abrirConexao();
        emprestimoDao.excluir(emprestimo, session);
        equipamentoDao.salvarOuAlterar(equipamento, session);
        session.close();
        System.out.println("Emprestimo Excluido Com Sucesso!");
    }

    //@Test
    public void testPesquisarEmprestimoPorCliente() {
        buscarEmprestimoBd();
        emprestimo = emprestimos.get(0);
        session = HibernateUtil.abrirConexao();
        List<Emprestimo> emprestimoBd = emprestimoDao.pesquisarEmprestimoPorCliente(emprestimo.getCliente().getNome(), session);
        session.close();
        assertNotNull(emprestimoBd);

        emprestimo = emprestimoBd.get(0);
        for (Emprestimo emprestimo1 : emprestimoBd) {
            System.out.println(emprestimo1.getCliente().getNome());
            System.out.println(emprestimo1.getCadastro());
            System.out.println(emprestimo1.getEquipamento().getNome());
            System.out.println(emprestimo1.getUsuario().getNome());
            System.out.println("");
        }
    }

    //@Test
    public void testPesquisarTodosEmprestimos() {
        session = HibernateUtil.abrirConexao();
        emprestimos = emprestimoDao.listarTodos(session);
        session.close();
        for (Emprestimo emprestimo1 : emprestimos) {
            System.out.println(emprestimo1.getCliente().getNome());
            System.out.println(emprestimo1.getCadastro());
            System.out.println(emprestimo1.getEquipamento().getNome());
            System.out.println(emprestimo1.getUsuario().getNome());
            System.out.println("");
        }
    }

    //@Test
    public void testPesquisarEmprestimosPorMes() {
        try {
            SimpleDateFormat formatarData = new SimpleDateFormat("MM");
            int mes = 5;
            Date dataFormatada = formatarData.parse(String.valueOf(mes));
            session = HibernateUtil.abrirConexao();
            emprestimos = emprestimoDao.emprestimoMes(dataFormatada, session);
            session.close();
            for (Emprestimo emprestimo1 : emprestimos) {
                System.out.println(emprestimo1.getCliente().getNome());
                System.out.println(emprestimo1.getCadastro());
                System.out.println(emprestimo1.getEquipamento().getNome());
                System.out.println(emprestimo1.getUsuario().getNome());
                System.out.println("");
            }
        } catch (ParseException ex) {
            Logger.getLogger(EmprestimoDaoImplTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Usuario salvarUsuario() {
        Usuario usuario = new Usuario(util.UtilGerador.gerarNome(), util.UtilGerador.gerarNome(), util.UtilGerador.gerarNome());
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        session = HibernateUtil.abrirConexao();
        usuarioDao.salvarOuAlterar(usuario, session);
        session.close();
        assertNotNull(usuario.getId());
        return usuario;
    }

    public Emprestimo buscarEmprestimoBd() {
        session = HibernateUtil.abrirConexao();
        Query consulta = session.createQuery("from Emprestimo");
        emprestimos = consulta.list();
        session.close();
        if (emprestimos.isEmpty()) {
            testSalvar();
        } else {
            emprestimo = emprestimos.get(0);
        }
        return emprestimo;
    }

}
