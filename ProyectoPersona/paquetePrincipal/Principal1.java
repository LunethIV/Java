
package paquetePrincipal;

import paquetePersona.*;

public class Principal1 {

    public static void main(String[] args) {
        
        // a) Introduce el dni (sin letra) de una persona por teclado.
        int dni = Introducir.entero("Introducir dni:");
        
        // b) Crea un Nif con ese valor.
        Nif a = new Nif(dni);       
        
        // c) Mostrar ese mismo Nif.
        System.out.println(a);          
        
        // d) Introduce un nif (cadena) por teclado.
        String dni2 = Introducir.cadena("Introduce el DNI con letra:");
        
        // e) Crea un Nif con ese valor.
        Nif b = new Nif(dni2);
        
        // f) Comprobar si los Nif c) y e) son iguales.
        if(a.equals(b)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }   
}