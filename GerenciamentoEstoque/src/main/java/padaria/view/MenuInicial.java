package padaria.view;

public class MenuInicial extends javax.swing.JFrame {

    private MenuLogin menulogin;
    
    public MenuInicial(MenuLogin menulogin){
        this.menulogin = menulogin;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBarMenuPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemCadFornecedor = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemDeslogar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento Vendas e Estoque Padaria Show de Pão");
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
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

        jMenuBarMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBarMenuPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItemCadProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemCadProduto.setText("Cadastra Produto");
        jMenuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadProduto);

        jMenuItemCadFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItemCadFornecedor.setText("Cadastra Fornecedor");
        jMenuItemCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFornecedor);

        jMenuBarMenuPrincipal.add(jMenuCadastro);

        jMenuUsuario.setText("Usuario");

        jMenuItemDeslogar.setText("Deslogar");
        jMenuItemDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Desloga(evt);
            }
        });
        jMenuUsuario.add(jMenuItemDeslogar);

        jMenuBarMenuPrincipal.add(jMenuUsuario);

        setJMenuBar(jMenuBarMenuPrincipal);

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

        getAccessibleContext().setAccessibleName("Gerenciamento de Estoque Padarias Show de Pao");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutoActionPerformed
       
        MenuCadastraProduto menuCadProd = new MenuCadastraProduto(this);
        this.setVisible(false);
        menuCadProd.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadProdutoActionPerformed

    private void jMenuItemCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFornecedorActionPerformed
        // TODO add your handling code here:
        MenuCadastraFornecedor menuCadForne = new MenuCadastraFornecedor(this);
        this.setVisible(false);
        menuCadForne.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadFornecedorActionPerformed

    private void Desloga(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Desloga
        // TODO add your handling code here:
        this.dispose();
        menulogin.setVisible(true);
    }//GEN-LAST:event_Desloga

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarMenuPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadFornecedor;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemDeslogar;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
