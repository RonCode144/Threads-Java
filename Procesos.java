
public class Procesos extends Thread{
    
    private String mensaje;
    
    public Procesos (String msg){
        super(msg);
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 15; i++){
            System.out.println(mensaje);
        }
        System.out.println("Este proceso ha terminado " + this.getName());
    }
    
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
}
