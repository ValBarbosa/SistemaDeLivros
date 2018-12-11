package VisaoExcluir;

import DAO.CategoriaDAO;
import DAO.Conexao;
import Modelo.Categoria;
import Principal.Menu;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExcluirCategoria extends javax.swing.JFrame {
    
    public ExcluirCategoria() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        setTitle("Deletar Categoria");
        AtualizarCombo();
    }
    private void AtualizarCombo(){
    Connection con = Conexao.AbrirConexao();
    CategoriaDAO sql = new CategoriaDAO(con);
    List<Categoria> lista = new ArrayList<>();
    lista =  sql.ListarComboCategoria();
    for(Categoria c : lista){
       ComboCategoria.addItem(c.getCategoria()); 
    }
    Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        IdCategoria = new javax.swing.JTextField();
        ComboCategoria = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        deletar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(35, 126, 51, 31);

        IdCategoria.setEnabled(false);
        IdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(IdCategoria);
        IdCategoria.setBounds(98, 126, 63, 31);

        ComboCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboCategoria.setMaximumRowCount(100);
        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Categoria" }));
        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(ComboCategoria);
        ComboCategoria.setBounds(168, 126, 373, 31);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Deletar Categoria");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 580, 80);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        deletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        jPanel4.add(deletar);
        deletar.setBounds(92, 13, 147, 49);

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cancelar);
        cancelar.setBounds(330, 10, 180, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 217, 580, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nova7.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 80, 580, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
       Connection con = Conexao.AbrirConexao();
    CategoriaDAO sql = new CategoriaDAO(con);
    List<Categoria> lista = new ArrayList<>();
    String nome = ComboCategoria.getSelectedItem().toString();
    
    lista = sql.ConsultaCodigoCategoria(nome);
    
    for(Categoria c: lista){
        int a = c.getId();
        IdCategoria.setText("" + a);    
    }
    Conexao.FecharConexao(con);  
    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
 new Menu().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_cancelarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
    String codigo = IdCategoria.getText();
    String nome = ComboCategoria.getSelectedItem().toString();
    
    Connection con = Conexao.AbrirConexao();
    CategoriaDAO sql = new CategoriaDAO(con);
    Categoria a = new Categoria();
    
    if(nome.equals("")){
        JOptionPane.showMessageDialog(null,"Nenhum Nome Selecionado","Video Locadora",JOptionPane.WARNING_MESSAGE);
    }else{
        int b = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir?"+"\n ("+codigo+")("+nome+")","Video Locadora"
        ,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(b == 0){
            int cod = Integer.parseInt(codigo);
            a.setCategoria(nome);
            a.setId(cod);
            sql.ExcluirCategoria(a);
            Conexao.FecharConexao(con);
           
        }
    }new Menu().setVisible(true);
        dispose();
    
    }//GEN-LAST:event_deletarActionPerformed

    private void IdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdCategoriaActionPerformed
    
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
            java.util.logging.Logger.getLogger(ExcluirCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ExcluirCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JTextField IdCategoria;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
