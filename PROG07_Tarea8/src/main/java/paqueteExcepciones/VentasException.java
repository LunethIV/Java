
package paqueteExcepciones;

/**
 *
 * @author Lun
 */
public class VentasException extends EmpleadoException{
    
    public VentasException(){
        super("Ventas de Empleado por Comisiones con errores");
    }
    
    public VentasException(String msg){
        super(msg);      
    }
}