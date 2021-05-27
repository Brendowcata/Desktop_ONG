/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Cliente;
import entidade.Endereco;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;
import static util.UtilGerador.*;

/**
 *
 * @author David
 */
public class ClienteDaoImplTest {

    private Cliente cliente;
    private ClienteDao clienteDao;
    private Session session;

    public ClienteDaoImplTest() {
        clienteDao = new ClienteDaoImpl();
    }

    @Test
    public void testSalvar() {
        System.out.println("Salvar Cliente");
        cliente = new Cliente(
                null,
                gerarNome(),
                gerarCpf(),
                gerarNumero(7),
                gerarTeleCeluar()
        );

        Endereco endereco = new Endereco(
                null,
                gerarLogradouro(),
                gerarNumero(3),
                "TRINDADE",
                gerarCidade(),
                gerarUF(),
                "Casa da Frente - Portão Branco"
        );

        cliente.setEndereco(endereco);
        endereco.setCliente(cliente);

        session = HibernateUtil.abrirConexao();

        clienteDao.salvarOuAlterar(cliente, session);

        session.close();

        assertNotNull(cliente.getId());
        assertNotNull(cliente.getEndereco().getId());

    }

    //@Test
    public void testAlterar() {
        System.out.println("Alterar Cliente");
        buscarClienteBD();
        cliente.setCpf("111.111.111-11");
        session = HibernateUtil.abrirConexao();
        clienteDao.salvarOuAlterar(cliente, session);
        session.close();

        session = HibernateUtil.abrirConexao();
        Cliente clienteAlt = clienteDao.pesquisarPorId(cliente.getId(), session);
        session.close();
        assertEquals(clienteAlt.getCpf(), cliente.getCpf());
    }

    //@Test
    public void testExcluir() {
        System.out.println("Excluir cliente");
        buscarClienteBD();
        session = HibernateUtil.abrirConexao();
        clienteDao.excluir(cliente, session);
        Cliente clienteExcluido = clienteDao.pesquisarPorId(cliente.getId(), session);
        session.close();
        assertNull(clienteExcluido);
    }

    public Cliente buscarClienteBD() {
        System.out.println("Pesquisa no BD por Cliente");
        session = HibernateUtil.abrirConexao();
        Query consulta = session.createQuery("from Cliente");
        List<Cliente> clientes = consulta.list();
        session.close();
        if (clientes.isEmpty()) {
            testSalvar();
        } else {
            cliente = clientes.get(0);
        }
        return cliente;
    }

    //@Test
    public void testPesquisarClientesPorNome() {
        System.out.println("pesquisarClientesPorNome");
        buscarClienteBD();
        session = HibernateUtil.abrirConexao();
        List<Cliente> clientes = clienteDao.pesquisarClientesPorNome(cliente.getNome().substring(0, 3), session);
        session.close();
        assertTrue(clientes.size() > 0);
    }

    //@Test
    public void testPesquisaPorCpf() {
        System.out.println("pesquisaPorCpf");
        buscarClienteBD();
        session = HibernateUtil.abrirConexao();
        Cliente clienteCpf = clienteDao.pesquisaPorCpf(cliente.getCpf(), session);
        session.close();
        assertNotNull(clienteCpf);
    }

    //@Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");

    }

}
