package stock;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import stock.Views.TelaLogin;

public class Main {
    public static void main(String[] args) throws IOException {
        ThreadAuditoria thread = new ThreadAuditoria();
        thread.run();
        TelaLogin frame = new TelaLogin();
        frame.setVisible(true);       
    }    
}
