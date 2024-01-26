
package paqueteFraccion;

import java.util.Scanner;

public class Ppal {

    public static void main(String[] args) {       
        
        // a) Crea la fracción f con 27 y 5, numerador y denominador, respectivamente.
        Fraccion f = new Fraccion(27,5);
        
        // b) Crea la fracción g con los valores 1, 1 (Constructor por defecto).
        Fraccion g = new Fraccion();
        
        // c) Crea la fracción h cuyos valores coinciden con los de g (Constructor por copia).
        Fraccion h = new Fraccion(g);
        
        // d) Crea la fracción j con dos enteros introducidos por teclado.
        int num = Introducir.entero("Establecer numerador: ");
        int den = Introducir.entero("Establecer denominador: ");
        Fraccion j = new Fraccion(num,den);
        
        // e) Muestra los valores de las 4 fracciones.
        System.out.println(f.toString() + "\n" + g.toString() + "\n" + h.toString() + "\n" + j.toString());

        // f) Cambia el numerador y denominador de la fracción f por los valores del denominador de g y del numerador de h, respectivamente. Muestra f
        f.setNum(h.getNum());
        f.setDen(g.getDen());
        System.out.println("El nuevo valor de f es: " + f.toString());
    }
}