
package stock.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import stock.Models.ProdutoViewModel;


public class ProdutoDAO implements BaseDAO<ProdutoViewModel>{
    private ConexaoBD conexao;
     
    public ProdutoDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
    public void inserir(ProdutoViewModel produto) {
        String sql = "INSERT INTO `stock`.`Produto` (`nomeProduto`, `dataValidade`, `dataProcessamento`,`preco` , `quantidade`, `armazenamento`, `codigoFornecedor`, `codigoUnidade` ) VALUES (?,?,?,?,?,?,?,?)";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setString(1, produto.getNome());
                    comando.setString(2, produto.getDataValidade());
                    comando.setString(3, produto.getDataProcessamento());
                    comando.setDouble(4,produto.getPreco());
                    comando.setInt(5, produto.getQuantidade());
                    comando.setString(6,produto.getArmazenamento());
                    comando.setInt(7, produto.getCodigoFornecedor());
                    comando.setInt(8, produto.getCodigoUnidade());                    
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
        String sql = "UPDATE `stock`.`produto` SET  nomeProduto = ?, dataValidade = ?, dataProcessamento = ?,  preco = ?,  quantidade = ? , armazenamento = ?,  codigoFornecedor = ?, codigoUnidade = ? where codigoProduto = '"+produto.getCodigoProduto()+"'";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setString(1, produto.getNome());
                    comando.setString(2, produto.getDataValidade());
                    comando.setString(3, produto.getDataProcessamento());
                    comando.setDouble(4,produto.getPreco());
                    comando.setInt(5, produto.getQuantidade());
                    comando.setString(6,produto.getArmazenamento());
                    comando.setInt(7, produto.getCodigoFornecedor());
                    comando.setInt(8, produto.getCodigoUnidade());                  
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
    
    public ArrayList<ProdutoViewModel> consultar(int CodUnidade)
    {
        ArrayList<ProdutoViewModel> listadeProdutos = new ArrayList<ProdutoViewModel>();
        
        String sql = "SELECT * FROM `stock`.`produto` where codigoUnidade = '"+CodUnidade+"' ORDER BY codigoProduto";
        
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
                        produto.setDataValidade(comandoFinal.getString("dataValidade"));
                        produto.setDataProcessamento(comandoFinal.getString("dataProcessamento"));
                        produto.setPreco(comandoFinal.getDouble("preco"));;
                        produto.setQuantidade(comandoFinal.getInt("quantidade"));
                        produto.setArmazenamento(comandoFinal.getString("armazenamento"));
                        produto.setCodigoFornecedor(comandoFinal.getInt("codigoFornecedor"));
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
      
    public ProdutoViewModel PesquisaProduto(int codProduto){
    String sql = "SELECT * FROM `stock`.`produto` where codigoProduto = '"+codProduto+"' ";
        try
        {
            ProdutoViewModel produto = new ProdutoViewModel();
            
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    
                    ResultSet comandoFinal = comandoSQL.executeQuery();                               
                    while(comandoFinal.next())
                    {                                             
                        produto.setCodigoProduto(comandoFinal.getInt("codigoProduto"));
                        produto.setNome(comandoFinal.getString("nomeProduto"));
                        produto.setDataValidade(comandoFinal.getString("dataValidade"));
                        produto.setDataProcessamento(comandoFinal.getString("dataProcessamento"));
                        produto.setPreco(comandoFinal.getDouble("preco"));;
                        produto.setQuantidade(comandoFinal.getInt("quantidade"));
                        produto.setArmazenamento(comandoFinal.getString("armazenamento"));
                        produto.setCodigoFornecedor(comandoFinal.getInt("codigoFornecedor"));
                        produto.setCodigoUnidade(comandoFinal.getInt("codigoUnidade"));
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }
                finally{
                    this.conexao.getConnection().close();
                }
            }
            return produto;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    
    }
    
}
