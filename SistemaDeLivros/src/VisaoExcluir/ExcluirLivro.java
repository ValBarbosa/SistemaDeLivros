package VisaoExcluir;

import DAO.CategoriaDAO;
import DAO.Conexao;
import DAO.LivroDAO;
import Modelo.Categoria;
import Modelo.Livro;
import Principal.Menu;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExcluirLivro extends javax.swing.JFrame {
    
    public ExcluirLivro() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        setTitle("Deletar Livro");
        AtualizarCombo();
    }
    private void AtualizarCombo(){
    Connection con = Conexao.AbrirConexao();
    LivroDAO sql = new LivroDAO(con);
    List<Livro> lista = new ArrayList<>();
    lista =  sql.ListarComboLivro();
    for(Livro c : lista){
       ComboLivro.addItem(c.getNome()); 
    }
    Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        IdLivro = new javax.swing.JTextField();
        ComboLivro = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        deletar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(35, 126, 51, 31);

        IdLivro.setEnabled(false);
        IdLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdLivroActionPerformed(evt);
            }
        });
        jPanel1.add(IdLivro);
        IdLivro.setBounds(98, 126, 63, 31);

        ComboLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboLivro.setMaximumRowCount(100);
        ComboLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Livro" }));
        ComboLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLivroActionPerformed(evt);
            }
        });
        jPanel1.add(ComboLivro);
        ComboLivro.setBounds(168, 126, 373, 31);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Deletar Livro");

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
        deletar.setBounds(101, 13, 147, 49);

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cancelar);
        cancelar.setBounds(300, 13, 172, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 217, 580, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nova4.jpg"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLivroActionPerformed
       Connection con = Conexao.AbrirConexao();
   LivroDAO sql = new LivroDAO(con);
    List<Livro> lista = new ArrayList<>();
    String nome = ComboLivro.getSelectedItem().toString();
    
    lista = sql.ConsultaCodigoLivro(nome);
    
    for(Livro c: lista){
        int a = c.getId();
        IdLivro.setText("" + a);    
    }
    Conexao.FecharConexao(con);  
    }//GEN-LAST:event_ComboLivroActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
   new Menu().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_cancelarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        String codigo = IdLivro.getText();
    String nome = ComboLivro.getSelectedItem().toString();
    
    Connection con = Conexao.AbrirConexao();
    LivroDAO sql = new LivroDAO(con);
    Livro a = new Livro();
    
    if(nome.equals("")){
        JOptionPane.showMessageDialog(null,"Nenhum Nome Selecionado"," Livro",JOptionPane.WARNING_MESSAGE);
    }else{
        int b = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir?"+"\n ("+codigo+")("+nome+")","Video Locadora"
        ,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(b == 0){
            int cod = Integer.parseInt(codigo);
            a.setNome(nome);
            a.setId(cod);
            sql.ExcluirLivro(a);
            Conexao.FecharConexao(con);
       
        }
    }new Menu().setVisible(true);
        dispose();
    
    }//GEN-LAST:event_deletarActionPerformed

    private void IdLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdLivroActionPerformed
    
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
            java.util.logging.Logger.getLogger(ExcluirLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExcluirLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboLivro;
    private javax.swing.JTextField IdLivro;
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
