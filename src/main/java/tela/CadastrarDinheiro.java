/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.ClienteDao;
import dao.ClienteDaoImpl;
import dao.DinheiroDao;
import dao.DinheiroDaoImpl;
import dao.HibernateUtil;
import entidade.Cliente;
import entidade.Dinheiro;
import entidade.Endereco;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Kamilla
 */
public class CadastrarDinheiro extends javax.swing.JFrame {

    private Session sessao;
    private Dinheiro dinheiro;
    private DinheiroDao dinheiroDao;
    private ClienteDao clienteDao;
    private Cliente cliente;
    private Endereco endereco;

    //novo cadastro
    public CadastrarDinheiro() {
        initComponents();
        formatarData(new Date());
        dinheiroDao = new DinheiroDaoImpl();
        clienteDao = new ClienteDaoImpl();

        if (!botaoIdentifica.isSelected()) {
            painel_Cliente.setVisible(false);
        }
    }

    //para alterar o valor do dinheiro
    public CadastrarDinheiro(Dinheiro dinheiro) {
        initComponents();
        this.dinheiro = dinheiro;
        dinheiroDao = new DinheiroDaoImpl();
        formatarData(dinheiro.getData());
        tfValor.setText(dinheiro.getDinheiro().toString());
        painel_Cliente.setVisible(false);
        btSalvar.setText("Alterar");
        titulo.setText("Alterar Dinheiro");
    }

    private void formatarData(Date data) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-yyy");
        lbDataCadastro.setText(dataFormatada.format(data));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        painel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        dataCadastro = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lbDataCadastro = new javax.swing.JLabel();
        botaoIdentifica = new javax.swing.JRadioButton();
        dataCadastro1 = new javax.swing.JLabel();
        painel_Cliente = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        lb_rg = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfRg = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lb_endereco = new javax.swing.JLabel();
        lb_rua = new javax.swing.JLabel();
        lb_numero = new javax.swing.JLabel();
        lb_cidade = new javax.swing.JLabel();
        lb_bairro = new javax.swing.JLabel();
        lb_estado = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        lb_complemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setTitle("Cadastrar Dinheiro");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro de Doação de Dinheiro");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        valor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valor.setText("Valor R$:");

        dataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataCadastro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataCadastro.setText("Data de Cadastro:");

        tfValor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbDataCadastro.setText(" ");

        botaoIdentifica.setText("Sim");
        botaoIdentifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIdentificaActionPerformed(evt);
            }
        });

        dataCadastro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataCadastro1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataCadastro1.setText("Cliente deseja se identificar?");

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        lb_cpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf.setText("Cpf:");

        lb_rg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_rg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rg.setText("RG:");

        lb_telefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_telefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_telefone.setText("Telefone:");

        lb_endereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_endereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_endereco.setText("Endereço:");

        lb_rua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_rua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rua.setText("Rua:");

        lb_numero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_numero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_numero.setText("Nº:");

        lb_cidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_cidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cidade.setText("Cidade:");

        lb_bairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_bairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bairro.setText("Bairro:");

        lb_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_estado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_estado.setText("Estado/UF:");

        lb_complemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_complemento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_complemento.setText("Complemento:");

        javax.swing.GroupLayout painel_ClienteLayout = new javax.swing.GroupLayout(painel_Cliente);
        painel_Cliente.setLayout(painel_ClienteLayout);
        painel_ClienteLayout.setHorizontalGroup(
            painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_ClienteLayout.createSequentialGroup()
                        .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_ClienteLayout.createSequentialGroup()
                                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_ClienteLayout.createSequentialGroup()
                                        .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_rua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfTelefone)
                                            .addComponent(tfRua)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_ClienteLayout.createSequentialGroup()
                                        .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painel_ClienteLayout.createSequentialGroup()
                                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lb_estado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                                            .addGroup(painel_ClienteLayout.createSequentialGroup()
                                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lb_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfBairro))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_ClienteLayout.createSequentialGroup()
                                        .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_ClienteLayout.createSequentialGroup()
                                                .addComponent(lb_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfRg))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_ClienteLayout.createSequentialGroup()
                                                .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painel_ClienteLayout.createSequentialGroup()
                                        .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfNome)))
                                .addGap(78, 78, 78))
                            .addComponent(lb_endereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(painel_ClienteLayout.createSequentialGroup()
                        .addComponent(lb_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painel_ClienteLayout.setVerticalGroup(
            painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_rg)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_telefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_endereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_rua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_numero)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_bairro)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cidade)
                    .addComponent(lb_estado)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_complemento)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setPreferredSize(new java.awt.Dimension(90, 25));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setPreferredSize(new java.awt.Dimension(90, 25));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94))
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(dataCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoIdentifica))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(dataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastro)
                    .addComponent(lbDataCadastro))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastro1)
                    .addComponent(botaoIdentifica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (!validarCampo()) {
            sessao = HibernateUtil.abrirConexao();

            if (dinheiro == null) {   //para cadastrar nova doação em dinheiro
                dinheiro = new Dinheiro(
                        Double.parseDouble(tfValor.getText()),
                        new Date());

            } else {   //para alterar o valor da doação em dinheiro
                dinheiro.setDinheiro(Double.parseDouble(tfValor.getText().trim()));
            }

            try {
                if (botaoIdentifica.isSelected()) {
                    salvarCliente();
                    dinheiro.setCliente(cliente);
                }

                dinheiroDao.salvarOuAlterar(dinheiro, sessao);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                limpar();
                this.dispose();
            } catch (HibernateException e) {
                System.out.println("Erro ao salvar!" + e.getMessage());
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void botaoIdentificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIdentificaActionPerformed

        if (botaoIdentifica.isSelected()) {
            painel_Cliente.setVisible(true);
        } else {
            painel_Cliente.setVisible(false);
        }
    }//GEN-LAST:event_botaoIdentificaActionPerformed

    public Cliente salvarCliente() {

        cliente = new Cliente(
                tfNome.getText().trim(),
                tfCpf.getText().trim(),
                tfRg.getText().trim(),
                tfTelefone.getText().trim());

        endereco = new Endereco(
                tfRua.getText().trim(),
                tfNumero.getText().trim(),
                tfBairro.getText().trim(),
                tfCidade.getText().trim(),
                tfEstado.getText().trim(),
                tfComplemento.getText().trim(),
                null);

        cliente.setEndereco(endereco);
        clienteDao.salvarOuAlterar(cliente, sessao);
        limpar();
        return cliente;
    }

    private boolean validarCampo() {

        String mensagem = "";
        boolean erro = false;
        Double valorTela = Double.parseDouble(tfValor.getText().trim());

        if (valorTela <= 0) {
            mensagem += "Digite um valor válido";
            erro = true;
        }
        if (erro) { //true
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return erro;
    }

    private void limpar() {
        tfValor.setText("");
        tfNome.setText("");
        tfCpf.setText("");
        tfRg.setText("");
        tfTelefone.setText("");
        tfRua.setText("");
        tfNumero.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfEstado.setText("");
        tfComplemento.setText("");
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
            java.util.logging.Logger.getLogger(CadastrarDinheiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarDinheiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarDinheiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarDinheiro.class
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarDinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoIdentifica;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel dataCadastro;
    private javax.swing.JLabel dataCadastro1;
    private javax.swing.JLabel lbDataCadastro;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_complemento;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_rg;
    private javax.swing.JLabel lb_rua;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JPanel painel_Cliente;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfValor;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
