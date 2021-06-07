/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.*;
import entidade.Equipamento;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class AlterarEquipamento extends javax.swing.JFrame {

    private Session sessao;
    private Equipamento equipamento;
    private EquipamentoDao equipamentoDao;

    public AlterarEquipamento() {

    }

    public AlterarEquipamento(Equipamento equipamento) {
        initComponents();
        this.equipamento = equipamento;
        equipamentoDao = new EquipamentoDaoImpl();
        tfNome.setText(equipamento.getNome());
        lb_quantidadeEstoque.setText(Integer.toString(equipamento.getQuantidadeEstoque()));
        taObservacao.setText(equipamento.getObservacao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        lb_nome1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacao = new javax.swing.JTextArea();
        lb_estoque = new javax.swing.JLabel();
        btExcluirUnidade = new javax.swing.JButton();
        lb_quantidadeEstoque = new javax.swing.JLabel();

        setTitle("Alterar Equipamento");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Alteração de Equipamento");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome: *");

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setPreferredSize(new java.awt.Dimension(90, 25));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setPreferredSize(new java.awt.Dimension(90, 25));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lb_nome1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome1.setText("Observação:");

        taObservacao.setColumns(20);
        taObservacao.setRows(5);
        jScrollPane1.setViewportView(taObservacao);

        lb_estoque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_estoque.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_estoque.setText("Em estoque:");

        btExcluirUnidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluirUnidade.setText("Excluir unidade");
        btExcluirUnidade.setPreferredSize(new java.awt.Dimension(90, 25));
        btExcluirUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirUnidadeActionPerformed(evt);
            }
        });

        lb_quantidadeEstoque.setText(" ");

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(btExcluirUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(lb_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(lb_quantidadeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_quantidadeEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_estoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome1))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (!validarCampo()) {
            carregarEquipamento();

            try {
                sessao = HibernateUtil.abrirConexao();
                equipamentoDao.salvarOuAlterar(equipamento, sessao);
                JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
                limpar();
                this.dispose();
            } catch (HibernateException e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar!");
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirUnidadeActionPerformed
        try {
            if (equipamento.getQuantidadeEstoque() > 1) {
                excluirUnidadeEstoque();
                sessao = HibernateUtil.abrirConexao();
                equipamentoDao.salvarOuAlterar(equipamento, sessao);
                JOptionPane.showMessageDialog(null, "Unidade excluída com sucesso!");
                lb_quantidadeEstoque.setText(Integer.toString(equipamento.getQuantidadeEstoque()));

            } else {
                JOptionPane.showMessageDialog(null, "Há apenas uma unidade em estoque, exclua o equipamento todo!");
            }
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!");
        } finally {
            sessao.close();
        }
    }//GEN-LAST:event_btExcluirUnidadeActionPerformed

    private void limpar() {
        tfNome.setText("");
        taObservacao.setText("");
    }

    private boolean validarCampo() {
        String mensagem = "";
        boolean erro = false;
        String nomeTela = tfNome.getText().trim();
        if (nomeTela.length() <= 1) {
            mensagem += "Favor informar o nome do equipamento.\n";
            erro = true;
        }
        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return erro;
    }

    private void carregarEquipamento() {
        equipamento.setNome(tfNome.getText().trim());
        equipamento.setObservacao(taObservacao.getText().trim());
    }

    private void excluirUnidadeEstoque() {
        equipamento.setQuantidadeEstoque(equipamento.getQuantidadeEstoque() - 1);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AlterarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AlterarEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluirUnidade;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_estoque;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_quantidadeEstoque;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTextArea taObservacao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
