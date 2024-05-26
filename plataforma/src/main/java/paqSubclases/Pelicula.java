
package paqSubclases;

import paqEjecutable.Producto;

public class Pelicula extends Producto{
    
    // Atributos
    protected int numPelicula;
    protected String genero;
    protected int duracion;
    protected final static float tipoIva = 0.21f;
    
    // Constructor
    public Pelicula(String nombreProd, int precio, int numPelicula, String genero, int duracion){
        super(nombreProd,precio);
        this.numPelicula = numPelicula;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    public Pelicula(int numPelicula,String genero,int duracion, Producto producto){
        super(producto.getNombreProd(),producto.getPrecio());
        this.numPelicula = numPelicula;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    public Pelicula(Pelicula other){
        super(other.nombreProd,other.precio);
        this.numPelicula = other.numPelicula;
        this.genero = other.genero;
        this.duracion = other.duracion;
    }

    public int getNumPelicula() {
        return numPelicula;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public static float getTipoIva() {
        return tipoIva;
    }

    public void setNumPelicula(int numPelicula) {
        this.numPelicula = numPelicula;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "nombreProd: "+this.nombreProd+"\nprecio: "+this.precio+"\nnumPelicula: "+this.numPelicula+"\ngenero: "+this.genero+"\nduracion: "+this.duracion;
    }
    
    @Override
    public float precioIVA(){
        float total = this.precio * Pelicula.tipoIva;
        
        return total;
    }
}