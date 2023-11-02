//Crear un programa llamado numero_mayor que leerá un número entero.
//Dicho número indicará el número de datos enteros que habrá que leer por
//teclado a continuación. Habrá que determinar cuál es el máximo de entre
//los número leídos. A continuación se generará al azar otro número entero
//en el rango [1.100]. El programa mostrará cuál es el mayor de los 2
//números (del máximo calculado y del generado al azar).

package cursojava;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidadNumeros;
        int numero;
        int max;
        int aleatorio;
        
        // Leer cantidad de numeros a leer
        System.out.println("Introduce la cantidad de números a leer");
        cantidadNumeros = sc.nextInt();
        
        // Iniciar máximo
        max = Integer.MIN_VALUE;
        
        // Leer los números
        for (int i = 0; i < cantidadNumeros; i++){
            System.out.println("Introduce el número");
            numero = sc.nextInt();
            
            // Actualizar máximo necesario
            if (numero > max){
                max = numero;
            }
        }
        // Generar número aleatorio
        aleatorio = (int) (Math.random() * (100) + 1);
        
        System.out.println("El mayor número es " + (max > aleatorio ? max : aleatorio));
    }    
}