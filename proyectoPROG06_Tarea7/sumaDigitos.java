/*
Leer 10 números enteros, almacenarlos en un
vector y determinar en qué posición está el número cuya suma de
dígitos sea la mayor
 */
public class sumaDigitos {

    public static void main(String[] args) {
        
        // Leer los numeros
        int[] v = new int[10];
        
        for(int i = 0; i < v.length; i++){
            v[i] = Introducir.entero("Introduce el valor " + i);
        }
        
        // Calcular la suma de los digitos
        int[] sumas = new int[v.length];
        
        for(int i = 0; i < sumas.length; i++){
            sumas[i] = Introducir.sumaDigitios(v[i]);
        }
        
        // Calcular la posición donde se encuentra
        int posicionMayor = 0;
        for(int i = 0; i < sumas.length; i++){
            if(sumas[i] > sumas[posicionMayor]){
                posicionMayor = i;
            }
        }
        
        // Imprimir la posición del número con la mayor suma de dígitos
        System.out.println("La posición del número con la mayor suma de dígitos es " + posicionMayor);
    }
}