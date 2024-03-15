
package paqueteExcepciones;


public class NieException extends IdException{
    
    
    public NieException(){
        super("Nie de Empleado con errores");
    }
    
    public NieException(String msg){
        super(msg);
    }
}
