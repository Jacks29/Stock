/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.Models;

import java.util.Date;

/**
 *
 * @author alves
 */
public class ProdutoViewModel {

    /**
     * @return the codigoProduto
     */
    private int codigoProduto;
    private String nome;
    private Date dataValidade;
    private Date dataProcessamento;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;
    private String armazenamento;
    private int codigoFornecedor;
    private int loteProduto;
    private int codigoUnidade; 
    
    public int getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * @return the dataValidade
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the dataProcessamento
     */
    public Date getDataProcessamento() {
        return dataProcessamento;
    }

    /**
     * @param dataProcessamento the dataProcessamento to set
     */
    public void setDataProcessamento(Date dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }

    /**
     * @return the precoVenda
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the armazenamento
     */
    public String getArmazenamento() {
        return armazenamento;
    }

    /**
     * @param armazenamento the armazenamento to set
     */
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    /**
     * @return the codigoFornecedor
     */
    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * @param codigoFornecedor the codigoFornecedor to set
     */
    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    /**
     * @return the loteProduto
     */
    public int getLoteProduto() {
        return loteProduto;
    }

    /**
     * @param loteProduto the loteProduto to set
     */
    public void setLoteProduto(int loteProduto) {
        this.loteProduto = loteProduto;
    }

    /**
     * @return the codigoUnidade
     */
    public int getCodigoUnidade() {
        return codigoUnidade;
    }

    /**
     * @param codigoUnidade the codigoUnidade to set
     */
    public void setCodigoUnidade(int codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the precoCompra
     */
    public double getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

   
}
