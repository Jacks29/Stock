
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
            return "Por Favor Preencha um Nome válido!";
        if(endereco == null | endereco.trim().length() == 0)
            return "Por favor Preencha um endereço válido!";
        if(telefone == null | telefone.trim().length() == 0)
            return "Por favor Preencha um telefone válido!";
        if(email == null | email.trim().length() == 0)
            return "Por favor Preencha um email válido!";
                  
        FornecedorViewModel fornecedor = new FornecedorViewModel();
        
        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setEndereco(endereco);
        fornecedor.setTelefone(telefone);
        fornecedor.setEmail(email);
       
        dao.inserir(fornecedor);
        
        return "Cadastro de fornecedor realizado com sucesso!";
    }
    
}
