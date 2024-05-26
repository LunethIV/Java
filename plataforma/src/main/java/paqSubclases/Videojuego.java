
package paqSubclases;

import paqEjecutable.Producto;

public class Videojuego extends Producto{
    
    // Atributos
    protected int numVideojuego;
    protected final static float tipoIva = 0.04f;
    
    // Constructores
    public Videojuego(String nombreProd, int precio, int numVideojuego){
        super(nombreProd,precio);
        this.numVideojuego = numVideojuego;
    }
    
    public Videojuego(int numVideojuego, Producto producto){
        super(producto.getNombreProd(),producto.getPrecio());
        this.numVideojuego = numVideojuego;
    }
    
    public Videojuego(Videojuego other){
        super(other.nombreProd,other.getPrecio());
        this.numVideojuego = other.numVideojuego;
    }

    public int getNumVideojuego() {
        return numVideojuego;
    }

    public static float getTipoIva() {
        return tipoIva;
    }

    public void setNumVideojuego(int numVideojuego) {
        this.numVideojuego = numVideojuego;
    }

    @Override
    public String toString() {
        return "NombrePord: " + nombreProd + " Precio: "+precio+ "NumVideojuego: "+numVideojuego;
    }       
    
    @Override
    public float precioIVA(){
        float total = this.precio * Videojuego.tipoIva;       

        return total;
    }
}