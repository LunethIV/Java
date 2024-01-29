package paqueteTriangulo;

import paqueteStarWars1.Personaje;


public class Principal2 {

    public static void main(String[] args) {
        
        // a) Crea los triángulos: t1 y t2
        Triangulo t1 = new Triangulo(10,12);
        Triangulo t2 = new Triangulo(7,5);
        
        // b) Muestra los valores de los dos triángulos (base, altura e hipotenusa).
        System.out.println(t1);
        System.out.println("Hipotenusa de t1: " + t1.getHipotenusa());
        System.out.println("____________________________");
        
        System.out.println(t2);
        System.out.println("Hipotenusa de t2: " + t2.getHipotenusa());
        
        System.out.println("____________________________");
        
        // c) Duplica el tamaño de t1, y muestra la base de t1.
        t1.duplicaTamaño();
        System.out.println("Base duplicada de t1: " + t1.getBase());
        
        System.out.println("____________________________");
        
        // d) Amplía el tamaño de t2 en 7 unidades, muestra la altura de t2.
        t2.ampliaTamaño(7);
        System.out.println("La altura de t2 ampliada es: " + t2.getAltura());
        System.out.println("____________________________");
        
        // e) Muestra el valor del área, perímetro e hipotenusa de t1.
        System.out.println("El área de t1 es: " + t1.area());
        System.out.println("El perímetro de t1 es: " + t1.perimetro());
        System.out.println("La hipotenusa de t1 es: " + t1.getHipotenusa());
        System.out.println("____________________________");

        // f) Cambia la base de t2 por el valor de la altura de t1 multiplicado por 2.
        t2.setBase(t1.getAltura() * 2);
        System.out.println("Base de t2 tras calculo: " + t2.getBase());
        System.out.println("____________________________");
        
        // g) Muestra los valores de los atributos de los 2 triángulos.
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("____________________________");
        
        // h) Comprueba si el triángulo t1 es igual al triángulo t2.
        if(t1.equals(t2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        System.out.println("____________________________");
        
        /* i) Crea un Personaje: leia, con los valores: “Leia”, 500,100,50,1,1. ¿Lo puedes hacer? 
              Explica por qué y qué es necesario para ello, si es que se puede. */
              Personaje personaje4 = new Personaje("Leia", 500,100,50,1,1);
              
              /*Sí que se puede, para ello debemos importar la clase "Personaje" del paquete "paqueteStarWars1" tras hacer esto,
                podemos utilizar sus métodos para crear un personaje dentro del paquete "paqueteTriangulo" */
    }
}
