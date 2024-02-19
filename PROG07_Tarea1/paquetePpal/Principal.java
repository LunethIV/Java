
package paquetePpal;

import java.time.LocalDate;
import java.util.ArrayList;
import paqueteSuper.*;
import paqueteSub.*;

public class Principal {

    public static void main(String[] args) {
        
       // a) Crea una fecha con los valores 4, 10 y 1975.
       int dia = 4;
       int mes = 10;
       int año = 1975;
       LocalDate fecha = LocalDate.of(año,mes,dia);
       // b) Crea un animal a1 con el peso: 3 y la fecha anterior.
       Animal a1 = new Animal(3,fecha);
       // c) Crea un vertebrado v1 con los valores del animal a1 y número de vértebras: 14.
       Vertebrado v1 = new Vertebrado(a1,14);
       
       // d) Crea el ArrayList hijos con 5 hijos con los valores “Pepe”,(3-10-2000); “Carlos”, (16-2-2004); “Maria”,(7-07-2005); “Juan”,(18-8-2006); y “Ana”,(18-8-2006).
       ArrayList<Hijo> hijos = new ArrayList();
       hijos.add(new Hijo("Pepe",LocalDate.of(2000,10,3)));
       hijos.add(new Hijo("Carlos",LocalDate.of(2004, 2, 16)));
       hijos.add(new Hijo("Maria",LocalDate.of(2005,7,7)));
       hijos.add(new Hijo("Juan",LocalDate.of(2006, 8, 18)));
       hijos.add(new Hijo("Ana",LocalDate.of(2006, 8, 18)));
       
       // e) Crea un hombre h1 con nombre: “Pedro Pérez”, está vivo, con los 5 hijos del ArrayList anterior, con el vertebrado v1,.
       Hombre h1 = new Hombre("Pedro Pérez",true,hijos,v1);
       // f) a1=h1; //El animal a1 toma forma de h1. Indica qué atributos y métodos puede usar. ¿Qué método toString utiliza?
        a1 = h1;
        // Respuesta: Utiliza el toString de hombre, pero los métodos de animal.
        
       // g) Cambia el peso del animal a1 a 45 Kg.
       a1.setPeso(45);
       
       // h) Mostrad el peso del hombre h1 ¿Qué valor tiene?
       System.out.println("Peso h1: "+h1.getPeso());        
       
       // i) h1 tiene un nuevo hijo, “Raquel”,(01-01-2019).
       h1.tenerHijo(new Hijo("Raquel",LocalDate.of(2019, 01, 01)));
       
       // j) ¿Cuál es la edad del hijo menor de h1?
        System.out.println("Edad h1: "+h1.edadHijoMenor());
       // k) Mostrad los datos del hijo menor de h1.
        System.out.println("Datos hijo menor: "+h1.hijoMenor());
       // l) Se quiere saber tan solo el nombre del hijo menor de h1.
        System.out.println("Nombre hijo menor h1: "+h1.hijoMenor().getNombre());
       // m) Se quiere saber el nombre del hijo que ocupa la posición 4 del hombre h1.
        System.out.println("Posición: "+h1.darHijo(4));
       // n) h1 muere.
       h1.morir();
       // o) h1 muere.
       h1.morir();
    }
}