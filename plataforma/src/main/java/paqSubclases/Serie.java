
package paqSubclases;

import paqEjecutable.Producto;
import paqExcepciones.*;

public class Serie extends Producto{
    
    // Atributos
    protected int numSerie;
    protected int numCapitulos;
    protected String genero;
    protected final static float tipoIva = 0.1f;
    
    // Constructor
    public Serie(String nombreProd, int precio, int numSerie, int numCapitulos, String genero) throws NumCapitulosException, GeneroException{
        super(nombreProd,precio);
        this.numCapitulos = numCapitulos;
        this.numSerie = numSerie;
        this.genero = genero;
        
        if(numCapitulos <= 0){
            throw new NumCapitulosException();
        }else if(!genero.equals("COMEDIA") && !genero.equals("TERROR") && !genero.equals("DRAMA") && !genero.equals("BELICA") && !genero.equals("ANIMACION")){
            throw new GeneroException();
        }
    }
    
    public Serie(int numSerie, int numCapitulos, String genero, Producto producto) throws NumCapitulosException, GeneroException{
        super(producto.getNombreProd(),producto.getPrecio());
        this.numSerie = numSerie;
        this.numCapitulos = numCapitulos;
        this.genero = genero;
        
        if(numCapitulos <= 0){
            throw new NumCapitulosException();
        }else if(!genero.equals("COMEDIA") && !genero.equals("TERROR") && !genero.equals("DRAMA") && !genero.equals("BELICA") && !genero.equals("ANIMACION")){
            throw new GeneroException();
        }
    }
    
    public Serie(Serie other) throws NumCapitulosException, GeneroException{
       super(other.nombreProd,other.precio);
       this.numSerie = other.numSerie;
       this.numCapitulos = other.numCapitulos;
       this.genero = other.genero;
       
        if(numCapitulos <= 0){
            throw new NumCapitulosException();
        }else if(!genero.equals("COMEDIA") && !genero.equals("TERROR") && !genero.equals("DRAMA") && !genero.equals("BELICA") && !genero.equals("ANIMACION")){
            throw new GeneroException();
        }
    }

    public int getNumSerie() {
        return numSerie;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    public String getGenero() {
        return genero;
    }

    public static float getTipoIva() {
        return tipoIva;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setNumCapitulos(int numCapitulos)throws NumCapitulosException {
            if(numCapitulos <= 0){
                throw new NumCapitulosException();
            }else{
                this.numCapitulos = numCapitulos;
            }           
    }

    public void setGenero(String genero)throws GeneroException {
        if(!genero.equals("COMEDIA") && !genero.equals("TERROR") && !genero.equals("DRAMA") && !genero.equals("BELICA") && !genero.equals("ANIMACION")){
            throw new GeneroException();
        }else{
            this.genero = genero;
        }       
    }

    @Override
    public String toString() {
        return "NombreProducto: "+this.nombreProd+"\nprecio: "+this.precio+"\nnumSerie: "+numSerie+"\nnumCapitulos: "+this.numCapitulos+"\ngenero: "+this.genero;
    }
    
    @Override
    public float precioIVA(){
        float total = this.precio * Serie.tipoIva;
        
        return total;
    }
}
