/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author samue
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMCadastro = new javax.swing.JMenu();
        JMICliente = new javax.swing.JMenuItem();
        JMIFornecedor = new javax.swing.JMenuItem();
        JMIFuncionario = new javax.swing.JMenuItem();
        JMVendaCompra = new javax.swing.JMenu();
        JMIVender = new javax.swing.JMenuItem();
        JMIComprar = new javax.swing.JMenuItem();
        JMGerenciar = new javax.swing.JMenu();
        JMGerenciarCliente = new javax.swing.JMenuItem();
        JMGerenciarFornecedores = new javax.swing.JMenuItem();
        JMGerenciarFuncionarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Provisório");
        setBackground(new java.awt.Color(255, 255, 0));
        setMinimumSize(new java.awt.Dimension(960, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Passarinho Móveis Planejados");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Downloads\\bird (2).png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(212, 212, 212))
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(200, 40));

        JMCadastro.setForeground(new java.awt.Color(0, 0, 0));
        JMCadastro.setText("Cadastro");
        JMCadastro.setPreferredSize(new java.awt.Dimension(63, 40));

        JMICliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMICliente.setText("Cliente");
        JMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIClienteActionPerformed(evt);
            }
        });
        JMCadastro.add(JMICliente);

        JMIFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMIFornecedor.setText("Fornecedor");
        JMIFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIFornecedorActionPerformed(evt);
            }
        });
        JMCadastro.add(JMIFornecedor);

        JMIFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMIFuncionario.setText("Funcionário");
        JMIFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIFuncionarioActionPerformed(evt);
            }
        });
        JMCadastro.add(JMIFuncionario);

        jMenuBar1.add(JMCadastro);

        JMVendaCompra.setText("Vender/Comprar");

        JMIVender.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        JMIVender.setText("Vender");
        JMIVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIVenderActionPerformed(evt);
            }
        });
        JMVendaCompra.add(JMIVender);

        JMIComprar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        JMIComprar.setText("Comprar");
        JMVendaCompra.add(JMIComprar);

        jMenuBar1.add(JMVendaCompra);

        JMGerenciar.setForeground(new java.awt.Color(0, 0, 0));
        JMGerenciar.setText("Gerenciar");

        JMGerenciarCliente.setForeground(new java.awt.Color(0, 0, 0));
        JMGerenciarCliente.setText("Clientes");
        JMGerenciar.add(JMGerenciarCliente);

        JMGerenciarFornecedores.setForeground(new java.awt.Color(0, 0, 0));
        JMGerenciarFornecedores.setText("Fornecedores");
        JMGerenciar.add(JMGerenciarFornecedores);

        JMGerenciarFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        JMGerenciarFuncionarios.setText("Funcionários");
        JMGerenciar.add(JMGerenciarFuncionarios);

        jMenuBar1.add(JMGerenciar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIClienteActionPerformed

    private void JMIFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIFornecedorActionPerformed

    private void JMIVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIVenderActionPerformed

    private void JMIFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIFuncionarioActionPerformed
        CadFunc cadFunc = new CadFunc();
        cadFunc.setVisible(true);

        dispose();
    }//GEN-LAST:event_JMIFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMCadastro;
    private javax.swing.JMenu JMGerenciar;
    private javax.swing.JMenuItem JMGerenciarCliente;
    private javax.swing.JMenuItem JMGerenciarFornecedores;
    private javax.swing.JMenuItem JMGerenciarFuncionarios;
    private javax.swing.JMenuItem JMICliente;
    private javax.swing.JMenuItem JMIComprar;
    private javax.swing.JMenuItem JMIFornecedor;
    private javax.swing.JMenuItem JMIFuncionario;
    private javax.swing.JMenuItem JMIVender;
    private javax.swing.JMenu JMVendaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
