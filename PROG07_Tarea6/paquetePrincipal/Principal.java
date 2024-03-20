
package paquetePrincipal;

import paqueteInterfaces.*;

public class Principal {

    public static void main(String[] args) {
        
        // Crea dos productos de alimentación: “Leche”,0.4, y “Huevos”,0.35
        
        Alimentacion leche = new Alimentacion("Leche",0.4);
        Alimentacion huevos = new Alimentacion("Huevos",0.35);
        
        // Crea dos productos de ropa: “Blusa Rosa”,18 y “Pantalón”,20
        
        Ropa blusa = new Ropa("Blusa Rosa",18);
        Ropa pantalon = new Ropa("Pantalón",20);
        
        // Crea un viaje : “Murcia”, “Madrid”, 3, 400.
        
        Viaje murcia = new Viaje("Murcia","Madrid",3.400);
        
        // Crea un carrito
        
        Carrito carro = new Carrito();
        
        // Añade todos los elementos anteriores en el carrito.
        
        carro.addCarrito(leche);
        carro.addCarrito(huevos);
        carro.addCarrito(blusa);
        carro.addCarrito(pantalon);
        carro.addCarrito(murcia);
        
        // Mostrar los valores del carrito.
        
        carro.muestraCarrito();
        
        // Mostrar el precio total del carrito.
        
        System.out.println(carro.precioTotalCarrito());
        
        // Mostrar todos los elementos del Carrito que sean viajes.
        
        carro.mostrarCarritoViajes();
        
        // Se desea saber destino de los viajes que se han incluído al carrito.
        
        carro.mostrarCarritoDestinoViajes();
    }
}