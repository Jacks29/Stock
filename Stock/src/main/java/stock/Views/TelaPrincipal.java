
//<editor-fold defaultstate="collapsed" desc="Java Imports and packages">

package stock.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import stock.AreaComum;
import stock.Controllers.LoginController;

//</editor-fold>

public class TelaPrincipal extends javax.swing.JFrame {
    
    private AreaComum areacomum= new AreaComum();
    private TelaLogin menulogin;
    private Timer timer;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        relogio = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProdutos = new javax.swing.JMenu();
        menuCadProd = new javax.swing.JMenuItem();
        menuEditProdutos = new javax.swing.JMenuItem();
        menuDelProdutos = new javax.swing.JMenuItem();
        menuFornecedor = new javax.swing.JMenu();
        menuCadFornecedor = new javax.swing.JMenuItem();
        menuEditFornecedor = new javax.swing.JMenuItem();
        menuDelFornecedor = new javax.swing.JMenuItem();
        menuUnidade = new javax.swing.JMenu();
        menuCadUnidade = new javax.swing.JMenuItem();
        menuEditUnidade = new javax.swing.JMenuItem();
        menuDelUnidade = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuCadVenda = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuCadUsuario = new javax.swing.JMenuItem();
        menuEditUsuarios = new javax.swing.JMenuItem();
        menuDelUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock - Gerenciamento de estoques e vendas");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/Logo.png"))); // NOI18N

        relogio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        relogio.setText("jLabel2");

        data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        data.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(relogio)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relogio)
                    .addComponent(data))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeLogout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogaSistema(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUsuario.setText("usuario");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeUsuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelUsuario)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeProdutos.png"))); // NOI18N
        menuProdutos.setText("Produtos");

        menuCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeCadastrar.png"))); // NOI18N
        menuCadProd.setText("Cadastrar Produtos");
        menuCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreMenuCadPodutos(evt);
            }
        });
        menuProdutos.add(menuCadProd);

        menuEditProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeEditar.png"))); // NOI18N
        menuEditProdutos.setText("Editar Produtos");
        menuEditProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreMenuEditarProdutos(evt);
            }
        });
        menuProdutos.add(menuEditProdutos);

        menuDelProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeDeletar.png"))); // NOI18N
        menuDelProdutos.setText("Deletar Produtos");
        menuDelProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreMenuDelProdutos(evt);
            }
        });
        menuProdutos.add(menuDelProdutos);

        jMenuBar1.add(menuProdutos);

        menuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeFornecedor.png"))); // NOI18N
        menuFornecedor.setText("Fornecedores");

        menuCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeCadastrar.png"))); // NOI18N
        menuCadFornecedor.setText("Cadastrar Fornecedores");
        menuCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbreMenuCadFornecedeor(evt);
            }
        });
        menuFornecedor.add(menuCadFornecedor);

        menuEditFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeEditar.png"))); // NOI18N
        menuEditFornecedor.setText("Editar Fornecedores");
        menuEditFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbreMenuEditarFornecedor(evt);
            }
        });
        menuFornecedor.add(menuEditFornecedor);

        menuDelFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeDeletar.png"))); // NOI18N
        menuDelFornecedor.setText("Deletar Fornecedores");
        menuFornecedor.add(menuDelFornecedor);

        jMenuBar1.add(menuFornecedor);

        menuUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeUnidade.png"))); // NOI18N
        menuUnidade.setText("Unidades");

        menuCadUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeCadastrar.png"))); // NOI18N
        menuCadUnidade.setText("Cadastrar Unidade");
        menuCadUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbreMenuCadUnidade(evt);
            }
        });
        menuUnidade.add(menuCadUnidade);

        menuEditUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeEditar.png"))); // NOI18N
        menuEditUnidade.setText("Editar Unidade");
        menuUnidade.add(menuEditUnidade);

        menuDelUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeDeletar.png"))); // NOI18N
        menuDelUnidade.setText("Deletar Unidade");
        menuUnidade.add(menuDelUnidade);

        jMenuBar1.add(menuUnidade);

        menuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeVenda.png"))); // NOI18N
        menuVenda.setText("Vendas");
        menuVenda.setToolTipText("");

        menuCadVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeCadastrar.png"))); // NOI18N
        menuCadVenda.setText("Cadastrar Venda");
        menuVenda.add(menuCadVenda);

        jMenuBar1.add(menuVenda);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeUsuarios.png"))); // NOI18N
        menuUsuario.setText("Usuários");

        menuCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeCadastrar.png"))); // NOI18N
        menuCadUsuario.setText("Cadastrar Usuario");
        menuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbreMenuCadUsuario(evt);
            }
        });
        menuUsuario.add(menuCadUsuario);

        menuEditUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeEditar.png"))); // NOI18N
        menuEditUsuarios.setText("Editar Usuario");
        menuUsuario.add(menuEditUsuarios);

        menuDelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/Views/iconeDeletar.png"))); // NOI18N
        menuDelUsuario.setText("Deletar Usuario");
        menuUsuario.add(menuDelUsuario);

        jMenuBar1.add(menuUsuario);

        setJMenuBar(jMenuBar1);

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
      
    //<editor-fold defaultstate="collapsed" desc="Methods">  
    
    public TelaPrincipal(TelaLogin menulogin) {
        this.menulogin = menulogin;              
        initComponents();
        labelUsuario.setText("Bem Vindo, " + areacomum.NomeUsuario);
        
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Time in 24Hrs Format
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String time = timeFormat.format(date);
                relogio.setText(time);
                
                Date date2 = new Date();
                DateFormat timeFormat2 = new SimpleDateFormat("dd/MM/yyyy");
                String time2 = timeFormat2.format(date2);
                data.setText(time2);
            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }
    
    private void abreMenuCadPodutos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreMenuCadPodutos
        // TODO add your handling code here:
        TelaCadProdutos menuCadProdutos = new TelaCadProdutos(this);
        this.setVisible(false);
        menuCadProdutos.setVisible(true);
    }//GEN-LAST:event_abreMenuCadPodutos

    private void deslogaSistema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogaSistema
        // TODO add your handling code here:   
        LoginController controller = new LoginController();
        controller.Desloga();
        this.dispose();
        menulogin.setVisible(true);      
    }//GEN-LAST:event_deslogaSistema

    private void abreMenuEditarProdutos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreMenuEditarProdutos
        // TODO add your handling code here:
        TelaEditProdutos menuEditProdutos = new TelaEditProdutos(this);
        this.setVisible(false);
        menuEditProdutos.setVisible(true);
    }//GEN-LAST:event_abreMenuEditarProdutos

    private void abreMenuDelProdutos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreMenuDelProdutos
        // TODO add your handling code here:
        TelaDelProduto menuDelProdutos = new TelaDelProduto(this);
        this.setVisible(false);
        menuDelProdutos.setVisible(true);
    }//GEN-LAST:event_abreMenuDelProdutos

    private void AbreMenuCadFornecedeor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbreMenuCadFornecedeor
        // TODO add your handling code here:
        TelaCadFornecedor menuCadFornecedor = new TelaCadFornecedor(this);
        this.setVisible(false);
        menuCadFornecedor.setVisible(true);       
    }//GEN-LAST:event_AbreMenuCadFornecedeor

    private void AbreMenuEditarFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbreMenuEditarFornecedor
        // TODO add your handling code here:
        TelaEditFornecedor menuEditFornecedor = new TelaEditFornecedor(this);
        this.setVisible(false);
        menuEditFornecedor.setVisible(true);
    }//GEN-LAST:event_AbreMenuEditarFornecedor

    private void AbreMenuCadUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbreMenuCadUsuario
        // TODO add your handling code here:
        TelaCadUsuario menuCadUsuario = new TelaCadUsuario(this);
        this.setVisible(false);
        menuCadUsuario.setVisible(true);
    }//GEN-LAST:event_AbreMenuCadUsuario

    private void AbreMenuCadUnidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbreMenuCadUnidade
        // TODO add your handling code here:
        TelaCadUnidade menuCadUnidade = new TelaCadUnidade(this);
        this.setVisible(false);
        menuCadUnidade.setVisible(true);       
    }//GEN-LAST:event_AbreMenuCadUnidade

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
     
    //</editor-fold>
             
    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JMenuItem menuCadFornecedor;
    private javax.swing.JMenuItem menuCadProd;
    private javax.swing.JMenuItem menuCadUnidade;
    private javax.swing.JMenuItem menuCadUsuario;
    private javax.swing.JMenuItem menuCadVenda;
    private javax.swing.JMenuItem menuDelFornecedor;
    private javax.swing.JMenuItem menuDelProdutos;
    private javax.swing.JMenuItem menuDelUnidade;
    private javax.swing.JMenuItem menuDelUsuario;
    private javax.swing.JMenuItem menuEditFornecedor;
    private javax.swing.JMenuItem menuEditProdutos;
    private javax.swing.JMenuItem menuEditUnidade;
    private javax.swing.JMenuItem menuEditUsuarios;
    private javax.swing.JMenu menuFornecedor;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuUnidade;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JLabel relogio;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
