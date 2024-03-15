
package paqueteExcepciones;


public class NumHorasException extends EmpleadoException{
    
    public NumHorasException(){
        super("Numero de Horas de Empleado por Horas con errores");
    }
    
    public NumHorasException(String msg){
        super(msg);
    }
}
