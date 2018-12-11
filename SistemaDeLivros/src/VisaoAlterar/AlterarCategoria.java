package VisaoAlterar;

import DAO.CategoriaDAO;
import DAO.Conexao;
import Modelo.Categoria;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import Principal.Menu;
import javax.swing.JOptionPane;

public class AlterarCategoria extends javax.swing.JFrame {

    public AlterarCategoria() {
        initComponents();
        setSize(700, 420);
        setLocationRelativeTo(this);
       
        setTitle("Alterar Categoria");
    }
  private void InserirDados(int cod) {
        Connection con = Conexao.AbrirConexao();
        CategoriaDAO sql = new CategoriaDAO(con);
        List<Categoria> lista = new ArrayList<>();
        lista = sql.CapturarCategoria(cod);
        for (Categoria a : lista) {
            Nome.setText("" + a.getCategoria());
            Numero.setText("" + a.getId());
        }
        Conexao.FecharConexao(con);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Alterar Categoria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 820, 60);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair1.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 290, 190, 49);

        jPanel1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Informe o Código:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 30, 112, 17);
        jPanel1.add(Codigo);
        Codigo.setBounds(160, 20, 281, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número/Categoria:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 117, 17);
        jPanel1.add(Nome);
        Nome.setBounds(160, 70, 280, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 130, 41, 17);

        Numero.setEditable(false);
        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });
        jPanel1.add(Numero);
        Numero.setBounds(160, 122, 280, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(480, 20, 155, 32);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nova6.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 712, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 720, 220);

        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 270, 720, 0);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ok.png"))); // NOI18N
        jButton3.setText("Alterar");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 290, 155, 49);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String codigo = Codigo.getText();
        Connection con = Conexao.AbrirConexao();
        CategoriaDAO sql = new CategoriaDAO(con);
        int cod = Integer.parseInt(codigo);
        if (sql.TestarCategoria(cod) == false) {
            JOptionPane.showMessageDialog(null, "O código não foi encontrado!", "Vidio Locadora", JOptionPane.WARNING_MESSAGE);
            Conexao.FecharConexao(con);
        }
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código!", "Video Locadora", JOptionPane.WARNING_MESSAGE);
        }
        Nome.setText("");
        Numero.setText("");
        InserirDados(cod);          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nome = Nome.getText();
        String numero = Numero.getText();
        if (nome.equals("") || numero.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode está vazio.", "Video Locadora", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            CategoriaDAO sql = new CategoriaDAO(con);
            int num = Integer.parseInt(numero);
            Categoria a = new Categoria();
            a.setId(num);
            a.setCategoria(nome);
            sql.AlterarCategoria(a);
            Conexao.FecharConexao(con);
            Nome.setText("");
            Numero.setText("");;
            JOptionPane.showMessageDialog(null, "Alteração concluida!", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
            new Menu().setVisible(true);
        }
        dispose();       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 new Menu().setVisible(true);
        dispose();      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new AlterarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
