
package stock.Controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import stock.Models.FornecedorViewModel;
import stock.DAO.FornecedorDAO;
import stock.Models.UsuarioViewModel;


public class FornecedorController {
    
    private FornecedorDAO dao = new FornecedorDAO();   
    private LocalDateTime dataatual = LocalDateTime.now();
    
    
    public String CadastraFornecedor(String razaoSocial,String endereco,String telefone, String email){
        
        if(razaoSocial == null | razaoSocial.trim().length() == 0)
            return "Por Favor Preencha um Nome v�lido!";
        if(endereco == null | endereco.trim().length() == 0)
            return "Por favor Preencha um endere�o v�lido!";
        if(telefone == null | telefone.trim().length() == 0)
            return "Por favor Preencha um telefone v�lido!";
        if(email == null | email.trim().length() == 0)
            return "Por favor Preencha um email v�lido!";
                  
        FornecedorViewModel fornecedor = new FornecedorViewModel();
        
        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setEndereco(endereco);
        fornecedor.setTelefone(telefone);
        fornecedor.setEmail(email);
       
        dao.inserir(fornecedor);
        
        return "Cadastro de fornecedor realizado com sucesso!";
    }
    public String EditaFornecedor(String razaoSocial,String endere�o,String telefone,String email){

        if(razaoSocial == null | razaoSocial.trim().length() == 0)
            return "Por Favor Preencha uma raz�o social v�lido";
        if(endere�o == null | endere�o.trim().length() == 0)
            return "Por Favor Preencha um endere�o v�lido";
        if(telefone == null | telefone.trim().length() == 0)
            return "Por Favor Preencha uma telefone v�lida";
        if(email == null | email.trim().length() == 0)
            return "Por Favor Preencha um cargo v�lido";
        FornecedorViewModel fornecedor = new FornecedorViewModel();

        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setEndereco(endere�o);
        fornecedor.setTelefone(telefone);
        fornecedor.setEmail(email);


        dao.update(fornecedor);

        return "Altera��o de usu�rio editado com sucesso!";
    }
    public void ExcluiFornecedor(int codigoFornecedor){
        dao.excluir(codigoFornecedor);
    }
    
}
