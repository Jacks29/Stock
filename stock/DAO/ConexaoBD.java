/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author alves
 */
public class ConexaoBD  {
    private Connection conexao;

    public boolean conectar() throws SQLException {
        this.conexao = DriverManager.getConnection("jdbc:mysql://" + "Servidor" + "/" + "Banco", "Usuario", "Senha");
        return true;                 
    }
    public Connection getConnection() {
        return conexao;
    }
}
