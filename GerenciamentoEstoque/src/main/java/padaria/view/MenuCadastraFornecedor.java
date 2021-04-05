package padaria.view;
import padaria.controller.CadastraFornecedorController;


public class MenuCadastraFornecedor extends javax.swing.JFrame {

    private MenuInicial menuInicial;
           
    public MenuCadastraFornecedor(MenuInicial menuInicial){
        this.menuInicial = menuInicial;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPaneMensagem = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeProd = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento Vendas e Estoque Padaria Show de Pão");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                FechaJanela(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro De Fornecedor");

        jLabelNomeProd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeProd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeProd.setText("Razão Social: ");

        jTextFieldRazaoSocial.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldRazaoSocial.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço:");

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone:");

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email Contato:");

        jTextFieldEmail.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setText("Cadastrar");
        jButtonSalvar.setActionCommand("");
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(77, 31));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(77, 31));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(77, 31));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraFornecedor(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpaCamposTela(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornaMenuInicial(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNomeProd)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEndereco)
                                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEmail))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLimpar)
                                .addGap(71, 71, 71)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeProd)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastraFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraFornecedor
        try{

            String razaoSocial = jTextFieldRazaoSocial.getText();
            String endereco = jTextFieldEndereco.getText();
            String emailContato = jTextFieldEmail.getText();
            String telefone = jFormattedTextFieldTelefone.getText();
            boolean sucesso;

            CadastraFornecedorController cadastroController = new CadastraFornecedorController();

            sucesso = cadastroController.CadastraFornecedor(razaoSocial, endereco, emailContato, telefone);
            if(sucesso == true){
                jOptionPaneMensagem.showMessageDialog(null,"Cadastro efetuado com sucesso"+System.lineSeparator()+"Razao Social: "+razaoSocial+", Endereço: "+endereco+", Email Contato: "+emailContato+", Telefone: "+telefone);
                this.LimpaCamposTela(evt);
            }
            else{
                jOptionPaneMensagem.showMessageDialog(null,"Os campos nao foram preenchidos corretamente");
            }

        }
        catch(Exception ex){
            jOptionPaneMensagem.showMessageDialog(null,"Erro: "+ex);
        }
    }//GEN-LAST:event_CadastraFornecedor

    private void LimpaCamposTela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpaCamposTela

        jTextFieldRazaoSocial.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldEmail.setText("");
        jFormattedTextFieldTelefone.setText("");
    }//GEN-LAST:event_LimpaCamposTela

    private void RetornaMenuInicial(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornaMenuInicial
        
        this.dispose();
        menuInicial.setVisible(true);
    }//GEN-LAST:event_RetornaMenuInicial

    private void FechaJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FechaJanela
        
        this.dispose();
        menuInicial.setVisible(true);
    }//GEN-LAST:event_FechaJanela

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
            java.util.logging.Logger.getLogger(MenuCadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastraFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNomeProd;
    private javax.swing.JOptionPane jOptionPaneMensagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
