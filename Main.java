
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Procesos hilo1 = new Procesos("Hilo 1");
        Procesos hilo2 = new Procesos("Hilo 2");
        
        hilo1.setMensaje("Mensaje hilo 1");
        hilo2.setMensaje("Mensaje hilo 2");
        
        hilo1.start();
        hilo2.start();
    }
    
}
