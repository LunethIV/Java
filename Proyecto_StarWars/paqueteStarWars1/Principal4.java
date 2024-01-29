
package paqueteStarWars1;

public class Principal4 {


    public static void main(String[] args) {
        // o) Crea los personajes: luke, darthVader y yoda.
        Personaje luke = new Personaje("Luke",500,300,100,2,1);
        Personaje darthvader = new Personaje("Darth Vader", 500,200,500,3,4);
        Personaje yoda = new Personaje("Yoda",400,100,600,4,5);
        
        // p) Se muestran los personajes con su id junto al resto de atributos.
        System.out.println(luke.toString());
        System.out.println(darthvader.toString());
        System.out.println(yoda.toString());
        
        // q) Se desea saber el valor de ContPersonajes.
        System.out.println("El valor de ContPersonajes es: " + Personaje.getContPersonajes());
    }
}