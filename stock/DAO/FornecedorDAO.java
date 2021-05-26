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
import stock.Models.FornecedorViewModel;
/**
 *
 * @author alves
 */
public class FornecedorDAO implements BaseDAO<FornecedorViewModel> {
    private ConexaoBD conexao;
     
    public FornecedorDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
    public void inserir(FornecedorViewModel fornecedor) {
        String sql = "INSERT INTO `stock`.`fornecedor` (`razaoSocial`, `endereço`, `telefone`, `email`) VALUES ('?', '?', '?', '?')";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setString(1, fornecedor.getRazaoSocial());
                    comando.setString(2, fornecedor.getEndereço());
                    comando.setString(3, fornecedor.getTelefone());
                    comando.setString(4,fornecedor.getEmail());                  
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
    public void update(FornecedorViewModel fornecedor) {
        String sql = "UPDATE `stock`.`fornecedor` SET codigoFornecedor = ? , razaoSocial = ? , endereço = ? ,  telefone = ? , "
                + "email = ?";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, fornecedor.getCodigoFornecedor());
                    comando.setString(2, fornecedor.getRazaoSocial());
                    comando.setString(3, fornecedor.getEndereço());
                    comando.setString(4, fornecedor.getTelefone());
                    comando.setString(5, fornecedor.getEmail());                   
                    comando.execute();
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                };
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    @Override
    public void excluir(int codigo) {
        String sql = "DELETE FROM `stock`.`fornecedor` WHERE codigoFornecedor = ?";
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
    public ArrayList<FornecedorViewModel> consultar()
    {
        ArrayList<FornecedorViewModel> listadeFornecedores = new ArrayList<FornecedorViewModel>();
        String sql = "SELECT * FROM `stock`.`fornecedor` ORDER BY codigoFornecedor";
        try
        {
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet comandoFinal = comandoSQL.executeQuery();
                               
                    while(comandoFinal.next())
                    {
                        FornecedorViewModel fornecedor = new FornecedorViewModel();                      
                        fornecedor.setCodigoFornecedor(comandoFinal.getInt("codigoFornecedor"));
                        fornecedor.setRazaoSocial(comandoFinal.getString("razaoSocial"));
                        fornecedor.setEndereço(comandoFinal.getString("endereço"));
                        fornecedor.setTelefone(comandoFinal.getString("telefone"));
                        fornecedor.setEmail(comandoFinal.getString("email"));                      
                        listadeFornecedores.add(fornecedor);
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
            return listadeFornecedores;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    }
}
