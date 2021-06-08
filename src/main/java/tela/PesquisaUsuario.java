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
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Equipe.
 */
public class PesquisaUsuario extends javax.swing.JFrame {

    private Session sessao;
    private DefaultTableModel tabelaModelo;
    private Usuario usuario;
    private UsuarioDao usuarioDao;
    private List<Usuario> usuarios;
    

    public PesquisaUsuario() {
        initComponents();
        usuarioDao = new UsuarioDaoImpl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setTitle("Pesquisar Usuário");

        painel_principal.setPreferredSize(new java.awt.Dimension(600, 428));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Pesquisa de Usuário");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        btPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisa.setText("Pesquisar");
        btPesquisa.setPreferredSize(new java.awt.Dimension(90, 25));
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Login", "Situação", "Perfil", "Último Acesso"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuarios);
        if (tabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            tabelaUsuarios.getColumnModel().getColumn(0).setMinWidth(100);
            tabelaUsuarios.getColumnModel().getColumn(0).setMaxWidth(150);
            tabelaUsuarios.getColumnModel().getColumn(1).setMinWidth(100);
            tabelaUsuarios.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setPreferredSize(new java.awt.Dimension(90, 25));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setPreferredSize(new java.awt.Dimension(90, 25));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        if (!validarCampo()) {
            sessao = HibernateUtil.abrirConexao();
            try {
                usuarios = usuarioDao.pesquisarPorNome(tfNome.getText().trim(), sessao);
                if (usuarios.isEmpty()) {
                    if (tabelaModelo != null) {
                        tabelaModelo.setNumRows(0);
                    }
                    JOptionPane.showMessageDialog(null, "Nenhum valor encontrado!");
                }else{
                    popularTabela();
                }
            } catch (HibernateException e) {
                System.out.println("Erro ao pesquisar " + e.getMessage());
            } finally {
                sessao.close();
            }

        }
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linhaSelecionada = tabelaUsuarios.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
            if (opcao == 0) {
                try {
                    sessao = HibernateUtil.abrirConexao();
                    Usuario usuarioSelecionado = usuarios.get(linhaSelecionada);
                    usuarioDao.excluir(usuarioSelecionado, sessao);
                    JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
                    tabelaModelo.setNumRows(0);
                    tfNome.setText("");

                } catch (HibernateException e) {
                    System.out.println("Erro ao excluir" + e.getMessage());
                } finally {
                    sessao.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = tabelaUsuarios.getSelectedRow();
        if (linhaSelecionada >= 0) {
            Usuario usuarioSelecionado = usuarios.get(linhaSelecionada);
            new CadastroUsuario(usuarioSelecionado).setVisible(true);
            this.isFocusOwner();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void popularTabela() {
        tabelaModelo = (DefaultTableModel) tabelaUsuarios.getModel();
        tabelaModelo.setNumRows(0);
        String ativo;
        String dataFormatada;
        SimpleDateFormat formatado = new SimpleDateFormat("dd-MM-YYYY HH:mm");
        for (Usuario usuario : usuarios) {
            ativo = usuario.isAtivo() ? "Ativo" : "Inativo";
            dataFormatada = "-";
            if (usuario.getUltimoAcesso() != null) {
               dataFormatada = formatado.format(usuario.getUltimoAcesso());
            }
            tabelaModelo.addRow(new Object[]{usuario.getNome(),
                usuario.getLogin(),
                ativo,
                usuario.getPerfil().getNome(),
                dataFormatada});
            }
        }
    
    /**
     * @param args the command line arguments
     */
    private boolean validarCampo() {

        boolean erro = false;
        String nome = tfNome.getText().trim();
        if (nome.length() <= 3) {
            JOptionPane.showMessageDialog(null, "Informe um nome válido!");
            erro = true;
        }
        return erro;
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField tfNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
