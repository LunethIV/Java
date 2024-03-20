
package paqueteInterfaces;

/**
 *
 * @author Lun
 */
public class Alimentacion extends Producto{
    
    // Atributos
    private static double IVA = 0.04d;
    
    // Constructor
    public Alimentacion(String nombre, double precio){
        super(nombre,precio);
    }
    
    // Métodos
    public double getIva(){
        return Alimentacion.IVA;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIVA: "+ getIva();
    }
      
    @Override
    public double precioIva(){
        return (this.precio * Alimentacion.IVA) / 100;
    }
}