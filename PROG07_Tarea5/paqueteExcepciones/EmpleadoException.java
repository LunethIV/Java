
package paqueteExcepciones;


public class EmpleadoException extends Exception{
    
    public EmpleadoException(){
        super("ERROR");
    }
    
    public EmpleadoException(String msg){
        super(msg);
    }
}
