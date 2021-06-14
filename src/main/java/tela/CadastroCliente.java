/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.ClienteDao;
import dao.ClienteDaoImpl;
import dao.HibernateUtil;
import entidade.Cliente;
import entidade.Endereco;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author David Roussenq Maria
 */
public class CadastroCliente extends javax.swing.JFrame {

    private Session session;
    private Cliente cliente;
    private Endereco endereco;
    private ClienteDao clienteDao;
    private String mensagem = "";

    public CadastroCliente() {
        initComponents();
        clienteDao = new ClienteDaoImpl();
    }

    CadastroCliente(Cliente clienteSelecionado) {
        initComponents();
        clienteDao = new ClienteDaoImpl();

        tfNome.setText(clienteSelecionado.getNome());
        tfCpf.setText(clienteSelecionado.getCpf());
        tfRg.setText(clienteSelecionado.getRg());
        
        /*
        
        
        if (clienteSelecionado.getTelefone() != null) {
            tfCelular.setText(clienteSelecionado.getTelefone());
        }
        if (clienteSelecionado.getEndereco().getLogradouro() != null) {
            tfRua.setText(clienteSelecionado.getEndereco().getLogradouro());
        }
        if (clienteSelecionado.getEndereco().getNumero() != null) {
            tfNumero.setText(clienteSelecionado.getEndereco().getNumero());
        }
        if (clienteSelecionado.getEndereco().getBairro() != null) {
            tfBairro.setText(clienteSelecionado.getEndereco().getBairro());
        }
        if (clienteSelecionado.getEndereco().getCidade() != null) {
            tfCidade.setText(clienteSelecionado.getEndereco().getCidade());
        }
        if (clienteSelecionado.getEndereco().getEstado() != null) {
            tfEstado.setText(clienteSelecionado.getEndereco().getEstado());
        }
        if (clienteSelecionado.getEndereco().getComplemento() != null) {
            tfComplemento.setText(cliente.getEndereco().getComplemento());
        }
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        painel_dadosPessoais = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        lb_rg = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfRg = new javax.swing.JTextField();
        tfCpf = new javax.swing.JFormattedTextField();
        tfCelular = new javax.swing.JFormattedTextField();
        painel_endereco = new javax.swing.JPanel();
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

        setTitle("Cadastro Cliente");

        painel_principal.setPreferredSize(new java.awt.Dimension(600, 500));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro de Cliente");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        painel_dadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:*");

        lb_cpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf.setText("Cpf:*");

        lb_rg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_rg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rg.setText("RG:*");

        lb_telefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_telefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_telefone.setText("Celular");

        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painel_dadosPessoaisLayout = new javax.swing.GroupLayout(painel_dadosPessoais);
        painel_dadosPessoais.setLayout(painel_dadosPessoaisLayout);
        painel_dadosPessoaisLayout.setHorizontalGroup(
            painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_rg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(tfRg, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(49, 49, 49))
        );
        painel_dadosPessoaisLayout.setVerticalGroup(
            painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_rg)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_telefone)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        painel_endereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lb_rua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_rua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rua.setText("Logradouro:");

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
        lb_estado.setText("UF:");

        lb_complemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_complemento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_complemento.setText("Complemento:");

        javax.swing.GroupLayout painel_enderecoLayout = new javax.swing.GroupLayout(painel_endereco);
        painel_endereco.setLayout(painel_enderecoLayout);
        painel_enderecoLayout.setHorizontalGroup(
            painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_enderecoLayout.createSequentialGroup()
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_enderecoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_enderecoLayout.createSequentialGroup()
                                .addComponent(lb_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfComplemento))
                            .addGroup(painel_enderecoLayout.createSequentialGroup()
                                .addComponent(lb_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_estado)
                                .addGap(18, 18, 18)
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_enderecoLayout.createSequentialGroup()
                        .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_enderecoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lb_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_enderecoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lb_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_enderecoLayout.createSequentialGroup()
                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfBairro)))))
                .addGap(57, 57, 57))
        );
        painel_enderecoLayout.setVerticalGroup(
            painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_rua)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_numero)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_bairro)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cidade)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_estado)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_dadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painel_dadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painel_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        boolean erro = validarCampo();
        if (!erro) {
            session = HibernateUtil.abrirConexao();
            cliente = new Cliente(
                    null,
                    tfNome.getText(),
                    tfCpf.getText(),
                    tfRg.getText(),
                    tfCelular.getText()
            );
            endereco = new Endereco(
                    null,
                    tfRua.getText(),
                    tfNumero.getText(),
                    tfBairro.getText(),
                    tfCidade.getText(),
                    tfEstado.getText(),
                    tfComplemento.getText()
            );
            endereco.setCliente(cliente);
            cliente.setEndereco(endereco);
            try {
                clienteDao.salvarOuAlterar(cliente, session);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                this.dispose();
            } catch (HibernateException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private boolean validarCampo() {
        mensagem = "";
        boolean erro = false;
        String nomeCliente = tfNome.getText().trim();
        if (nomeCliente.length() <= 1) {
            mensagem = "Valor inválido para nome!";
            erro = true;
        }

        String cpf = tfCpf.getText().trim();
        if (cpf.length() <= 11) {
            mensagem = "Valor inválido para CPF!";
            erro = true;
        }
        if (erro) {
            JOptionPane.showMessageDialog(null, mensagem + "\nOs campos são obrigatórios");
        }
        return erro;
    }

    private void limpar() {
        tfNome.setText("");
        tfCpf.setText("");
        tfRg.setText("");
        tfCelular.setText("");
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_complemento;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_rg;
    private javax.swing.JLabel lb_rua;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JPanel painel_dadosPessoais;
    private javax.swing.JPanel painel_endereco;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfRua;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
