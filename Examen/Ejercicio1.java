//Crear un programa llamado ley_de_ohm que leerá un número entero n
//por teclado. Dicho número será el número de iteraciones de un bucle que
//permitirá hacer cálculos sobre el voltaje conforme a la ley de Ohm: V = I *
//R. La intensidad I se generará al azar en el rango [10..100] como número
//entero. La resistencia R se generará al azar en el rango [20.100] como
//número entero. Se deben mostrar los resultados según el siguiente
//formato.

package cursojava;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     int n = sc.nextInt();
     
     System.out.println("Paso      R       I      V");
     System.out.println("____________________________");
     
        for (int paso = 1; paso <= n; paso++){
            int intensidad = (int) (Math.random() * (100-10 + 1) + 10);
            int resistencia = (int) (Math.random() * (100-20+1) + 20);
            int voltaje = intensidad * resistencia;
            
            System.out.println(paso+"         "+resistencia+"     "+intensidad+"      "+voltaje);
        }
    }
}   
