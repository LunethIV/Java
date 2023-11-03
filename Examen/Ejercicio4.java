/* 
Crear un programa denominado entero_menor. En su interior se generará
al azar un número entero n en el rango [5..20]. El método devolverá el
menor número entero m que cumpla con la condición:
1+2+3+…+n<m! 
*/

package cursojava;

public class Ejercicio4 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * (20-5) + 5);
        int suma = 0;
        
        // Calcular la suma de los números de 1 a n
        for (int i = 1; i <= n; i++){
            
            suma += i;
        }
        
        // Buscar el número cuyo factorial sea menor o igual que la suma
        int m = 1;
        int factorial = 1;
        
        while(suma > factorial){
            m++;
            factorial *= m;
        }
        // Imprimimos el resultado
        System.out.println("El número cuyo factorial es menor o igual que la suma es " + (m - 1));
    }   
}
