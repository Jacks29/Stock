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
public class AlteracaoPrecoPorDataViewModel {

    /**
     * @return the codigoAlteracao
     */
    private int codigoAlteracao;
    private int codigoProduto;
    private String porcentagemDeAumento;
    private String porcentagemDeDesconto;
    private Date dataAlteracaoInicio;
    private Date dataAlteracaoFim;
    private int codigoUsuario;
    
    public int getCodigoAlteracao() {
        return codigoAlteracao;
    }

    /**
     * @param codigoAlteracao the codigoAlteracao to set
     */
    public void setCodigoAlteracao(int codigoAlteracao) {
        this.codigoAlteracao = codigoAlteracao;
    }

    /**
     * @return the codigoProduto
     */
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
     * @return the porcentagemDeAumento
     */
    public String getPorcentagemDeAumento() {
        return porcentagemDeAumento;
    }

    /**
     * @param porcentagemDeAumento the porcentagemDeAumento to set
     */
    public void setPorcentagemDeAumento(String porcentagemDeAumento) {
        this.porcentagemDeAumento = porcentagemDeAumento;
    }

    /**
     * @return the porcentagemDeDesconto
     */
    public String getPorcentagemDeDesconto() {
        return porcentagemDeDesconto;
    }

    /**
     * @param porcentagemDeDesconto the porcentagemDeDesconto to set
     */
    public void setPorcentagemDeDesconto(String porcentagemDeDesconto) {
        this.porcentagemDeDesconto = porcentagemDeDesconto;
    }

    /**
     * @return the dataAlteracaoInicio
     */
    public Date getDataAlteracaoInicio() {
        return dataAlteracaoInicio;
    }

    /**
     * @param dataAlteracaoInicio the dataAlteracaoInicio to set
     */
    public void setDataAlteracaoInicio(Date dataAlteracaoInicio) {
        this.dataAlteracaoInicio = dataAlteracaoInicio;
    }

    /**
     * @return the dataAlteracaoFim
     */
    public Date getDataAlteracaoFim() {
        return dataAlteracaoFim;
    }

    /**
     * @param dataAlteracaoFim the dataAlteracaoFim to set
     */
    public void setDataAlteracaoFim(Date dataAlteracaoFim) {
        this.dataAlteracaoFim = dataAlteracaoFim;
    }

    /**
     * @return the codigoUsuario
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}
