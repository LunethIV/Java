/*Leer 10 números enteros, almacenarlos
  en un vector y determinar en qué posición está el número con mas
  dígitos.*/

public class NumConMasDigitos {

    public static void main(String[] args) {
        
        int[] v = new int[10];
        
        for(int i = 0; i < v.length; i++){
            v[i] = Introducir.entero("Introduce el valor de la posición " + i);
        }
        
        int posicion = 0;
        
        for(int i = 0; i < v.length; i++){
            // Calcular el número con más dígitos
            int numDigitos = Integer.toString(v[i]).length();
            
            if(numDigitos > v[posicion]){
                posicion = i;
            }
        }
        
        System.out.println("El número con más dígitos está en la posición " + posicion);
    }
}