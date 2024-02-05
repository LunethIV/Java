
package paquetePrincipal;

import paquetePersona.*;

public class Principal2 {


    public static void main(String[] args) {
        // a) Introduce un nie por teclado.
        String Nie = Introducir.cadena("Introduce el NIE:");
        
        // b) Crea un Nie ese valor.
        Nie a = new Nie(Nie);
    }    
}
