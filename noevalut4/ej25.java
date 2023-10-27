//Se desea diseñar un algoritmo tal que se introduzcan tres números enteros
//que representen la hora, los minutos y los segundos. Se desea que
//muestre cuál será la hora cuando haya transcurrido un segundo.

 // @author Lun

package noevalut4;
import java.util.Scanner;
public class ej25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        int segundos, minutos, horas;
        
        // Leer tiempos
        System.out.println("Introducir segundos");
        segundos = sc.nextInt();
        System.out.println("Introducir minutos");
        minutos = sc.nextInt();
        System.out.println("Introducir horas");
        horas = sc.nextInt();
        
        // Incrementar segundos
        segundos++;
        
        // Comprobar si se ha pasado de 60 segundos
        if (segundos == 60){
            segundos = 0;
            minutos++;
        }
        // Comprobar si se ha pasado de 60 minutos
        if (minutos == 60){
            minutos = 0;
            horas++;
        }
        // Imprimir resultado en pantalla
        System.out.println("La hora incrementada es:" + horas + ":" + minutos + ":" + segundos);
                 
    }
    
}
