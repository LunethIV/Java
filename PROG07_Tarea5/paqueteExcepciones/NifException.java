
package paqueteExcepciones;


public class NifException extends IdException{
    
    public NifException(){
        super("Nif de Empleado con errores");
    }
    
    public NifException(String msg){
        super(msg);
    }
}
