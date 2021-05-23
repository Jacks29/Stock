/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import stock.Models.ProdutoViewModel;

/**
 *
 * @author alves
 */
public class ProdutoDAO implements BaseDAO<ProdutoViewModel>{
    private ConexaoBD conexao;
     
    public ProdutoDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
    public void inserir(ProdutoViewModel produto) {
        String sql = "INSERT INTO `stock`.`Produto` (`codigoProduto`, `nomeProduto`, `dataValidade`, `dataProcessamento`, `precoCompra`,`precoVenda`, `quantidade`, `armazenamento`, `codigoFornecedor`, `loteProduto`, `codigoUnidade` ) VALUES ('?','?','?','?','?','?','?','?','?','?','?')";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, produto.getCodigoProduto());
                    comando.setString(2, produto.getNome());
                    comando.setDate(3, (Date) produto.getDataValidade());
                    comando.setDate(4, (Date) produto.getDataProcessamento());
                    comando.setDouble(5,produto.getPrecoCompra());
                    comando.setDouble(6,produto.getPrecoVenda());
                    comando.setInt(7, produto.getQuantidade());
                    comando.setString(8,produto.getArmazenamento());
                    comando.setInt(9, produto.getCodigoFornecedor());
                    comando.setInt(10,produto.getLoteProduto());
                    comando.setInt(11, produto.getCodigoUnidade());                    
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
    public void update(ProdutoViewModel produto) {
        String sql = "UPDATE `stock`.`produto` SET codigoProduto = ?, nomeProduto = ?, dataValidade = ?, dataProcessamento = ?,  precoCompra = ?,  precoVenda = ?,  quantidade = ? , armazenamento = ?,  codigoFornecedor = ?, loteProduto = ?, codigoUnidade = ? ";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, produto.getCodigoProduto());
                    comando.setString(2, produto.getNome());
                    comando.setDate(3, (Date) produto.getDataValidade());
                    comando.setDate(4, (Date) produto.getDataProcessamento());
                    comando.setDouble(5,produto.getPrecoCompra());
                    comando.setDouble(6,produto.getPrecoVenda());
                    comando.setInt(7, produto.getQuantidade());
                    comando.setString(8,produto.getArmazenamento());
                    comando.setInt(9, produto.getCodigoFornecedor());
                    comando.setInt(10,produto.getLoteProduto());
                    comando.setInt(11, produto.getCodigoUnidade());                  
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
        String sql = "DELETE FROM `stock`.`produto` WHERE codigoProduto = ?";
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
    public ArrayList<ProdutoViewModel> consultar()
    {
    ArrayList<ProdutoViewModel> listadeProdutos = new ArrayList<ProdutoViewModel>();
        String sql = "SELECT * FROM `stock`.`Produto` ORDER BY codigoProduto";
        try
        {
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet comandoFinal = comandoSQL.executeQuery();
                               
                    while(comandoFinal.next())
                    {
                        ProdutoViewModel produto = new ProdutoViewModel();                        
                        produto.setCodigoProduto(comandoFinal.getInt("codigoProduto"));
                        produto.setNome(comandoFinal.getString("nomeProduto"));
                        produto.setDataValidade(comandoFinal.getDate("dataValidade"));
                        produto.setDataProcessamento(comandoFinal.getDate("dataProcessamento"));
                        produto.setPrecoCompra(comandoFinal.getDouble("precoCompra"));
                        produto.setPrecoVenda(comandoFinal.getDouble("precoVenda"));
                        produto.setQuantidade(comandoFinal.getInt("quantidade"));
                        produto.setArmazenamento(comandoFinal.getString("armazenamento"));
                        produto.setCodigoFornecedor(comandoFinal.getInt("codigoFornecedor"));
                        produto.setLoteProduto(comandoFinal.getInt("loteProduto"));
                        produto.setCodigoUnidade(comandoFinal.getInt("codigoUnidade"));
                        listadeProdutos.add(produto);
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
            return listadeProdutos;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    }
}
