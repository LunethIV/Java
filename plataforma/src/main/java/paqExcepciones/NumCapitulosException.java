
package paqExcepciones;

public class NumCapitulosException extends Exception{
    
    public NumCapitulosException(){
        super("Error, numero de capitulos negativo o 0");
    }
    
    public NumCapitulosException(String msg){
        super(msg);
    }
}
