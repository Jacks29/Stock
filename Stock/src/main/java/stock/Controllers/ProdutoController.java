package stock.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import stock.Models.ProdutoViewModel;
import stock.DAO.ProdutoDAO;


public class ProdutoController {
    
    private ProdutoDAO dao = new ProdutoDAO();   
    private LocalDateTime dataatual = LocalDateTime.now();
    
    
    public String CadastraProduto(String nome,String dataValidade,double preco, int quantidade, String armazenamento,int codigoFornecedor, int codigoUnidade){
        
        if(nome == null | nome.trim().length() == 0)
            return "Por Favor Preencha um Nome Valido";
        if(dataValidade == null | dataValidade.trim().length() == 0 | comparaDatas(dataValidade))
            return "Por favor Preencha uma Data Valida";
        if(quantidade == 0 | quantidade < 0)
            return "Por favor Preencha uma Quantidade valida";
        if(preco == 0 | preco < 0)
            return "Por favor Preencha um preço valido";
                  
        ProdutoViewModel produto = new ProdutoViewModel();
        
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        produto.setDataValidade(dataValidade);
        produto.setDataProcessamento(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH).format(dataatual));
        produto.setArmazenamento(armazenamento);
        produto.setCodigoFornecedor(codigoFornecedor);
        produto.setCodigoUnidade(codigoUnidade);
        
        dao.inserir(produto);
        
        return "Cadastro de produto realizado com sucesso!";
    }
    
    public String EditaProduto(String nome,String dataValidade,double preco, int quantidade, String armazenamento,int codigoFornecedor, int codigoUnidade, int codigoProduto){
        
        if(nome == null | nome.trim().length() == 0)
            return "Por Favor Preencha um Nome válido";
        if(dataValidade == null | dataValidade.trim().length() == 0 | comparaDatas(dataValidade))
            return "Por favor Preencha uma Data válida";
        if(quantidade == 0 | quantidade < 0)
            return "Por favor Preencha uma Quantidade válida";
        if(preco == 0 | preco < 0)
            return "Por favor Preencha um preço válido";
                  
        ProdutoViewModel produto = new ProdutoViewModel();
        
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        produto.setDataValidade(dataValidade);
        produto.setDataProcessamento(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH).format(dataatual));
        produto.setArmazenamento(armazenamento);
        produto.setCodigoFornecedor(codigoFornecedor);
        produto.setCodigoUnidade(codigoUnidade);
        produto.setCodigoProduto(codigoProduto);
        
        dao.update(produto);
        
        return "Alteração de produto realizado com sucesso!";
    }
    
    public void ExcluiProduto(int codigoProduto){                                     
        dao.excluir(codigoProduto);        
    }
    
    private boolean comparaDatas(String psDate1) {
       SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
       Date date1=null;
       Date date2=null;              
       try{
           date1 = dateFormat.parse(psDate1);
           date2 = dateFormat.parse(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH).format(dataatual));
           
           return date2.after(date1);
       }
       catch(ParseException ex){
           return false;
       }
    }  
    
}
