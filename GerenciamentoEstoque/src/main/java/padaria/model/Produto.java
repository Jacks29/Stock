/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.model;

import java.util.Date;

/**
 *
 * @author caico
 */
public class Produto {
    
    public Integer codProd;
    public Integer codFornecedor;
    public Integer codUsuario;
    public Integer quantidade;
    public double preco;
    public String nome;
    public String temperatura;
    public String unidade;
    public String dataValidade;
    public Date dataProcessamento;

    public Integer getCodProd() {
        return codProd;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public Date getDataProcessamento() {
        return dataProcessamento;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setDataProcessamento(Date dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }

          
    public void cadastrarProduto(Produto produto){}
}
