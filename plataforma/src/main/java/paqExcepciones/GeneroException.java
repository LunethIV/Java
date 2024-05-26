
package paqExcepciones;

public class GeneroException extends Exception{
    
    public GeneroException(){
        super("Error en genero");
    }
    
    public GeneroException(String msg){
        super(msg);
    }
}
