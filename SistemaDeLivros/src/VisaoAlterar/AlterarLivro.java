
package VisaoAlterar;


import VisaoCadastrar.*;
import DAO.CategoriaDAO;
import DAO.Conexao;
import DAO.LivroDAO;
import Modelo.Categoria;
import Modelo.Livro;
import Principal.Menu;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Valéria
 */
public class AlterarLivro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastra
     */
    public AlterarLivro() {
        initComponents();
        setSize(900, 500);
        setLocationRelativeTo(this);
        AtualizaComboCategoria();
    }
    
  private void InserirDados(int cod) {
        Connection con = Conexao.AbrirConexao();
        LivroDAO sql = new LivroDAO(con);
        List<Livro> lista = new ArrayList<>();
        lista = sql.CapturarLivro(cod);
        for (Livro a : lista) {
            nome.setText("" + a.getNome());
            resumo.setText("" + a.getResumo());
            id.setText("" + a.getIdcategoria());
            num.setText("" + a.getId());
        }
        Conexao.FecharConexao(con);
    }
    private void AtualizaComboCategoria() {
        
        Connection con = Conexao.AbrirConexao();
        CategoriaDAO sql = new CategoriaDAO(con);
        List<Categoria> lista = new ArrayList<>();
        lista = sql.ListarComboCategoria();
        
        for (Categoria categoria : lista) {
            
            ComboCategoria.addItem(categoria.getCategoria());
            
        }
        
        Conexao.FecharConexao(con);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        ComboCategoria = new javax.swing.JComboBox<>();
        resumo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadastra = new javax.swing.JButton();
        valtar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(Codigo);
        Codigo.setBounds(170, 80, 490, 30);

        num.setEditable(false);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        getContentPane().add(num);
        num.setBounds(170, 120, 370, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(670, 80, 130, 30);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(170, 160, 490, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME DO LIVRO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 150, 182, 51);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CATEGORIA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 120, 30);

        id.setEditable(false);
        getContentPane().add(id);
        id.setBounds(170, 200, 90, 30);

        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(ComboCategoria);
        ComboCategoria.setBounds(280, 200, 370, 30);
        getContentPane().add(resumo);
        resumo.setBounds(160, 240, 520, 90);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RESUMO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 250, 160, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("INFORME O CÓDIGO:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 90, 150, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR LIVROS:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 10, 620, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 950, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ultima.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 70, 930, 290);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        cadastra.setBackground(new java.awt.Color(102, 255, 51));
        cadastra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ok.png"))); // NOI18N
        cadastra.setText("Alterar");
        cadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraActionPerformed(evt);
            }
        });
        jPanel2.add(cadastra);
        cadastra.setBounds(510, 10, 156, 51);

        valtar.setBackground(new java.awt.Color(255, 204, 0));
        valtar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valtar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        valtar.setText("VOLTAR");
        valtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valtarActionPerformed(evt);
            }
        });
        jPanel2.add(valtar);
        valtar.setBounds(270, 10, 156, 51);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 360, 930, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraActionPerformed
        String no = nome.getText();
        String livro = num.getText();
        String res = resumo.getText();
        String idca =id.getText();
        if (nome.equals("") || resumo.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode está vazio.", "Video Locadora", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            LivroDAO sql = new LivroDAO(con);
            int idcate = Integer.parseInt(idca);
            int idli = Integer.parseInt(livro);
            Livro c = new Livro();
            c.setId(idli);
            c.setIdcategoria(idcate);
            c.setNome(no);
            c.setResumo(res);
            sql.AlterarLivro(c);
            Conexao.FecharConexao(con);
            JOptionPane.showMessageDialog(null, "Alteração concluida!", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
          new Menu().setVisible(true);
        }
        dispose();       
       
    }//GEN-LAST:event_cadastraActionPerformed

    private void valtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valtarActionPerformed
 
       new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_valtarActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
    Connection con = Conexao.AbrirConexao();
    CategoriaDAO sql = new CategoriaDAO(con);
    List<Categoria> lista = new ArrayList<>();
    String nome = ComboCategoria.getSelectedItem().toString();
    
    lista = sql.ConsultaCodigoCategoria(nome);
    
    for(Categoria c: lista){
        int a = c.getId();
        id.setText("" + a);    
    }
    Conexao.FecharConexao(con);  
    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String codigo = Codigo.getText();
        Connection con = Conexao.AbrirConexao();
        LivroDAO sql = new LivroDAO(con);
        int cod = Integer.parseInt(codigo);
        if (sql.TestarLivro(cod) == false) {
            JOptionPane.showMessageDialog(null, "O código não foi encontrado!", "Vidio Locadora", JOptionPane.WARNING_MESSAGE);
            Conexao.FecharConexao(con);
        }
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código!", "Video Locadora", JOptionPane.WARNING_MESSAGE);
        }
        nome.setText("");
        resumo.setText("");
        InserirDados(cod);     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JButton cadastra;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField resumo;
    private javax.swing.JButton valtar;
    // End of variables declaration//GEN-END:variables
}
