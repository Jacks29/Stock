package stock.Controllers;

import stock.Models.UsuarioViewModel;
import stock.DAO.UsuarioDAO;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class UsuarioController {

    private UsuarioDAO dao = new UsuarioDAO();


    public String CadastraLogin(String nome, String login, String senha, String cargo, String unidade, int codigoUnidade) {

        if(login == null | login.trim().length() == 0)
            return "Por Favor Preencha um login v�lido";
        if(nome == null | nome.trim().length() == 0)
            return "Por Favor Preencha um nome v�lido";
        if(senha == null | senha.trim().length() == 0)
            return "Por Favor Preencha uma senha v�lida";
        if(cargo == null | cargo.trim().length() == 0)
            return "Por Favor Preencha um cargo v�lido";
        if(codigoUnidade == 0 | codigoUnidade < 0)
            return "Por favor Preencha um c�digo de unidade v�lido";

        UsuarioViewModel usuario = new UsuarioViewModel();

        usuario.setNome(nome);
        usuario.setCargo(cargo);
        usuario.setSenha(senha);
        usuario.setLogin(login);
        usuario.setCodigoUnidade(codigoUnidade);

        dao.update(usuario);

        return "Cadastro de usuario realizado com sucesso!";
    }

    public String EditaUsuario(String nome,String login,String cargo,String senha, int  codigoUnidade){

        if(login == null | login.trim().length() == 0)
            return "Por Favor Preencha um login v�lido";
        if(nome == null | nome.trim().length() == 0)
            return "Por Favor Preencha um nome v�lido";
        if(senha == null | senha.trim().length() == 0)
            return "Por Favor Preencha uma senha v�lida";
        if(cargo == null | cargo.trim().length() == 0)
            return "Por Favor Preencha um cargo v�lido";
        if(codigoUnidade == 0 | codigoUnidade < 0)
            return "Por favor Preencha um c�digo de unidade v�lido";

        UsuarioViewModel usuario = new UsuarioViewModel();

        usuario.setNome(nome);
        usuario.setCargo(cargo);
        usuario.setSenha(senha);
        usuario.setLogin(login);
        usuario.setCodigoUnidade(codigoUnidade);


        dao.update(usuario);

        return "Altera��o de usu�rio editado com sucesso!";
    }

    public void ExcluiUsuario(int codigoUsuario){
        dao.excluir(codigoUsuario);
    }
       
}
