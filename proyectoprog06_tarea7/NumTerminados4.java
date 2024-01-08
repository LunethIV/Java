    /*Leer 10 números enteros, almacenarlos
      en un vector y determinar en qué posiciones se encuentran los
      números terminados en 4.*/

public class NumTerminados4 {
  
    public static void main(String[] args) {
        
        // Leer números
        int[] v = new int[10];
        
        for(int i = 0; i < 10; i++){
            v[i] = Introducir.entero("Introduce el valor " + i);
        }
        
        // Declaramos un vector para almacenar las posiciones
        int[] posiciones = new int[10];
        int contador = 0;
        boolean hay4 = false;
        // Recorremos el vector
        for (int i = 0; i < v.length; i++) {
            // Si el número termina en 4, almacenamos su posición
            if (v[i] % 10 == 4) {
                posiciones[contador] = i;
                contador++;
                hay4 = true;
            }
        }

        // Mostramos las posiciones
        if(hay4){
            System.out.println("Las posiciones de los números terminados en 4 son:");
            for (int i = 0; i < contador; i++) {
                System.out.print(posiciones[i] + " ");
            }   
        }
        else{
            System.out.println("No hay ningún número acabado en 4");
        }
    }
}