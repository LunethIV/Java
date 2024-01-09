
package paqueteStarWars1;

public class Principal1 {

    public static void main(String[] args) {
        
        // a) Crea los personajes: luke, darthVader y yoda.
        Personaje personaje1 = new Personaje();
        Personaje personaje2 = new Personaje();
        Personaje personaje3 = new Personaje();
        
        personaje1.setNombre("Luke");
        personaje1.setSalud(500);
        personaje1.setFisico(300);
        personaje1.setFuerza(100);
        personaje1.setNivel(2);
        personaje1.setPh(1);
        
        personaje2.setNombre("Darth Vader");
        personaje2.setSalud(500);
        personaje2.setFisico(200);
        personaje2.setFuerza(500);
        personaje2.setNivel(3);
        personaje2.setPh(4);
        
        personaje3.setNombre("Yoda");
        personaje3.setSalud(400);
        personaje3.setFisico(100);
        personaje3.setFuerza(500);
        personaje3.setNivel(4);
        personaje3.setPh(5);
        
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