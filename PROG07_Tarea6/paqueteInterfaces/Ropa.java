
package paqueteInterfaces;

/**
 *
 * @author Lun
 */
public class Ropa extends Producto{
    
    // Atributos
    protected static double IVA = 0.1d;
    
    // Constructor
    public Ropa(String nombre, int precio){
        super(nombre,precio);
    }
    
    // Métodos
    public double getIva(){
        return Ropa.IVA;
    }
    
    @Override
    public String toString(){
        return "ROPA"+super.toString();
    }
    
    @Override
    public double precioIva(){
        return (this.precio * Ropa.IVA) / 100;
    }
}
