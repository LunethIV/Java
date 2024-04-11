
package paqueteExcepciones;

/**
 *
 * @author Lun
 */
public class NieException extends IdException{
    
    public NieException(){
        super("Nie de empleado con errores");
    }
    
    public NieException(String msg){
        super(msg);
    }
}
