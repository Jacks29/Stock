package stock.Controllers;
import stock.Models.UsuarioViewModel;
import stock.DAO.UsuarioDAO;
import stock.AreaComum;


public class LoginController {

    private AreaComum areacomum= new AreaComum();
    private UsuarioDAO dao = new UsuarioDAO();
    
    public String Loga(UsuarioViewModel usuario){
        
        if(usuario.login!= null && usuario.login.length()>0 && usuario.senha!= null && usuario.senha.length()>0){}                             
        else
          return "Preencha os campos corretamente";
        
        if(dao.consultar(usuario)){
          return "Sucesso";
        }
        else
          return "Usuario e senha nao encontrados";  

    }   
    
    public void Desloga(){
        
        areacomum.Cargo=null;
        areacomum.CodUsuario=null;
        areacomum.CodUnidade=null;   
    }
}
