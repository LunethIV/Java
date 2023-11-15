
package proyectoprog06_tarea2;

public class Vectores {   
    
    public static void mostrar_array_unidimensional (int array[]){
        
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
    public static int[] generar_array_unidimensional_aleatorio (int elementos){
        int array[];
        array = new int [elementos];
        
        
        for (int i = 0; i < elementos; i++){
            array[i] = (int) (Math.random() * 10 + 1); 
        }
        
        return array;
    }
    
    public static int[] introducir_array_unidimensional (int n){
        int array[]=new int[n];
        
        for (int i = 0; i < array.length; i++){
            array[i]=Introducir.entero("Dime el valor del elemento cuyo índice es "+i+" :");
        }
        return array;
    }
}
