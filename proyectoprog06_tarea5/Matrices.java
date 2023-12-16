
package proyectoprog06_tarea5;

import java.util.Scanner;

public class Matrices {
    
    public static void introducir_matrizEnteros(int[][] matriz, int filas, int columnas){
        Scanner sc = new Scanner(System.in);
        
        matriz = new int[filas][columnas];
        
        for(int i = 0; i < filas; i++){
            
            for(int j = 0; j < columnas; j++){              
                matriz[i][j] = Introducir.entero("Introduzca el elemento [" + i +"][" + j + "]: ");
            }
        }
    }
    
    public static void mostrar_matrizEnteros(int[][] matriz){
        
        for(int i = 0; i < matriz.length; i++){
            
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}