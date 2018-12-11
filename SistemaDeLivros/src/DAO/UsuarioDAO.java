/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Valéria
 */
public class UsuarioDAO extends ExecuteSQL{

    public UsuarioDAO(Connection con){
        super(con);
    }
    
    public boolean Logar(String login, String senha){
        boolean finalResult = false;
        
        String consulta = "SELECT login,senha FROM usuario WHERE login = '"+login+"' AND senha = '"+senha+"'";
        
        try {
            PreparedStatement ps = 
            getCon().prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Usuario a = new Usuario();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
            
        } catch (SQLException ex) {
           ex.getMessage();
        }
    return finalResult;
    }
}
