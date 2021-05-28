/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.Models;

/**
 *
 * @author alves
 */
public class UnidadeViewModel {

    /**
     * @return the codigoUnidade
     */
    
    private int codigoUnidade;
    private String franquia;
    
    public int getCodigoUnidade() {
        return codigoUnidade;
    }

    /**
     * @param codigoUnidade the codigoUnidade to set
     */
    public void setCodigoUnidade(int codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    /**
     * @return the franquia
     */
    public String getFranquia() {
        return franquia;
    }

    /**
     * @param franquia the franquia to set
     */
    public void setFranquia(String franquia) {
        this.franquia = franquia;
    }
}
