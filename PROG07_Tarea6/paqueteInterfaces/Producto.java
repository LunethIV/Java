
package paqueteInterfaces;

/**
 *
 * @author Lun
 */
public abstract class Producto implements Vendible{
    
    // Atributos
    protected String nombre;
    protected double precio;
    
    // Constructor
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }  

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }    
}