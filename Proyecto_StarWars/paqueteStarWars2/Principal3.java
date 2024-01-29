package paqueteStarWars2;

import paqueteStarWars1.Personaje;

public class Principal3 {

    public static void main(String[] args) {
        
        /* a) Crea los personajes: luke, darthvader y yoda */
        Personaje personaje1 = new Personaje("Luke", 500, 300, 100, 2, 1);
        Personaje personaje2 = new Personaje("DarthVader", 500, 200, 500, 3, 4);
        Personaje personaje3 = new Personaje("Yoda", 400, 100, 600, 4,5);
        
        /* b) Genera una batalla, para ello, ejecuta mientras luke y yoda estén vivos y darthvader esté vivo*/
        
        /* a) darthVader va a atacar, o a luke o a yoda, para ello, genera un número
              al azar ‘personajeAtaque’ (usa el método: generaNumAleatorio de
              MisMetodos de entre 1 y 2). */

        do{
            int personajeAtaque = MisMetodos.generaNumAleatorio(2, 1);
            
            /* a) Si personajeAzar es 1, el ataque se producirá de darthVader a luke. */
            if(personajeAtaque == 1){
                
                /* a) Muestra el número de ataque y de quién contra quién */
                System.out.println("Ataque 1: Darth Vader ataca a Luke");
                
                // b) Genera un ataque entre 1 y 2: ataqueAzar.                            
                int ataqueAzar = MisMetodos.generaNumAleatorio(2, 1);
                                
                if(ataqueAzar == 1){
                    personaje1.defensa(personaje2.ataque_fisico()); // a) Si ataqueAzar es 1, es un ataque físico.
                }else{
                    personaje1.defensa(personaje2.ataque_fuerza()); // b) Si ataqueAzar es 2, es ataque por fuerza.
                }
                System.out.println("La salud de Luke tras la pelea es: " + personaje1.getSalud());
                
                if(personaje1.isVivo()){
                    ataqueAzar = MisMetodos.generaNumAleatorio(2, 1);
                   
                    if(ataqueAzar == 1){
                        personaje1.defensa(personaje2.ataque_fisico()); // a) Si ataqueAzar es 1, es un ataque físico.
                    }else{
                        personaje1.defensa(personaje2.ataque_fuerza()); // b) Si ataqueAzar es 2, es ataque por fuerza.
                    }
                    System.out.println("La salud de Darth Vader tras la pelea es: " + personaje2.getSalud());
                }
            }else{
                    System.out.println("Ataque 2: Darth Vader ataca a Yoda");

                    int ataqueAzar = MisMetodos.generaNumAleatorio(2, 1);

                    if(ataqueAzar == 1){
                        personaje3.defensa(personaje2.ataque_fisico());
                    }else{
                        personaje3.defensa(personaje2.ataque_fuerza());
                    }
                    System.out.println("La salud de Yoda tras el ataque es: " + personaje3.getSalud());
                }
        }while(personaje1.isVivo() && personaje3.isVivo() && personaje2.isVivo());
        
        if(personaje1.isVivo()){
            System.out.println("Luke sigue vivo");
        }
        if(personaje2.isVivo()){
            System.out.println("Darth Vader sigue vivo");
        }
        if(personaje3.isVivo()){
            System.out.println("Yoda sigue vivo");
        }
    }
}