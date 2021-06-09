/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.*;
import entidade.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class CadastroUsuario extends javax.swing.JFrame {

    private PerfilDao perfilDao;
    private UsuarioDao usuarioDao;
    private Session sessao;
    private List<Perfil> perfis;
    private Usuario usuario;

    public CadastroUsuario() {
        initComponents();
        carregarComboPerfil();
        usuarioDao = new UsuarioDaoImpl();
    }

    public CadastroUsuario(Usuario usuario) {
        initComponents();
        carregarComboPerfil();
        this.usuario = usuario;
        usuarioDao = new UsuarioDaoImpl();
        carregarParaAlterar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        lb_login = new javax.swing.JLabel();
        lb_perfil = new javax.swing.JLabel();
        comboPerfil = new javax.swing.JComboBox<>();
        tfNome = new javax.swing.JTextField();
        tfLogin = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        lb_senha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        lb_situacao = new javax.swing.JLabel();
        radioSituacao = new javax.swing.JRadioButton();

        setTitle("Cadastro Usuário");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro de Usuário");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setPreferredSize(new java.awt.Dimension(90, 25));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lb_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_login.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_login.setText("Login (e-mail):");

        lb_perfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_perfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_perfil.setText("Perfil:");

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setPreferredSize(new java.awt.Dimension(90, 25));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lb_senha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senha.setText("Senha:");

        tfSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lb_situacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_situacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_situacao.setText("Situação:");

        radioSituacao.setText("Ativo");

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lb_senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(tfLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painel_principalLayout.createSequentialGroup()
                                    .addComponent(radioSituacao)
                                    .addGap(57, 57, 57)))
                            .addComponent(comboPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senha))
                .addGap(15, 15, 15)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSituacao)
                    .addComponent(lb_situacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_perfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (!validarCampo()) {
            carregarUsuario();

            try {
                sessao = HibernateUtil.abrirConexao();
                usuarioDao.salvarOuAlterar(usuario, sessao);
                JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
                limpar();
                this.dispose();
            } catch (HibernateException e) {
                if (e.getCause().toString().contains("usuario_email")) {
                    JOptionPane.showMessageDialog(null, "Já existe usuário com esse e-mail!");
                }
                JOptionPane.showMessageDialog(null, "causa " + e.getCause());
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void limpar() {
        tfLogin.setText("");
        tfNome.setText("");
        tfSenha.setText("");
        comboPerfil.setSelectedIndex(0);
        usuario = null;
    }

    private void carregarParaAlterar() {
        this.setTitle("Alterar Usuário");
        titulo.setText("Alteração de Usuário");
        tfNome.setText(usuario.getNome());
        tfLogin.setText(usuario.getLogin());
        btSalvar.setText("Alterar");
        tfSenha.setText(usuario.getSenha());
        radioSituacao.setSelected(usuario.isAtivo());
        comboPerfil.setSelectedItem(usuario.getPerfil().getNome());
    }

    private void carregarUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        usuario.setNome(tfNome.getText().trim());
        usuario.setLogin(tfLogin.getText().trim());
        usuario.setSenha(tfSenha.getText().trim());
        if (radioSituacao.isSelected()) {
            usuario.setAtivo(true);
        } else {
            usuario.setAtivo(false);
        }

        int indice = comboPerfil.getSelectedIndex() - 1;
        Perfil perfil = perfis.get(indice);
        usuario.setPerfil(perfil);
    }

    private void carregarAdministradorBanco() {
        try {
            sessao = HibernateUtil.abrirConexao();
            perfis = perfilDao.pesquisarTodo(sessao);
        } catch (HibernateException he) {
            System.out.println("Erro ao carregar perfis" + he.getMessage());
        } finally {
            sessao.close();
        }

        if (perfis.isEmpty()) {
            Perfil perfilAdministrador = new Perfil(null, "Administrador", "Tem permissão total");
            sessao = HibernateUtil.abrirConexao();
            perfilDao.salvarOuAlterar(perfilAdministrador, sessao);
            sessao.close();
            carregarAuxiliarBanco();
        }
    }

    private void carregarAuxiliarBanco() throws HibernateException {
        if (perfis.isEmpty()) {
            Perfil perfilAuxiliar = new Perfil(null, "Auxiliar", "Esse perfil não pode "
                    + "cadastrar outros usuários e também não pode fazer a pesquisa do total de doações.");
            sessao = HibernateUtil.abrirConexao();
            perfilDao.salvarOuAlterar(perfilAuxiliar, sessao);
            sessao.close();
        }
    }

    private boolean validarCampo() {
        String mensagem = "";
        boolean erro = false;
        String nome = tfNome.getText().trim();
        if (nome.length() <= 3) {
            mensagem += "Valor inválido para o nome!\n";
            erro = true;
        }

        String login = tfLogin.getText().trim();
        if (login.length() <= 5 || !login.contains("@")) {
            mensagem += "Valor inválido para o e-mail!\n";
            erro = true;
        }

        int indice = comboPerfil.getSelectedIndex();
        if (indice <= 0) {
            mensagem += "Selecione um perfil!\n";
            erro = true;
        }

        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem);
        }

        return erro;
    }

    private void carregarComboPerfil() {
        perfilDao = new PerfilDaoImpl();
        carregarAdministradorBanco();
        try {
            sessao = HibernateUtil.abrirConexao();
            perfis = perfilDao.pesquisarTodo(sessao);

        } catch (HibernateException he) {
            System.out.println("Erro ao carregar combobox perfil" + he.getMessage());
        } finally {
            sessao.close();
        }
        comboPerfil.addItem("Selecione uma opção");

        for (Perfil perfil : perfis) {
            comboPerfil.addItem(perfil.getNome());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws java.lang.InstantiationException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            //} catch (InstantiationException ex) {
            //    java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> comboPerfil;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_perfil;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_situacao;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JRadioButton radioSituacao;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
