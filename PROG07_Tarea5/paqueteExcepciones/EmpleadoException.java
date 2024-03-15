
package paqueteExcepciones;


public class EmpleadoException extends Exception{
    
    public EmpleadoException(){
        super("Empleado con errores");
    }
    
    public EmpleadoException(String msg){
        super(msg);
    }
}
