    /*Almacenar en un vector de 10 posiciones los 10
      números primos comprendidos entre 100 y 300. Luego mostrarlos en
      pantalla.*/

public class NumPrimos {
    
    public static void main(String[] args) {
        
        int[] v = new int [10];
        int contador = 0;
        
        for(int i = 100, j = 0; i <= 300; i++){
            if(Introducir.esPrimo(i)){
                v[j] = i;
                j++;
                contador++;
            }
            else if(contador == 10){
                break;
            }
        }
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }
}