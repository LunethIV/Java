
package paquetePublicacion;

/**
 *
 * @author Lun
 */
public class Revista extends Publicacion{
    
    // Atributos
    protected int numero;
    
    // Constructor
    public Revista(int numero,String titulo,int añoPubli) throws IllegalArgumentException{
        super(titulo,añoPubli);
        this.numero = numero;
        if(numero <= 0){
            throw new IllegalArgumentException("Error, el número debe ser positivo y entero");
        }
    }
    
    // Métodos

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" + "numero=" + numero + '}';
    }
    
    
}
