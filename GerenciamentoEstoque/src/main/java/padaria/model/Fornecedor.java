/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.model;

/**
 *
 * @author caico
 */
public class Fornecedor {
    
    public Integer codFornecedor;
    public String razaoSocial;
    public String endereco;
    public String emailContato;
    public String telefone;

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void cadastrarFornecedor(Fornecedor fornecedor){}
    
}
