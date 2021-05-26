
package stock.Controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import stock.Models.FornecedorViewModel;
import stock.DAO.FornecedorDAO;


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
    
}
