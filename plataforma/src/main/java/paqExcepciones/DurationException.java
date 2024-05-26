
package paqExcepciones;

public class DurationException extends Exception {
    
    public DurationException(){
        super("Excepcion generada por la duracion erronea de una pelicula");
    }
    
    public DurationException(String msg){
        super(msg);
    }
}
