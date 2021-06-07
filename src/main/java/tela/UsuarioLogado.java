/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.HibernateUtil;
import dao.UsuarioDao;
import dao.UsuarioDaoImpl;
import entidade.Usuario;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class UsuarioLogado implements Serializable {

    private static Usuario usuario; // singleton

    private Session sessao;
    private UsuarioDao usuarioDao;

    public UsuarioLogado(Usuario usuario) {
        this.usuario = usuario;
        usuarioDao = new UsuarioDaoImpl();
    }

    public void atualizarUsuarioUltimoAcesso() {
        try {
            sessao = HibernateUtil.abrirConexao();
            usuarioDao.atualizarUltimoAcesso(usuario.getId(), sessao);
        } catch (HibernateException e) {
            System.out.println("Erro ao atualizar último acesso " + e.getMessage());
        } finally {
            sessao.close();
        }
    }
    
    public static String getPerfil(){
        return usuario.getPerfil().getNome();
    }

    public static Usuario getUsuario() {
        return usuario;
    }

}
