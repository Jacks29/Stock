/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.controller;

import padaria.model.Login;

/**
 *
 * @author caico
 */
public class LoginController {
    
    public boolean Loga(String login, String senha){
        
        if(login!= null && login.length()>0 && senha!= null && senha.length()>0){
            Login logar = new Login();
            logar.login = login;           
            logar.senha = senha;
            logar.Loga(logar);
            return true;
        }
        return false;
    }
    
    
}
