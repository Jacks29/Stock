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
import stock.Models.UnidadeViewModel;
import stock.Models.UsuarioViewModel;

/**
 *
 * @author alves
 */
public class UnidadeDAO implements BaseDAO<UnidadeViewModel>{
    private ConexaoBD conexao;
     
    public UnidadeDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
    public void inserir(UnidadeViewModel unidade) {
        String sql = "INSERT INTO `stock`.`unidade` (`franquia`) VALUES ('?')";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setString(1, unidade.getFranquia());      
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
    public void update(UnidadeViewModel unidade) {
        String sql = "UPDATE `stock`.`unidade` SET codigoUnidade = ? , franquia = ? ";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, unidade.getCodigoUnidade());
                    comando.setString(2, unidade.getFranquia());                                      
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
        String sql = "DELETE FROM `stock`.`unidade` WHERE codigoUnidade = ?";
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
    public ArrayList<UnidadeViewModel> consultar()
    {
        ArrayList<UnidadeViewModel> listadeUnidades = new ArrayList<UnidadeViewModel>();
        String sql = "SELECT * FROM `stock`.`unidade` ORDER BY codigoUnidade";
        try
        {
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet comandoFinal = comandoSQL.executeQuery();
                               
                    while(comandoFinal.next())
                    {
                        UnidadeViewModel unidade = new UnidadeViewModel();                   
                        unidade.setCodigoUnidade(comandoFinal.getInt("codigoUnidade"));
                        unidade.setFranquia(comandoFinal.getString("franquia"));                        
                        listadeUnidades.add(unidade);
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
            return listadeUnidades;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    }
}
