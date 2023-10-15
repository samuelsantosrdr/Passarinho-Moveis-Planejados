/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.FuncionarioDAO;
import DTO.Funcionario;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samue
 */
public class ListarFunc extends javax.swing.JFrame {

    /**
     * Creates new form ListarFunc
     */
    public ListarFunc() {
        initComponents();
        listarFuncionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTListarFuncionario = new javax.swing.JTable();
        BTNEditarFunc = new javax.swing.JButton();
        BTNExcluirFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTListarFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        JTListarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Email", "Cargo", "Dt. Admissao", "Situacao", "Telefone", "Salario", "Senha", "CEP", "Rua", "Cidade", "Numero", "Bairro", "Estado"

            }
        ));
        jScrollPane1.setViewportView(JTListarFuncionario);

        BTNEditarFunc.setForeground(new java.awt.Color(0, 0, 0));
        BTNEditarFunc.setText("Editar Funcionario");
        BTNEditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEditarFuncActionPerformed(evt);
            }
        });

        BTNExcluirFunc.setForeground(new java.awt.Color(0, 0, 0));
        BTNExcluirFunc.setText("Excluir Funcionário");
        BTNExcluirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNExcluirFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNEditarFunc)
                .addGap(27, 27, 27)
                .addComponent(BTNExcluirFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNEditarFunc)
                    .addComponent(BTNExcluirFunc))
                .addGap(0, 86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNEditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEditarFuncActionPerformed
        editarFunc();

    }//GEN-LAST:event_BTNEditarFuncActionPerformed

    private void BTNExcluirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNExcluirFuncActionPerformed
         excluirFuncionario();
         listarFuncionario();
    }//GEN-LAST:event_BTNExcluirFuncActionPerformed

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
            java.util.logging.Logger.getLogger(ListarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEditarFunc;
    private javax.swing.JButton BTNExcluirFunc;
    private javax.swing.JTable JTListarFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void listarFuncionario() {
        
        try {
            FuncionarioDAO funcDAO = new FuncionarioDAO();
            
            DefaultTableModel model = (DefaultTableModel) JTListarFuncionario.getModel();
            model.setNumRows(0);
            
            ArrayList<Funcionario> lista = funcDAO.listarFuncionario();
            
            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNomeCompleto(),
                    lista.get(i).getCpf(),
                    lista.get(i).getEmail(),
                    lista.get(i).getCargo(),
                    lista.get(i).getDtAdmissao(),
                    lista.get(i).isSituacao(),
                    lista.get(i).getTelefone(),
                    lista.get(i).getSalario(),
                    lista.get(i).getSenha(),
                    lista.get(i).getCep(),
                    lista.get(i).getRua(),
                    lista.get(i).getCidade(),
                    lista.get(i).getNumero(),
                    lista.get(i).getBairro(),
                    lista.get(i).getEstado()
                
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "listar func " + e);
        }
    }
    
    private void editarFunc() {
        CadFunc CD = new CadFunc();
        
        int linha = JTListarFuncionario.getSelectedRow();
        
        CD.setID(JTListarFuncionario.getModel().getValueAt(linha, 0).toString());
        CD.setNome(JTListarFuncionario.getModel().getValueAt(linha, 1).toString());
        CD.setCPF(JTListarFuncionario.getModel().getValueAt(linha, 2).toString());
        CD.setEmail(JTListarFuncionario.getModel().getValueAt(linha, 3).toString());
        CD.setCargo(JTListarFuncionario.getModel().getValueAt(linha, 4).toString());
        CD.setDtAdmissao(JTListarFuncionario.getModel().getValueAt(linha, 5).toString());
        CD.setSituacao(JTListarFuncionario.getModel().getValueAt(linha, 6).toString());
        CD.setTelefone(JTListarFuncionario.getModel().getValueAt(linha, 7).toString());
        CD.setSalario(JTListarFuncionario.getModel().getValueAt(linha, 8).toString());
        CD.setSenha(JTListarFuncionario.getModel().getValueAt(linha, 9).toString());
        CD.setCEP(JTListarFuncionario.getModel().getValueAt(linha, 10).toString());
        CD.setRua(JTListarFuncionario.getModel().getValueAt(linha, 11).toString());
        CD.setCidade(JTListarFuncionario.getModel().getValueAt(linha, 12).toString());
        CD.setNumero(JTListarFuncionario.getModel().getValueAt(linha, 13).toString());
        CD.setBairro(JTListarFuncionario.getModel().getValueAt(linha, 14).toString());
        CD.setEstado(JTListarFuncionario.getModel().getValueAt(linha, 15).toString());
        
        CD.setVisible(true);
        
      JButton botao = new JButton("Finalizar Edição"); 
      CD.addBotao(botao);
      
        
        
    }
    
    private void excluirFuncionario(){
        int id;
        int linha = JTListarFuncionario.getSelectedRow();
        
        id = Integer.parseInt(JTListarFuncionario.getModel().getValueAt(linha, 0).toString());
        
        Funcionario func = new Funcionario();
        func.setId(id);
        
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        funcDAO.excluirFuncionario(func);
    }
}