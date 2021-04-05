/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.controller;


import padaria.model.Produto;


/**
 *
 * @author caico
 */
public class CadastraProdutoController {
    
    public boolean CadastraProduto(String nome, double preco, Integer quantidade, String dataValidade, String temperatura){
        
        if(nome!= null && nome.length()>0 && temperatura!= null && temperatura.length()>0 && quantidade>0 && preco>0 && dataValidade != null && dataValidade.length()>0){
            Produto produto = new Produto();
            produto.nome = nome;
            produto.preco=preco;
            produto.quantidade=quantidade;
            produto.dataValidade=dataValidade;
            produto.temperatura=temperatura;
            produto.cadastrarProduto(produto);
            return true;
        }
        return false;
    }
    
}
