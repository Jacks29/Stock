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
 * @param <Padr�oDAO>
 */
public interface BaseDAO<Padr�oDAO> {
    
    public void inserir(Padr�oDAO variavel);
    
    public void update(Padr�oDAO variavel);
    
    public void excluir(int id);
    
    public ArrayList<Padr�oDAO> consultar();
    
}

