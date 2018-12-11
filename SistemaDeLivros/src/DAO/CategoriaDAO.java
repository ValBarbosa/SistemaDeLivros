
package DAO;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO extends ExecuteSQL{
    public CategoriaDAO(Connection con) {
        super(con);
    }
    public String InserirCategoria(Categoria c) {
        String sql = "INSERT INTO categoria VALUES (0,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, c.getCategoria());
            
            if (ps.executeUpdate() > 0) {
                return "Categoria cadastrada!";
            } else {
                return "Problema ao cadastrar categoria.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public List<Categoria> ListarComboCategoria() {
        String sql = "SELECT categoria FROM categoria ORDER BY categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    c.setCategoria(rs.getString(1));
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
    
    
    public List<Categoria> ConsultaCodigoCategoria(String nome) {
        String sql = "SELECT id FROM categoria WHERE categoria = '" + nome + "'";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
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
    public List<Categoria> CodigoID() {
        String sql = "SELECT MAX(id) FROM categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
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
    public String ExcluirCategoria(Categoria c) {
        String sql = "DELETE FROM categoria WHERE id = ? AND categoria = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getCategoria());

            if (ps.executeUpdate() > 0) {
                return "Excluido(a)!";
            } else {
                return "Problema ao excluir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
      public List<Categoria> ListarCategoria() {
        String sql = "SELECT id, categoria FROM categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    c.setId(rs.getInt(1));
                    c.setCategoria(rs.getString(2));
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
      public List<Categoria> PesquisarNomeCategoria(String nome) {
        String sql = "SELECT id, categoria FROM categoria WHERE categoria LIKE '%" + nome + "%'";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    c.setId(rs.getInt(1));
                    c.setCategoria(rs.getString(2));
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
      public List<Categoria> PesquisarCodigoCategoria(String C) {
        String sql = "SELECT id ,categoria FROM categoria WHERE id LIKE'" + C + "%'";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    c.setId(rs.getInt(1));
                    c.setCategoria(rs.getString(2));
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
       public List<Categoria> CapturarCategoria(int cod) {
        String sql = "SELECT * FROM categoria WHERE id = " + cod + " ";
        List<Categoria> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    c.setId(rs.getInt(1));
                    c.setCategoria(rs.getString(2));
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
        public boolean TestarCategoria(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM categoria WHERE id = " + cod + "";
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
         public String AlterarCategoria(Categoria c) {
        String sql = "update categoria set categoria = ? where id = ? ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, c.getCategoria());
            ps.setInt(2, c.getId());

            if (ps.executeUpdate() > 0) {
                return "Alterado(a)!";
            } else {
                return "Problema ao atualizar.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
