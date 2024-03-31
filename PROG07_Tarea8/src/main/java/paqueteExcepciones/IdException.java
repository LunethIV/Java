
package paqueteExcepciones;

/**
 *
 * @author Lun
 */
public class IdException extends EmpleadoException{
    
    public IdException(){
        super("Id de empleado con errores");
    }
    
    public IdException(String msg){
        super(msg);
    }
}
