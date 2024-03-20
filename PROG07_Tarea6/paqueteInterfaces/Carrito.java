
package paqueteInterfaces;

/**
 *
 * @author Lun
 */
import java.util.ArrayList;

public class Carrito {
    
    // Atributos
    protected ArrayList<Vendible> listaCarrito;
    
    // Constructor
    public Carrito(){
        listaCarrito = new ArrayList<>();
    }
    
    // Métodos
    public void addCarrito(Vendible v){

        if(!listaCarrito.contains(v)){
            listaCarrito.add(v);
        }else{
            System.out.println("El objeto ya está en el carrito");
        }        
    }
    
    public void muestraCarrito(){
        
        for(Vendible v:listaCarrito){
            System.out.println(v);
        }
    }
    
    public double precioTotalCarrito(){
        double precioTotal = 0;
        
        for(Vendible v:listaCarrito){
            precioTotal += v.precioIva();
        }
        
        return precioTotal;
    }
    
    public void mostrarCarritoViajes(){
        for(Vendible v:listaCarrito){
            if(v instanceof Viaje){
                System.out.println("-"+v);
            }
        }
    }
    
    public void mostrarCarritoDestinoViajes(){
        for(Vendible v:listaCarrito){
            if(v instanceof Viaje){
                System.out.println("-"+((Viaje) v).getDestino());
            }
        }
    }
}
