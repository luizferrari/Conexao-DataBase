
package br.com.nomeempresa.app;

import br.com.nomeempresa.modelo.dao.FabricadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
        conn = FabricadeConexao.pegaConexao();
        PreparedStatement pstm = null;
        pstm = FabricadeConexao.pegaConexao().prepareStatement("Insert into Funcionario (nome,telefone) values ('João', '48 99234567)')");
        pstm.execute();
    }
    
}
