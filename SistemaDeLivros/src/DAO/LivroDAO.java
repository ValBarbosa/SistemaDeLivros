package DAO;

import Modelo.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO extends ExecuteSQL{

    public LivroDAO(Connection con){
        super(con);
    }
     public String InserirLivro(Livro c) {
        String sql = "INSERT INTO livro VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, c.getIdcategoria());
            ps.setString(2, c.getNome());
            ps.setString(3, c.getResumo());
            if (ps.executeUpdate() > 0) {
                return "Cliente cadastrado com sucesso.";
            } else {
                return "Erro ao cadastrar cliente.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     public List<Livro> PesquisarNomeLivro(String nome) {
        String sql = "SELECT id, nome FROM livro WHERE nome LIKE '%" + nome + "%'";
        List<Livro> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Livro c = new Livro();
                    c.setId(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    lista.add(c);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
}
     public List<Livro> PegarCodigoLivro(int cod) {
        String sql = "SELECT id, nome FROM livro WHERE id = '" + cod + "'";
        List<Livro> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Livro a = new Livro();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
     public List<Livro> ListarLivro() {
        String sql = "SELECT id, nome FROM livro";
        List<Livro> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Livro c = new Livro();
                    c.setId(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    lista.add(c);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
      public List<Livro> ListarComboLivro() {
        String sql = "SELECT nome FROM livro ORDER BY nome";
        List<Livro> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Livro c = new Livro();
                    c.setNome(rs.getString(1));
                    lista.add(c);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
 public List<Livro> ConsultaCodigoLivro(String nome) {
        String sql = "SELECT id FROM livro WHERE nome = '" + nome + "'";
        List<Livro> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Livro c = new Livro();
                    c.setId(rs.getInt(1));
                    lista.add(c);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
   public String ExcluirLivro(Livro c) {
        String sql = "DELETE FROM livro WHERE id = ? AND nome = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getNome());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     public String AlterarLivro(Livro c) {
        String sql = "update livro set idcategoria = ?, nome = ?, resumo = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, c.getIdcategoria());
            ps.setString(2, c.getNome());
            ps.setString(3, c.getResumo());
            ps.setInt(4, c.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    public List<Livro> CapturarLivro(int cod) {
        String sql = "SELECT * FROM livro WHERE id = " + cod + " ";
        List<Livro> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Livro c = new Livro();
                    c.setId(rs.getInt(1));
                    c.setIdcategoria(rs.getInt(2));
                    c.setNome(rs.getString(3));
                    c.setResumo(rs.getString(4));
                  
                    lista.add(c);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    public boolean TestarLivro(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM livro WHERE id = " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Resultado = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return Resultado;
    }
    
}

