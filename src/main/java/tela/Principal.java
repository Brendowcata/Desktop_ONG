/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

/**
 *
 * @author Jhony Vill da Silva.
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        if (!UsuarioLogado.getPerfil().equals("Administrador")) {
            painel_administrador.setVisible(false);
            menuUsuarios.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        painel_cadastros = new javax.swing.JPanel();
        btNovoEmprestimo = new javax.swing.JButton();
        btNovoCliente = new javax.swing.JButton();
        btNovoEquipamento = new javax.swing.JButton();
        lbCadastros = new javax.swing.JLabel();
        lbSair = new javax.swing.JLabel();
        painel_doacoes = new javax.swing.JPanel();
        btDoacaoDinheiro1 = new javax.swing.JButton();
        btDoacaoEquipamento1 = new javax.swing.JButton();
        lbDoacoes = new javax.swing.JLabel();
        painel_pesquisas = new javax.swing.JPanel();
        btPesquisarCliente = new javax.swing.JButton();
        btPesquisarEquipamento = new javax.swing.JButton();
        btPesquisarEmprestimo = new javax.swing.JButton();
        lbPesquisas = new javax.swing.JLabel();
        painel_administrador = new javax.swing.JPanel();
        btPesquisarFaturamento = new javax.swing.JButton();
        btNovoUsuario = new javax.swing.JButton();
        btGerenciarUsuarios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novoCliente = new javax.swing.JMenuItem();
        novoEquipamento = new javax.swing.JMenuItem();
        novoEmprestimo = new javax.swing.JMenuItem();
        pesquisar = new javax.swing.JMenu();
        pesquisarCliente = new javax.swing.JMenuItem();
        pesquisarEquipamento = new javax.swing.JMenuItem();
        pesquisarEmprestimo = new javax.swing.JMenuItem();
        pesquisaFaturamento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        doacaoDinheiro = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        novoUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema ONG");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Desktop ONG");
        lbTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        painel_cadastros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNovoEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/novo_emprestimo_64.png"))); // NOI18N
        btNovoEmprestimo.setText("Novo Empréstimo");
        btNovoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoEmprestimoActionPerformed(evt);
            }
        });

        btNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/novo_cliente_64.png"))); // NOI18N
        btNovoCliente.setText("Novo Cliente");
        btNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoClienteActionPerformed(evt);
            }
        });

        btNovoEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/novo_equipamento_64.png"))); // NOI18N
        btNovoEquipamento.setText("Novo Equipamento");
        btNovoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoEquipamentoActionPerformed(evt);
            }
        });

        lbCadastros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCadastros.setText("Cadastros");
        lbCadastros.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout painel_cadastrosLayout = new javax.swing.GroupLayout(painel_cadastros);
        painel_cadastros.setLayout(painel_cadastrosLayout);
        painel_cadastrosLayout.setHorizontalGroup(
            painel_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCadastros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_cadastrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNovoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btNovoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovoEquipamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        painel_cadastrosLayout.setVerticalGroup(
            painel_cadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastrosLayout.createSequentialGroup()
                .addComponent(lbCadastros)
                .addGap(13, 13, 13)
                .addComponent(btNovoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btNovoEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btNovoEmprestimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/fechar.png"))); // NOI18N
        lbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairMouseClicked(evt);
            }
        });

        painel_doacoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btDoacaoDinheiro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/doacao_dinheiro_64.png"))); // NOI18N
        btDoacaoDinheiro1.setText("  Doação Dinheiro");
        btDoacaoDinheiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoacaoDinheiro1ActionPerformed(evt);
            }
        });

        btDoacaoEquipamento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/doacao_equipamento_64.png"))); // NOI18N
        btDoacaoEquipamento1.setText("Doação Equipamento");
        btDoacaoEquipamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoacaoEquipamento1ActionPerformed(evt);
            }
        });

        lbDoacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDoacoes.setText("Doações");
        lbDoacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout painel_doacoesLayout = new javax.swing.GroupLayout(painel_doacoes);
        painel_doacoes.setLayout(painel_doacoesLayout);
        painel_doacoesLayout.setHorizontalGroup(
            painel_doacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDoacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_doacoesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painel_doacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDoacaoEquipamento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDoacaoDinheiro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        painel_doacoesLayout.setVerticalGroup(
            painel_doacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_doacoesLayout.createSequentialGroup()
                .addComponent(lbDoacoes)
                .addGap(56, 56, 56)
                .addComponent(btDoacaoDinheiro1)
                .addGap(18, 18, 18)
                .addComponent(btDoacaoEquipamento1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_pesquisas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/pesquisa_cliente_64.png"))); // NOI18N
        btPesquisarCliente.setText("Pesquisar Cliente");
        btPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarClienteActionPerformed(evt);
            }
        });

        btPesquisarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/pesquisa_equipamento_64.png"))); // NOI18N
        btPesquisarEquipamento.setText("Pesquisar Equipamento");
        btPesquisarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarEquipamentoActionPerformed(evt);
            }
        });

        btPesquisarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/pesquisa_emprestimo_64.png"))); // NOI18N
        btPesquisarEmprestimo.setText("Pesquisar Empréstimo");
        btPesquisarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarEmprestimoActionPerformed(evt);
            }
        });

        lbPesquisas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPesquisas.setText("Pesquisas");
        lbPesquisas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout painel_pesquisasLayout = new javax.swing.GroupLayout(painel_pesquisas);
        painel_pesquisas.setLayout(painel_pesquisasLayout);
        painel_pesquisasLayout.setHorizontalGroup(
            painel_pesquisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_pesquisasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painel_pesquisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPesquisarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPesquisarEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(lbPesquisas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_pesquisasLayout.setVerticalGroup(
            painel_pesquisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_pesquisasLayout.createSequentialGroup()
                .addComponent(lbPesquisas)
                .addGap(13, 13, 13)
                .addComponent(btPesquisarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisarEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisarEmprestimo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        painel_administrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btPesquisarFaturamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/pesquisa_faturamento_64.png"))); // NOI18N
        btPesquisarFaturamento.setText("Pesquisar Faturamento");
        btPesquisarFaturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarFaturamentoActionPerformed(evt);
            }
        });

        btNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/novo_usuario_64.png"))); // NOI18N
        btNovoUsuario.setText("Novo Usuário");
        btNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoUsuarioActionPerformed(evt);
            }
        });

        btGerenciarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/gerenciar_usuarios_64.png"))); // NOI18N
        btGerenciarUsuarios.setText("Gerenciar Usuários");
        btGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_administradorLayout = new javax.swing.GroupLayout(painel_administrador);
        painel_administrador.setLayout(painel_administradorLayout);
        painel_administradorLayout.setHorizontalGroup(
            painel_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_administradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGerenciarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btPesquisarFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painel_administradorLayout.setVerticalGroup(
            painel_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_administradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_administradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoUsuario)
                    .addComponent(btPesquisarFaturamento)
                    .addComponent(btGerenciarUsuarios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                        .addComponent(painel_cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painel_pesquisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(lbSair))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(painel_doacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(206, 206, 206))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painel_administrador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel_doacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_pesquisas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_cadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(painel_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lbSair)
                .addContainerGap())
        );

        jMenu1.setText("Cadastro");

        novoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        novoCliente.setText("Novo Cliente");
        novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(novoCliente);

        novoEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        novoEquipamento.setText("Novo Equipamento");
        novoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoEquipamentoActionPerformed(evt);
            }
        });
        jMenu1.add(novoEquipamento);

        novoEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        novoEmprestimo.setText("Novo Empréstimo");
        novoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoEmprestimoActionPerformed(evt);
            }
        });
        jMenu1.add(novoEmprestimo);

        jMenuBar1.add(jMenu1);

        pesquisar.setText("Pesquisar");

        pesquisarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        pesquisarCliente.setText("Pesquisar Cliente");
        pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteActionPerformed(evt);
            }
        });
        pesquisar.add(pesquisarCliente);

        pesquisarEquipamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        pesquisarEquipamento.setText("Pesquisar Equipamento");
        pesquisarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarEquipamentoActionPerformed(evt);
            }
        });
        pesquisar.add(pesquisarEquipamento);

        pesquisarEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        pesquisarEmprestimo.setText("Pesquisar Empréstimo");
        pesquisarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarEmprestimoActionPerformed(evt);
            }
        });
        pesquisar.add(pesquisarEmprestimo);

        pesquisaFaturamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        pesquisaFaturamento.setText("Pesquisar Faturamento");
        pesquisaFaturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaFaturamentoActionPerformed(evt);
            }
        });
        pesquisar.add(pesquisaFaturamento);

        jMenuBar1.add(pesquisar);

        jMenu2.setText("Doação");

        doacaoDinheiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        doacaoDinheiro.setText("Doação Dinheiro");
        doacaoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doacaoDinheiroActionPerformed(evt);
            }
        });
        jMenu2.add(doacaoDinheiro);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Doação Equipamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        menuUsuarios.setText("Usuários");

        novoUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        novoUsuario.setText("Novo Usuário");
        novoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(novoUsuario);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setText("Gerenciar Usuários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem1);

        jMenuBar1.add(menuUsuarios);

        sair.setMnemonic('s');
        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        dispose();
    }//GEN-LAST:event_sairMouseClicked

    private void novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_novoClienteActionPerformed

    private void novoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoEquipamentoActionPerformed
        new CadastroEquipamento().setVisible(true);
    }//GEN-LAST:event_novoEquipamentoActionPerformed

    private void novoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoEmprestimoActionPerformed
        new CadastroEmprestimo().setVisible(true);
    }//GEN-LAST:event_novoEmprestimoActionPerformed

    private void pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteActionPerformed
        new PesquisaCliente().setVisible(true);
    }//GEN-LAST:event_pesquisarClienteActionPerformed

    private void pesquisarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarEmprestimoActionPerformed
         new PesquisarEmprestimo().setVisible(true);
    }//GEN-LAST:event_pesquisarEmprestimoActionPerformed

    private void pesquisarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarEquipamentoActionPerformed
        new PesquisarEquipamento().setVisible(true);
    }//GEN-LAST:event_pesquisarEquipamentoActionPerformed

    private void pesquisaFaturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaFaturamentoActionPerformed
        new PesquisarDinheiro().setVisible(true);
    }//GEN-LAST:event_pesquisaFaturamentoActionPerformed

    private void lbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseClicked
        dispose();
    }//GEN-LAST:event_lbSairMouseClicked

    private void btNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoClienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_btNovoClienteActionPerformed

    private void btNovoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoEquipamentoActionPerformed
        new CadastroEquipamento().setVisible(true);
    }//GEN-LAST:event_btNovoEquipamentoActionPerformed

    private void btNovoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoEmprestimoActionPerformed
        new CadastroEmprestimo().setVisible(true);
    }//GEN-LAST:event_btNovoEmprestimoActionPerformed

    private void btNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoUsuarioActionPerformed
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_btNovoUsuarioActionPerformed

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed
        new PesquisaCliente().setVisible(true);
    }//GEN-LAST:event_btPesquisarClienteActionPerformed

    private void btPesquisarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarEquipamentoActionPerformed
         new PesquisarEquipamento().setVisible(true);
    }//GEN-LAST:event_btPesquisarEquipamentoActionPerformed

    private void btPesquisarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarEmprestimoActionPerformed
        new PesquisarEmprestimo().setVisible(true);
    }//GEN-LAST:event_btPesquisarEmprestimoActionPerformed

    private void btPesquisarFaturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarFaturamentoActionPerformed
        new PesquisarDinheiro().setVisible(true);
    }//GEN-LAST:event_btPesquisarFaturamentoActionPerformed

    private void btDoacaoDinheiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoacaoDinheiro1ActionPerformed
        new CadastrarDinheiro().setVisible(true);
    }//GEN-LAST:event_btDoacaoDinheiro1ActionPerformed

    private void btDoacaoEquipamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoacaoEquipamento1ActionPerformed
        new DoacaoEquipamento().setVisible(true);
    }//GEN-LAST:event_btDoacaoEquipamento1ActionPerformed

    private void doacaoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doacaoDinheiroActionPerformed
        new CadastrarDinheiro().setVisible(true);
    }//GEN-LAST:event_doacaoDinheiroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new DoacaoEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void novoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioActionPerformed
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_novoUsuarioActionPerformed

    private void btGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenciarUsuariosActionPerformed
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_btGerenciarUsuariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoacaoDinheiro1;
    private javax.swing.JButton btDoacaoEquipamento1;
    private javax.swing.JButton btGerenciarUsuarios;
    private javax.swing.JButton btNovoCliente;
    private javax.swing.JButton btNovoEmprestimo;
    private javax.swing.JButton btNovoEquipamento;
    private javax.swing.JButton btNovoUsuario;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btPesquisarEmprestimo;
    private javax.swing.JButton btPesquisarEquipamento;
    private javax.swing.JButton btPesquisarFaturamento;
    private javax.swing.JMenuItem doacaoDinheiro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbCadastros;
    private javax.swing.JLabel lbDoacoes;
    private javax.swing.JLabel lbPesquisas;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenuItem novoCliente;
    private javax.swing.JMenuItem novoEmprestimo;
    private javax.swing.JMenuItem novoEquipamento;
    private javax.swing.JMenuItem novoUsuario;
    private javax.swing.JPanel painel_administrador;
    private javax.swing.JPanel painel_cadastros;
    private javax.swing.JPanel painel_doacoes;
    private javax.swing.JPanel painel_pesquisas;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JMenuItem pesquisaFaturamento;
    private javax.swing.JMenu pesquisar;
    private javax.swing.JMenuItem pesquisarCliente;
    private javax.swing.JMenuItem pesquisarEmprestimo;
    private javax.swing.JMenuItem pesquisarEquipamento;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
