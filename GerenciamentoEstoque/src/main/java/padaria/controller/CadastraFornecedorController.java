/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.controller;

import padaria.model.Fornecedor;

/**
 *
 * @author caico
 */
public class CadastraFornecedorController {
    
    public boolean CadastraFornecedor(String razaoSocial, String endereco, String emailContato, String telefone){
        
        if(razaoSocial!= null && razaoSocial.length()>0 && endereco!= null && endereco.length()>0 && emailContato!= null && emailContato.length()>0 && telefone != null && telefone.length()>0){
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.razaoSocial = razaoSocial;
            fornecedor.endereco=endereco;
            fornecedor.emailContato = emailContato;
            fornecedor.telefone = telefone;
            fornecedor.cadastrarFornecedor(fornecedor);
            return true;
        }
        return false;
    }
    
}
