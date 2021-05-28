package stock.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import stock.Models.UsuarioViewModel;
import stock.AreaComum;


public class UsuarioDAO implements BaseDAO<UsuarioViewModel> {
        
    private ConexaoBD conexao;
    private AreaComum areacomum= new AreaComum();
     
    public UsuarioDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
    public void inserir(UsuarioViewModel usuario) {
        String sql = "INSERT INTO `stock`.`usuario` (`login`, `nome`, `senha`, `cargo`, `codigoUnidade`) VALUES ('?', '?', '?','?', '?')";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setString(1, usuario.getLogin());
                    comando.setString(2, usuario.getNome());
                    comando.setString(3, usuario.getSenha());
                    comando.setString(4,usuario.getCargo());
                    comando.setDouble(5, usuario.getCodigoUnidade());                   
                    comando.execute();
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } 
    }
    
    @Override
    public void update(UsuarioViewModel usuario) {
        String sql = "UPDATE `stock`.`usuario` SET  login = ? , nome = ? , senha = ? ,  cargo = ? , "
                + "codigoUnidade = ?";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {                   
                    comando.setString(1, usuario.getLogin());
                    comando.setString(2, usuario.getNome());
                    comando.setString(3, usuario.getSenha());
                    comando.setString(4, usuario.getCargo());
                    comando.setDouble(5, usuario.getCodigoUnidade());                   
                    comando.execute();
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } 
    }
    
    @Override
    public void excluir(int codigo) {
        String sql = "DELETE FROM `stock`.`usuario` WHERE codigoUsuario = ?";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, codigo);                   
                    comando.execute();
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } 
    }
    
    public boolean consultar(UsuarioViewModel usuario)
    {
        String sql = "select * from stock.usuario where login = '"+usuario.login+"' AND senha = '"+usuario.senha+"'";
        try
        {
            ResultSet comandoFinal=null;
            
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                     comandoFinal = comandoSQL.executeQuery();
                     
                    if(!comandoFinal.next())
                        return false;
                    
                    areacomum.Cargo=comandoFinal.getString("Cargo");
                    areacomum.CodUsuario=comandoFinal.getInt("codigoUsuario");
                    areacomum.CodUnidade=comandoFinal.getInt("codigoUnidade");
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }           
            return true;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        } 
    }

}