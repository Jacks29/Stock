package padaria.view;

import padaria.controller.CadastraProdutoController;

public class MenuCadastraProduto extends javax.swing.JFrame {

    private MenuInicial menuInicial;
           
    public MenuCadastraProduto(MenuInicial menuInicial){
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
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldPrecoProduto = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQtdProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldDtValidade = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTemperatura = new javax.swing.JComboBox<>();
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
        jLabel1.setText("Cadastro De Produtos");

        jLabelNomeProd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeProd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeProd.setText("Nome Produto: ");

        jTextFieldNomeProduto.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldNomeProduto.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preço:");

        jFormattedTextFieldPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade:");

        jTextFieldQtdProd.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Validade:");

        try {
            jFormattedTextFieldDtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtValidade.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Temperatura a ser armazenado:");

        jComboBoxTemperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quente", "Frio", "Ambiente" }));

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraProduto(evt);
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
                        .addContainerGap()
                        .addComponent(jLabelNomeProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeProduto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTemperatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addGap(72, 72, 72)
                                .addComponent(jButtonLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar)
                                .addGap(53, 53, 53)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeProd)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldDtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void CadastraProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraProduto

        try{

            int quantidade = Integer.parseInt(jTextFieldQtdProd.getText());
            String nome = jTextFieldNomeProduto.getText();
            String dataValidade = jFormattedTextFieldDtValidade.getText();
            String temperatura = jComboBoxTemperatura.getSelectedItem().toString();
            double preco = Double.parseDouble(jFormattedTextFieldPrecoProduto.getText());
            boolean sucesso;

            CadastraProdutoController cadastroController = new CadastraProdutoController();

            sucesso = cadastroController.CadastraProduto(nome, preco, quantidade, dataValidade, temperatura);
            
            if(sucesso == true){
                jOptionPaneMensagem.showMessageDialog(null,"Cadastro efetuado com sucesso"+System.lineSeparator()+"Nome: "+nome+", Preço: R$"+preco+", Quantidade: "+quantidade+", Data de Validade: "+dataValidade+", Temperatura a ser armazenado: "+temperatura);
                this.LimpaCamposTela(evt);
            }
            else{
                jOptionPaneMensagem.showMessageDialog(null,"Os campos nao foram preenchidos corretamente");
            }

        }
        catch(Exception ex){
            jOptionPaneMensagem.showMessageDialog(null,"Erro: "+ex);
        }
    }//GEN-LAST:event_CadastraProduto

    private void LimpaCamposTela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpaCamposTela
        
        jTextFieldQtdProd.setText("");
        jTextFieldNomeProduto.setText("");
        jFormattedTextFieldDtValidade.setText("");
        jComboBoxTemperatura.setSelectedIndex(0);
        jFormattedTextFieldPrecoProduto.setText("");
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
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTemperatura;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtValidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNomeProd;
    private javax.swing.JOptionPane jOptionPaneMensagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldQtdProd;
    // End of variables declaration//GEN-END:variables
}
