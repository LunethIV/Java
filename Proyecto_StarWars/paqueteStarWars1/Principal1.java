
package paqueteStarWars1;

public class Principal1 {

    public static void main(String[] args) {
        
        // a) Crea los personajes: luke, darthVader y yoda.
        Personaje personaje1 = new Personaje("Luke", 500,300,100,2,1);
        Personaje personaje2 = new Personaje("Darth Vader",500,200,500,3,4);
        Personaje personaje3 = new Personaje("Yoda",400,100,500,4,5);        
        
        // b) Muestra los valores de los atributos de los 3 personajes.
        System.out.println("Valores de Luke");
        System.out.println("______________________");
        System.out.println(personaje1.toString());
        
        System.out.println("");
        
        System.out.println("Valores de Darth Vader");
        System.out.println("______________________");
        System.out.println(personaje2.toString());
        
        System.out.println("");
        
        System.out.println("Valores de Yoda");
        System.out.println("______________________");
        System.out.println(personaje3.toString());
        
        System.out.println("");
        
        // c) Cambia el físico de luke a 55. Después muestra el físico de luke.
        personaje1.setFisico(55);
        System.out.println("El nuevo físico de Luke es: " + personaje1.getFisico());
        
        System.out.println("");
        
        // d) Daña la salud de luke con 10.
        personaje1.defensa(10);
        
        System.out.println("");
        
        /* e) Se produce un ataque físico de luke, con el valor generado daña la
              salud de darthVader. Intenta hacerlo en 1 sola línea ¿?. */
        
        personaje2.defensa(personaje1.ataque_fisico());
        
        // f) Muestra la salud de darthVader
        System.out.println("Salud de DarthVader: "+personaje2.getSalud());
        
        // g) Cambia la fuerza de darthVader a 600
        personaje2.setFuerza(600);
        
        // h) Muestra los datos completos de los 3 personajes
        System.out.println("Valores de Luke");
        System.out.println("______________________");
        System.out.println(personaje1.toString());
        
        System.out.println("");
        
        System.out.println("Valores de Darth Vader");
        System.out.println("______________________");
        System.out.println(personaje2.toString());
        
        System.out.println("");
        
        System.out.println("Valores de Yoda");
        System.out.println("______________________");
        System.out.println(personaje3.toString());
        
        // i) Se produce un ataque de fuerza de darthVader dañando la salud de yoda.
        personaje3.defensa(personaje2.ataque_fuerza());
        
        // j) Muestra la salud de yoda.
        System.out.println("La salud de Yoda tras el ataque es: "+personaje3.getSalud());
        
        // k) ¿yoda está vivo?
        if(personaje3.isVivo()){
            System.out.println("Yoda sigue vivo");
        }else{
            System.out.println("Yoda ha muerto");
        }
        
        // l) Muestra los valores de los 3 personajes
        System.out.println("Valores de Luke");
        System.out.println("______________________");
        System.out.println(personaje1.toString());
        
        System.out.println("");
        
        System.out.println("Valores de Darth Vader");
        System.out.println("______________________");
        System.out.println(personaje2.toString());
        
        System.out.println("");
        
        System.out.println("Valores de Yoda");
        System.out.println("______________________");
        System.out.println(personaje3.toString());
    }
}