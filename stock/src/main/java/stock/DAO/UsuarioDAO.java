/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import stock.Models.UsuarioViewModel;
/**
 *
 * @author alves
 */
public class UsuarioDAO implements BaseDAO<UsuarioViewModel> {
        
    private ConexaoBD conexao;
     
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
        String sql = "UPDATE `stock`.`usuario` SET codigoUsuario = ? , login = ? , nome = ? , senha = ? ,  cargo = ? , "
                + "codigoUnidade = ?";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, usuario.getCodigoUsuario());
                    comando.setString(2, usuario.getLogin());
                    comando.setString(3, usuario.getNome());
                    comando.setString(4, usuario.getSenha());
                    comando.setString(5, usuario.getCargo());
                    comando.setDouble(6, usuario.getCodigoUnidade());                   
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
    @Override
    public ArrayList<UsuarioViewModel> consultar()
    {
        ArrayList<UsuarioViewModel> listadeUsuarios = new ArrayList<UsuarioViewModel>();
        String sql = "SELECT * FROM `stock`.`usuario` ORDER BY codigoUsuario";
        try
        {
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet comandoFinal = comandoSQL.executeQuery();
                               
                    while(comandoFinal.next())
                    {
                        UsuarioViewModel usuario = new UsuarioViewModel();                        
                        usuario.setCodigoUsuario(comandoFinal.getInt("codigoUsuario"));
                        usuario.setLogin(comandoFinal.getString("Login"));
                        usuario.setNome(comandoFinal.getString("Nome"));
                        usuario.setSenha(comandoFinal.getString("Senha"));
                        usuario.setCargo(comandoFinal.getString("Cargo"));
                        usuario.setCodigoUnidade(comandoFinal.getInt("codigoUnidade"));                        
                        listadeUsuarios.add(usuario);
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
            return listadeUsuarios;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    }
}