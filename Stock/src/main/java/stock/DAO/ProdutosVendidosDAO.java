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
import stock.Models.ProdutosVendidosViewModel;

/**
 *
 * @author alves
 */
public class ProdutosVendidosDAO implements BaseDAO<ProdutosVendidosViewModel> {
    private ConexaoBD conexao;
     
    public ProdutosVendidosDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
    public void inserir(ProdutosVendidosViewModel produtosVendidos) {
        String sql = "INSERT INTO `stock`.`ProdutosVendidos` (`codigoProduto`, `quantidade`, `valorUnitario`, `codigoUnidade`, `codigoUsuario`) VALUES ('?', '?', '?','?', '?')";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, produtosVendidos.getCodigoProduto());
                    comando.setInt(2, produtosVendidos.getQuantidade());
                    comando.setDouble(3, produtosVendidos.getValorUnitario());
                    comando.setInt(4,produtosVendidos.getCodigoUnidade());
                    comando.setInt(5, produtosVendidos.getCodigoUsuario());                    
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
    public void update(ProdutosVendidosViewModel produtosVendidos) {
        String sql = "UPDATE `stock`.`Fornecedor` SET codigoVenda = ?, codigoProduto = ?, quantidade = ?, valorUnitario = ?, codigoUnidade = ?, codigoUsuario = ? ";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, produtosVendidos.getCodigoVenda());
                    comando.setInt(2, produtosVendidos.getCodigoProduto());
                    comando.setInt(3, produtosVendidos.getQuantidade());
                    comando.setDouble(4, produtosVendidos.getValorUnitario());
                    comando.setInt(5,produtosVendidos.getCodigoUnidade());
                    comando.setInt(6, produtosVendidos.getCodigoUsuario());                   
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
        String sql = "DELETE FROM `stock`.`Fornecedor` WHERE codigoVenda = ?";
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
    
    public ArrayList<ProdutosVendidosViewModel> consultar()
    {
    ArrayList<ProdutosVendidosViewModel> listadeProdutosVendidos = new ArrayList<ProdutosVendidosViewModel>();
        String sql = "SELECT * FROM `stock`.`Fornecedor` ORDER BY codigoVenda";
        try
        {
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet comandoFinal = comandoSQL.executeQuery();
                               
                    while(comandoFinal.next())
                    {
                        ProdutosVendidosViewModel produtoVendido = new ProdutosVendidosViewModel();
                        
                        produtoVendido.setCodigoVenda(comandoFinal.getInt("codigoVenda"));
                        produtoVendido.setCodigoProduto(comandoFinal.getInt("codigoProduto"));
                        produtoVendido.setQuantidade(comandoFinal.getInt("quantidade"));
                        produtoVendido.setValorUnitario(comandoFinal.getDouble("valorUnitario"));
                        produtoVendido.setCodigoUnidade(comandoFinal.getInt("codigoUnidade"));
                        produtoVendido.setCodigoUsuario(comandoFinal.getInt("codigoUsuario"));                       
                        listadeProdutosVendidos.add(produtoVendido);
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
            return listadeProdutosVendidos;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    }
}
