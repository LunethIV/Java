//Crear un programa llamado divisores que genere 100 números enteros al
//azar dentro del rango [1..2000] y nos diga cuántos de ellos no son
//divisibles ni por 2 ni por 3 ni por 5 ni por 7. Hay que hacer también el
//pseudocódigo.

package cursojava;

public class Ejercicio3 {


    public static void main(String[] args) {
        
       // Declarar variable para crear contador
       int contador = 0;
        
       // Crear bucle que se repite 100 veces, creando 100 números aleatorios
        for (int i = 0; i < 100; i++){
            int aleatorio = (int) (Math.random() * (2000-1+1) + 1);
            // Si el número no es divisible entre 2,3,5 y 7, se suma +1 al contador
            if (aleatorio % 2 != 0 && aleatorio % 3 != 0 && aleatorio % 5 != 0 && aleatorio % 7 != 0){
                contador++;            
            }
        }
        // Se imprime el resultado por pantalla
        System.out.println("No son divisores: " + contador);
    }   
}
