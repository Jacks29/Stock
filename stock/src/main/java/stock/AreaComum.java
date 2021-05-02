/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.util.LinkedList;
import java.util.Queue;

public class AreaComum {
    
    public static Queue<String> queue = new LinkedList<String>();
    
    public void AdicionaFila(String mensagem){       
        queue.add(mensagem);       
    }    
}
