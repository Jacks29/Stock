
package stock;

import java.time.Instant;

public class ThreadAuditoria extends Thread{
    private boolean status;
    private AreaComum areaComum= new AreaComum();
    
    @Override
    public void run() {
        status=true;
        
        while (status) {
            try {
                
                if(AreaComum.queue.size()==0){
                
                }
                else{
                   String msg = AreaComum.queue.remove();
                
                   if (msg != null) {
                      logaMensagemBancoAuditoria(msg);
                   }
                   Thread.sleep(1);
                }
                
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    private void logaMensagemBancoAuditoria(String msg) throws InterruptedException {
        System.out.printf("%s - Valor %s\n", Instant.now().toString(), msg);
        Thread.sleep(500);
    }
}
