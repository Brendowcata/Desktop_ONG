/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.*;
import entidade.Cliente;
import entidade.Emprestimo;
import entidade.Equipamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class PesquisarEmprestimo extends javax.swing.JFrame {

    private Session session;
    private Emprestimo emprestimo;
    private Cliente cliente;
    Equipamento equipamento;
    private EmprestimoDao emprestimoDao;
    private List<Emprestimo> emprestimos;

    private DefaultTableModel tabelaModelo;

    public PesquisarEmprestimo() {
        initComponents();
        radioNome.setSelected(true);
        emprestimoDao = new EmprestimoDaoImpl();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        painel_principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmprestimo = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        radioNome = new javax.swing.JRadioButton();
        radioCPF = new javax.swing.JRadioButton();
        comboMes = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Pesquisa Equipamento");

        painel_principal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        painel_principal.setPreferredSize(new java.awt.Dimension(600, 428));

        tabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "CPF", "Equipamento", "Data", "Cadastrado Por:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEmprestimo);
        if (tabelaEmprestimo.getColumnModel().getColumnCount() > 0) {
            tabelaEmprestimo.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabelaEmprestimo.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabelaEmprestimo.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Pesquisa de Emprestimo");

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setPreferredSize(new java.awt.Dimension(90, 25));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        radioNome.setText("Nome");
        radioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNomeActionPerformed(evt);
            }
        });

        radioCPF.setText("CPF");
        radioCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCPFActionPerformed(evt);
            }
        });

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jFormattedTextField1.setText("jFormattedTextField1");

        jButton1.setText("Excluir Emprestimo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(radioNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioCPF))))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNome)
                    .addComponent(radioCPF))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if(tabelaEmprestimo.getRowCount() > 0){
            tabelaModelo.setNumRows(0);
        }
        if (radioNome.isSelected()) {
            try {
                session = HibernateUtil.abrirConexao();
                emprestimos = emprestimoDao.pesquisarEmprestimoPorCliente(tfNome.getText().trim(), session);
                if (emprestimos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum valor!");
                } else {
                    if (comboMes.getSelectedItem().equals("Geral")) {
                        popularTabela(emprestimos);
                    } else {
                        pesquisarPorMes();
                       
                    }
                }

            } catch (HibernateException e) {
                System.out.println("Erro ao pesquisar!" + e.getMessage());
            } finally {
                session.close();
            }
        } else if (radioCPF.isSelected()) {
            if(!tfNome.getText().trim().equals("")){
            try {
                List<Emprestimo> emprestimosCpf = new ArrayList<>();
                ClienteDao clienteDao = new ClienteDaoImpl();
                session = HibernateUtil.abrirConexao();
                cliente = clienteDao.pesquisaPorCpf(tfNome.getText().trim(), session);
                emprestimosCpf = puxarTodosEmprestimos();
                emprestimos = new ArrayList<>();
                for (Emprestimo emprestimo1 : emprestimosCpf) {
                    if (emprestimo1.getCliente().getCpf().equals(cliente.getCpf())) {
                        emprestimos.add(emprestimo1);
                    }
                }
                if (emprestimos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum valor!");
                } else {
                    if (comboMes.getSelectedItem().equals("Geral")) {
                        popularTabela(emprestimos);
                    } else {
                        pesquisarPorMes();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um CPF Valido!");
            } finally {
                session.close();
            }

        } else {
                JOptionPane.showMessageDialog(null, "Digite um CPF!");
                tabelaModelo.setNumRows(0);
            }
        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private List<Emprestimo> puxarTodosEmprestimos() {
        session = HibernateUtil.abrirConexao();
        Query consulta = session.createQuery("FROM Emprestimo");
        return consulta.list();

    }

    private void pesquisarPorMes() {
        try {
            List<Emprestimo> emprestimosMes = new ArrayList<>();
            List<Emprestimo> emprestimosRealizados = new ArrayList<>();
            session = HibernateUtil.abrirConexao();
            SimpleDateFormat formatarData = new SimpleDateFormat("MM");
            Date dataFormatada = formatarData.parse(String.valueOf(comboMes.getSelectedIndex()));

            emprestimosMes = emprestimoDao.emprestimoMes(dataFormatada, session);

            if (emprestimosMes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não houve nenhum emprestimo nesse mês!");
            }else {
                for (Emprestimo emprestimo1 : emprestimos) {
                    for (Emprestimo emprestimosMe : emprestimosMes) {
                        if (emprestimosMe.getCadastro().equals(emprestimo1.getCadastro()) && emprestimosMe.getId().equals(emprestimo1.getId())) {
                            emprestimosRealizados.add(emprestimo1);
                        }
                    }
                }
                if(emprestimosRealizados.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não houve nenhum emprestimo nesse mês!");
                } else{
                popularTabela(emprestimosRealizados);
                }
            }
        } catch (ParseException ex) {
            System.out.println("Erro ao pesquisar o mês");
        }
    }

    private void radioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNomeActionPerformed
        // TODO add your handling code here:
        if (radioNome.isSelected()) {
            lb_nome.setText("Nome:");
            radioCPF.setSelected(false);
        }
    }//GEN-LAST:event_radioNomeActionPerformed

    private void radioCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCPFActionPerformed
        // TODO add your handling code here:
        if (radioCPF.isSelected()) {
            lb_nome.setText(" CPF:");
            radioNome.setSelected(false);
        }
    }//GEN-LAST:event_radioCPFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Tem Certeza Que Deseja Excluir Esse Emprestimo?");
        
        if (resposta == 0){
        EquipamentoDao equipamentoDao = new EquipamentoDaoImpl();
        int linhaSelecionada = tabelaEmprestimo.getSelectedRow();
        if (linhaSelecionada >= 0) {
            Emprestimo emprestimoS = emprestimos.get(linhaSelecionada);
            equipamento = emprestimoS.getEquipamento();
            equipamento.setQuantidadeEmprestado(equipamento.getQuantidadeEmprestado() - 1);
            equipamento.setQuantidadeEstoque(equipamento.getQuantidadeEstoque() + 1);
            session = HibernateUtil.abrirConexao();
            equipamentoDao.salvarOuAlterar(equipamento, session);
            emprestimoDao.excluir(emprestimoS, session);
            session.close();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Equipamento!");
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void popularTabela(List<Emprestimo> emprestimosTabela) {
        emprestimos = emprestimosTabela;
        tabelaModelo = (DefaultTableModel) tabelaEmprestimo.getModel();
        tabelaModelo.setNumRows(0);
        for (Emprestimo emprestimo1 : emprestimosTabela) {
            tabelaModelo.addRow(new Object[]{
                emprestimo1.getCliente().getNome(),
                emprestimo1.getCliente().getCpf(),
                emprestimo1.getEquipamento().getNome(),
                emprestimo1.getCadastro(),
                emprestimo1.getUsuario().getNome(),});
        }
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
            java.util.logging.Logger.getLogger(PesquisarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisarEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JRadioButton radioCPF;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tabelaEmprestimo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
