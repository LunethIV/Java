
package paqueteExcepciones;

/**
 *
 * @author Lun
 */
public class EmpleadoException extends Exception{
    
    public EmpleadoException(){
        super("Empleado con errores");
    }
    
    public EmpleadoException(String msg){
        super(msg);
    }
}
