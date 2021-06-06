/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.*;
import entidade.Dinheiro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Kamilla
 */
public class PesquisarDinheiro extends javax.swing.JFrame {

    private Session sessao;
    private Dinheiro dinheiro;
    private DinheiroDao dinheiroDao;
    private List<Dinheiro> dinheiros;
    private DefaultTableModel tabelaModelo;

    public PesquisarDinheiro() {
        initComponents();
        dinheiroDao = new DinheiroDaoImpl();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        painel_principal1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        tfData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDinheiro = new javax.swing.JTable();
        lb_nome1 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_nome4 = new javax.swing.JLabel();
        lb_nome5 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        brIrAno = new javax.swing.JButton();
        tfTotalAno = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaAno = new javax.swing.JTable();
        lb_nome9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_nome6 = new javax.swing.JLabel();
        lb_nome7 = new javax.swing.JLabel();
        tfMes = new javax.swing.JTextField();
        btIrMes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMes = new javax.swing.JTable();
        lb_nome8 = new javax.swing.JLabel();
        tfTotalMes = new javax.swing.JLabel();

        setTitle("Pesquisar Dinheiro");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Pesquisar Dinheiro Cadastrado");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Digite a data do cadastro");

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setPreferredSize(new java.awt.Dimension(90, 25));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tabelaDinheiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabelaDinheiro);

        lb_nome1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_nome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome1.setText("exemplo: 01-01-2021");

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

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_nome4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome4.setText("Total das doações por ano:");

        lb_nome5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_nome5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome5.setText("Digite o ano (somente números):");

        brIrAno.setText("ir");
        brIrAno.setMaximumSize(new java.awt.Dimension(50, 50));
        brIrAno.setMinimumSize(new java.awt.Dimension(50, 50));
        brIrAno.setPreferredSize(new java.awt.Dimension(50, 50));
        brIrAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brIrAnoActionPerformed(evt);
            }
        });

        tfTotalAno.setText(" ");

        tabelaAno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabelaAno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total"
            }
        ));
        jScrollPane3.setViewportView(tabelaAno);

        lb_nome9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_nome9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome9.setText("exemplo: 2021 | 2022");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTotalAno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nome4)
                            .addComponent(lb_nome5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brIrAno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_nome9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nome4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nome5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nome9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brIrAno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTotalAno)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_nome6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome6.setText("Total das doações por mês");

        lb_nome7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_nome7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome7.setText("Digite o mês (somente números):");

        btIrMes.setText("ir");
        btIrMes.setMaximumSize(new java.awt.Dimension(50, 50));
        btIrMes.setMinimumSize(new java.awt.Dimension(50, 50));
        btIrMes.setPreferredSize(new java.awt.Dimension(50, 50));
        btIrMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrMesActionPerformed(evt);
            }
        });

        tabelaMes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabelaMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total"
            }
        ));
        jScrollPane2.setViewportView(tabelaMes);

        lb_nome8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_nome8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome8.setText("exemplo: 01 | 02 | 03");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_nome8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nome7)
                                    .addComponent(lb_nome6))
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(tfMes))
                                .addGap(18, 18, 18)
                                .addComponent(btIrMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nome6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nome7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nome8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btIrMes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tfMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tfTotalMes.setText(" ");

        javax.swing.GroupLayout painel_principal1Layout = new javax.swing.GroupLayout(painel_principal1);
        painel_principal1.setLayout(painel_principal1Layout);
        painel_principal1Layout.setHorizontalGroup(
            painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principal1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painel_principal1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_principal1Layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_principal1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principal1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principal1Layout.createSequentialGroup()
                                .addGroup(painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfData)
                                    .addComponent(lb_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_nome1)
                                .addGap(18, 18, 18)
                                .addComponent(tfTotalMes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))))
        );
        painel_principal1Layout.setVerticalGroup(
            painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principal1Layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lb_nome)
                .addGap(18, 18, 18)
                .addGroup(painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome1)
                    .addComponent(tfTotalMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painel_principal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_principal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(painel_principal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        if (!validarCampoPesquisa()) {
            try {
                sessao = HibernateUtil.abrirConexao();
                SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy");
                Date dataFormatada = formatarData.parse(tfData.getText());

                dinheiros = dinheiroDao.pesquisarPorData(dataFormatada, sessao);

                if (dinheiros.isEmpty()) {
                    if (tabelaModelo != null) {
                        tabelaModelo.setNumRows(0);
                    }
                    JOptionPane.showMessageDialog(null, "Não houve nenhuma doação nesta data.");
                } else {
                    popularTabela();
                }
            } catch (Exception ex) {
                System.out.println("Erro ao pesquisar.");
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        int linhaSelecionada = tabelaDinheiro.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
            if (opcao == 0) {
                try {
                    sessao = HibernateUtil.abrirConexao();
                    Dinheiro dinheiroSelecionado = dinheiros.get(linhaSelecionada);
                    dinheiroDao.excluir(dinheiroSelecionado, sessao);
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                    tabelaModelo.setNumRows(0);
                    tfData.setText("");
                } catch (HibernateException e) {
                    System.out.println("Erro ao excluir" + e.getMessage());
                } finally {
                    sessao.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        int linhaSelecionada = tabelaDinheiro.getSelectedRow();

        if (linhaSelecionada >= 0) {
            Dinheiro dinheiroSelecionado = dinheiros.get(linhaSelecionada);
            new CadastrarDinheiro(dinheiroSelecionado).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btIrMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrMesActionPerformed

        if (!validarCampoMes()) {
            try {
                sessao = HibernateUtil.abrirConexao();
                SimpleDateFormat formatarData = new SimpleDateFormat("MM");
                Date dataFormatada = formatarData.parse(tfMes.getText());

                dinheiros = dinheiroDao.totalDinheiroPorMes(dataFormatada, sessao);

                if (dinheiros.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não houve nenhuma doação nesse mês");
                } else {
                    double total = 0;
                    for (Dinheiro dinheiroValor : dinheiros) {
                        total = total + dinheiroValor.getDinheiro();
                    }
                    tabelaModelo = (DefaultTableModel) tabelaMes.getModel();
                    tabelaModelo.setNumRows(0);
                    tabelaModelo.addRow(new Object[]{total});
                }
            } catch (ParseException ex) {
                System.out.println("Erro ao pesquisar o mês");
            }
        }
    }//GEN-LAST:event_btIrMesActionPerformed

    private void brIrAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brIrAnoActionPerformed
       
        if (!validarCampoAno()) {
            try {
                sessao = HibernateUtil.abrirConexao();
                SimpleDateFormat formatarData = new SimpleDateFormat("yyyy");
                Date dataFormatada = formatarData.parse(tfAno.getText());

                dinheiros = dinheiroDao.totalDinheiroPorAno(dataFormatada, sessao);

                if (dinheiros.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não houve nenhuma doação nesse ano");
                } else {
                    double total = 0;
                    for (Dinheiro dinheiroValor : dinheiros) {
                        total = total + dinheiroValor.getDinheiro();
                    }
                    tabelaModelo = (DefaultTableModel) tabelaAno.getModel();
                    tabelaModelo.setNumRows(0);
                    tabelaModelo.addRow(new Object[]{total});
                }
            } catch (ParseException ex) {
                System.out.println("Erro ao pesquisar o ano");
            }
        }
    }//GEN-LAST:event_brIrAnoActionPerformed
    
    private boolean validarCampoPesquisa() {
        String mensagem = "";
        boolean erro = false;

        String dataCompletaTela = tfData.getText().trim();

        if (dataCompletaTela.length() == 0) {
            mensagem += "Digite a data conforme solicitado";
            erro = true;
        }
        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return erro;
    }

    private boolean validarCampoMes() {
        String mensagem = "";
        boolean erro = false;

        String mesTela = tfMes.getText().trim();

        if (mesTela.length() == 0) {
            mensagem += "Digite o mês conforme solicitado";
            erro = true;
        }
        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return erro;
    }
    
    private boolean validarCampoAno() {
        String mensagem = "";
        boolean erro = false;

        String mesTela = tfAno.getText().trim();

        if (mesTela.length() == 0) {
            mensagem += "Digite o ano conforme solicitado";
            erro = true;
        }
        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return erro;
    }

    private void popularTabela() {

        tabelaModelo = (DefaultTableModel) tabelaDinheiro.getModel();
        tabelaModelo.setNumRows(0);

        SimpleDateFormat formatado = new SimpleDateFormat("dd-MM-YYYY");
        for (Dinheiro dinheiroFor : dinheiros) {
            tabelaModelo.addRow(new Object[]{formatado.format(dinheiroFor.getData()), dinheiroFor.getDinheiro()});
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
            java.util.logging.Logger.getLogger(PesquisarDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PesquisarDinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brIrAno;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btIrMes;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_nome4;
    private javax.swing.JLabel lb_nome5;
    private javax.swing.JLabel lb_nome6;
    private javax.swing.JLabel lb_nome7;
    private javax.swing.JLabel lb_nome8;
    private javax.swing.JLabel lb_nome9;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JPanel painel_principal1;
    private javax.swing.JTable tabelaAno;
    private javax.swing.JTable tabelaDinheiro;
    private javax.swing.JTable tabelaMes;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfMes;
    private javax.swing.JLabel tfTotalAno;
    private javax.swing.JLabel tfTotalMes;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
