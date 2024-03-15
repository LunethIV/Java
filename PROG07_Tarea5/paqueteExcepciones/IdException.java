
package paqueteExcepciones;


public class IdException extends EmpleadoException{
    
    public IdException(){
        super("ERROR CON ID EMPLEADO");
    }
    
    public IdException(String msg){
        super(msg);
    }
}
