
package br.com.nomeempresa.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FabricadeConexao {

    private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver" ;
    
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost:3306/";
    
    private static final String USUARIO = "root";
    
    private static final String SENHA = "";
    
    private static final String DATABASE = "Exemplo";
    
    public static Connection pegaConexao(){
        
        Connection conn = null; 
        try{
            Class.forName(DRIVER_CONEXAO);
            conn = DriverManager.getConnection(STRING_CONEXAO + DATABASE,USUARIO,SENHA);
            return conn;
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Erro ao conectar com a base de dados - nao foi encontrato o driver de conexao"
                    + e.getMessage());
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar com a base de dados "+ e.getMessage());
        }
        return null;
    }
    
}
