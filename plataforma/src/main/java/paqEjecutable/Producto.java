
package paqEjecutable;

public abstract class Producto {
    
    // Atributos
    protected String nombreProd;
    protected static int idProd = 0;
    protected int precio = 0;
    
    // Constructores
    public Producto(String nombreProd, int precio){
        this.nombreProd = nombreProd;
        this.precio = precio;
        Producto.idProd++;
    }
    
    public Producto(Producto other){
        this.nombreProd = other.nombreProd;
        this.precio = other.precio;
    }
    
    // Getters y setters

    public String getNombreProd() {
        return nombreProd;
    }

    public static int getIdProd() {
        return idProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public static void setIdProd(int idProd) {
        Producto.idProd = idProd;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
        
    @Override
    public String toString(){
        return "Nombre: "+this.nombreProd+"\nPrecio: "+this.precio;
    }
    
    // Métodos
    public abstract float precioIVA();
}