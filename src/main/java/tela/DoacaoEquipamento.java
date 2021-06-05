/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.*;
import entidade.Equipamento;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class DoacaoEquipamento extends javax.swing.JFrame {

    private Session sessao;
    private Equipamento equipamento;
    private EquipamentoDao equipamentoDao;
    private List<Equipamento> equipamentos;

//    public DoacaoEquipamento() {
//    }
    public DoacaoEquipamento() {
        initComponents();
        equipamentoDao = new EquipamentoDaoImpl();
        carregarComboEquipamento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_nomeEquipamento = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lb_nome1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacaoDoacao = new javax.swing.JTextArea();
        comboEquipamento = new javax.swing.JComboBox<>();

        setTitle("Cadastro Equipamento");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Doação de Equipamento");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lb_nomeEquipamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nomeEquipamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nomeEquipamento.setText("Equipamento: *");

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

        taObservacaoDoacao.setColumns(20);
        taObservacaoDoacao.setRows(5);
        jScrollPane1.setViewportView(taObservacaoDoacao);

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(lb_nomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(lb_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nomeEquipamento))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome1))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
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
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                limpar();
            } catch (HibernateException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void limpar() {
        taObservacaoDoacao.setText("");
    }

    private void carregarComboEquipamento() {
        equipamentoDao = new EquipamentoDaoImpl();
        try {
            sessao = HibernateUtil.abrirConexao();
            equipamentos = equipamentoDao.pesquisarTodo(sessao);

        } catch (HibernateException he) {
            System.out.println("Erro ao carregar combobox equipamento" + he.getMessage());
        } finally {
            sessao.close();
        }
        comboEquipamento.addItem("Selecione um Equipamento");

        for (Equipamento equipamentoFor : equipamentos) {
            comboEquipamento.addItem(equipamentoFor.getNome());
        }
    }

    public void carregarEquipamento() {
        int indice = comboEquipamento.getSelectedIndex() - 1;
        Equipamento equipamentoCombo = equipamentos.get(indice);
        equipamento.setQuantidadeEstoque(equipamentoCombo.getQuantidadeEstoque() + 1);
//        Equipamento equipamentoCombo = equipamentos.get(indice);
//        equipamento.setQuantidadeEstoque(equipamentoCombo.getQuantidadeEstoque() + 1);
//        equipamento.setObservacao(taObservacaoDoacao.getText());
    }


    private boolean validarCampo() {
        String mensagem = "";
        boolean erro = false;

        int indice = comboEquipamento.getSelectedIndex();
        if (indice <= 0) {
            mensagem += "Selecione um equipamento!\n";
            erro = true;
        }

        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem);
        }

        return erro;
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
            java.util.logging.Logger.getLogger(DoacaoEquipamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoacaoEquipamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoacaoEquipamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoacaoEquipamento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DoacaoEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> comboEquipamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_nomeEquipamento;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTextArea taObservacaoDoacao;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}