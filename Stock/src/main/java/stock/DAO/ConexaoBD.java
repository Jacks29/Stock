package stock.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD  {
    private Connection conexao;

    public boolean conectar() throws SQLException {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","1234");
        return true;                 
    }
    public Connection getConnection() {
        return conexao;
    }
}
