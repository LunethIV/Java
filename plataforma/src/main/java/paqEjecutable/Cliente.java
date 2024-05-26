
package paqEjecutable;

import java.util.ArrayList;

public class Cliente {
    
    // Atributos
    private int numCliente;
    private String nombre;
    private ArrayList<Producto> productosAlquilados;
    
    // Constructor
    public Cliente(int numCliente,String nombre,ArrayList<Producto> productosAlquilados){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.productosAlquilados = productosAlquilados;
    }
    
    public Cliente(int numCliente,String nombre){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.productosAlquilados = new ArrayList<Producto>();
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductosAlquilados() {
        return productosAlquilados;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductosAlquilados(ArrayList<Producto> productosAlquilados) {
        this.productosAlquilados = productosAlquilados;
    }
    
    // Metodos
    public void alquilar(Producto producto){
        if(!productosAlquilados.contains(producto)){
            productosAlquilados.add(producto);
        }else{
            System.out.println("El producto ya está en la lista.");
        }
    }
    
    public int precioTotal(){
        int total = 0;
        
        for(Producto p:productosAlquilados){
            total += p.precioIVA();
        }
        return total;
    }
    
    public void listado(){
        for(Producto p:productosAlquilados){
            System.out.println(p);
        }
    }
}