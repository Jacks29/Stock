/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.DAO;

import java.util.ArrayList;

/**
 *
 * @author alves
 * @param <PadrãoDAO>
 */
public interface BaseDAO<PadrãoDAO> {
    
    public void inserir(PadrãoDAO variavel);
    
    public void update(PadrãoDAO variavel);
    
    public void excluir(int id);
    
    public ArrayList<PadrãoDAO> consultar();
    
}

