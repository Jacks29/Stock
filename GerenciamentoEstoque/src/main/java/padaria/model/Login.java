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
public class Login {
    
    static public String tipoUsuario;
    static public String nomeUsuario;
    public String login;
    public String senha;

    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        Login.tipoUsuario = tipoUsuario;
    }

    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public static void setNomeUsuario(String nomeUsuario) {
        Login.nomeUsuario = nomeUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void Loga(Login login){}
}
