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
import stock.Models.AlteracaoPrecoPorDataViewModel;
import stock.Models.UsuarioViewModel;

/**
 *
 * @author alves
 */
public class AlteracaoPrecoPorDataDAO implements BaseDAO<AlteracaoPrecoPorDataViewModel> {
        
    private ConexaoBD conexao;
     
    public AlteracaoPrecoPorDataDAO(){
        this.conexao = new ConexaoBD();
    }
    @Override
     public void inserir(AlteracaoPrecoPorDataViewModel alteracao) {
        String sql = "INSERT INTO `stock`.`Alteracao_PrecoPorData` (`codigoProduto`, `porcentagemDeAumento`, `porcentagemDeDesconto`, `dataAlteracaoInicio`, `dataAlteracaoFim`, `codigoUsuario`) VALUES ('?', '?', '?','?', '?', '?')";
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, alteracao.getCodigoProduto());
                    comando.setString(2, alteracao.getPorcentagemDeAumento());
                    comando.setString(3, alteracao.getPorcentagemDeDesconto());
                    comando.setDate(4, (Date) alteracao.getDataAlteracaoInicio());
                    comando.setDate(5, (Date) alteracao.getDataAlteracaoFim());
                    comando.setInt(6, alteracao.getCodigoUsuario());
                    
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
    public void update(AlteracaoPrecoPorDataViewModel alteracao) {
        String sql = "UPDATE `stock`.`Alteracao_PrecoPorData` SET codigoAlteracao = ? , codigoProduto = ? , porcentagemDeAumento = ? , porcentagemDeDesconto = ? ,  dataAlteracaoInicio = ? , dataAlteracaoFim = ?, codigoUsuario = ? ";             
        try {
            if (this.conexao.conectar()) {
                try (PreparedStatement comando = this.conexao.getConnection().prepareStatement(sql)) {
                    comando.setInt(1, alteracao.getCodigoAlteracao());
                    comando.setInt(2, alteracao.getCodigoProduto());
                    comando.setString(3, alteracao.getPorcentagemDeAumento());
                    comando.setString(4, alteracao.getPorcentagemDeDesconto());
                    comando.setDate(5, (Date) alteracao.getDataAlteracaoInicio());
                    comando.setDate(6, (Date) alteracao.getDataAlteracaoFim());
                    comando.setInt(7, alteracao.getCodigoUsuario());
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
        String sql = "DELETE FROM `stock`.`Alteracao_PrecoPorData` WHERE codigoAlteracao = ?";
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
    
    public ArrayList<AlteracaoPrecoPorDataViewModel> consultar()
    {
    ArrayList<AlteracaoPrecoPorDataViewModel> listadeAlteracoes = new ArrayList<AlteracaoPrecoPorDataViewModel>();
        String sql = "SELECT * FROM ``stock`.`Alteracao_PrecoPorData` ORDER BY codigoAlteracao";
        try
        {
            if(this.conexao.conectar())
            {
                try (PreparedStatement comandoSQL = this.conexao.getConnection().prepareStatement(sql)) {
                    ResultSet comandoFinal = comandoSQL.executeQuery();
                               
                    while(comandoFinal.next())
                    {
                        AlteracaoPrecoPorDataViewModel alteracao = new AlteracaoPrecoPorDataViewModel();
                        
                        alteracao.setCodigoAlteracao(comandoFinal.getInt("codigoAlteracao"));
                        alteracao.setCodigoProduto(comandoFinal.getInt("codigoProduto"));
                        alteracao.setPorcentagemDeAumento(comandoFinal.getString("porcentagemDeAumento"));
                        alteracao.setPorcentagemDeDesconto(comandoFinal.getString("porcentagemDeDesconto"));
                        alteracao.setDataAlteracaoInicio(comandoFinal.getDate("dataAlteracaoInicio"));
                        alteracao.setDataAlteracaoFim(comandoFinal.getDate("dataAlteracaoFim"));
                        alteracao.setCodigoUsuario(comandoFinal.getInt("codigoUsuario"));
                        
                        listadeAlteracoes.add(alteracao);
                    }
                }
                catch(SQLException ex){
                    throw new RuntimeException(ex);
                }finally{
                    this.conexao.getConnection().close();
                }
            }
            return listadeAlteracoes;
        }
        catch(SQLException e)
        {
           throw new RuntimeException(e);
        }
    }
}
