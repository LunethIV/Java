
package proyectoprog06_tarea2;
import java.util.Scanner;
public class Ejercicios {

/*
Declarar y crear un vector de 10 elementos de tipo entero.
Generar un vector que almacene los valores de la tabla de multiplicar
del 5. Mostrar los valores del array.
*/
    public static void ej2 (){
        int array[] = new int [10];

        for (int i = 0; i < array.length; i++){
            array[i] = 5 * i;
            System.out.print(array[i]);
        }
    }
    
/*
Declarar, crear e inicializar un vector de 17 elementos de tipo entero
con valores: 7,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33, 2,287,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33, 2,28.
a. Contar las veces que se repite el valor 10 dentro del vector.
b. Contar cuántos elementos poseen valores nulos, positivos y negativos.
*/    
    public static void ej3 (){
           
         int array[] = {7,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33, 2,28};
         int contador10 = 0;
         int negativo = 0;
         int positivo = 0;
         
        for (int i = 0; i < array.length; i++){
                
            if (array[i] == 10){
                contador10++;
            }
            else if (array[i] < 0){
                negativo++;
            }
            else if (array[i] > 0){
                positivo++;
            }
        }
        System.out.println("El 10 aparace: " + contador10 + " veces");
        System.out.println("Numeros positivos: " + positivo);
        System.out.println("Numero negativos: " + negativo);
    }
/*
Diseñar un programa que pida por teclado 10 elementos de tipo real.
Calcular la media aritmética de todas las notas, y además indicar
cuántas notas son superiores, inferiores o iguales a la media.
*/    
    public static void ej4 (){
        Scanner sc = new Scanner(System.in);
        
        // Declarar array de 10 elementos
        double notas[] = new double[10];
        
        // Leer las notas por teclado
        for (int i = 0; i < notas.length; i++){
            System.out.println("Introduce la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        // Calcular la media aritmetica
        double media = 0;
        
        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media /= notas.length;
        
        // Contar las notas superiores, inferiores e iguales a la media
        int superiores = 0;
        int inferiores = 0; 
        int iguales = 0;
        
        for (int i = 0; i < notas.length; i++){
            if(notas[i] > media){
                superiores++;
            }
            else if (notas[i] < media){
                inferiores++;
            }
            else{
                iguales++;
            }                 
        }
        // Imprimimos los resultados
        System.out.println("La media aritmética es " + media);
        System.out.println("Hay " + superiores + " notas superiores a la media.");
        System.out.println("Hay " + inferiores + " notas inferiores a la media.");
        System.out.println("Hay " + iguales + " notas iguales a la media.");
    }
    
/**
Diseñar un programa clase que calcule la desviación estándar de 6 números
*/
    public static void ej5(){
        //Se introducen por teclado 6 números enteros y se guardan en un array
             
       System.out.println("Introducción de los 6 números enteros:");
       int[] v =Vectores.introducir_array_unidimensional(6);
       
       //Cálculo de la fórmula
       //1. Cálculo de la media de los 6 números
       float suma=0.0f;
       
        for (int i = 0; i < v.length; i++) {
            suma+=v[i];
        }
        
        float media=suma/v.length;
        
        //Sumatorio de (v[i] - media) elevado a 2
        suma=0.0f;
        
        for (int i = 0; i < v.length; i++) {
            suma+=Math.pow(v[i]-media, 2);
        }
        
        double desviacion=Math.sqrt(1.0/v.length * suma);
        
        System.out.println("La desviación estándard es "+desviacion);
    }
    
    public static void ej7(){
        Scanner sc = new Scanner(System.in);
        
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0;
        boolean esBisiesto = false;
        
        // Solicitar dia, mes y año
        System.out.println("Introduce el día");
        int dia = sc.nextInt();
        sc.nextLine(); // Capturar el enter de día
        
        System.out.println("Introduce el mes");
        String mes = sc.nextLine();
        
        System.out.println("Introduce el año");
        int año = sc.nextInt();
        
        // Comprobar si el año el bisiesto
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)){
            esBisiesto = true;
        }
        
        // Qué ocurre si es bisiesto o no
        if (esBisiesto == true){
            dias[1] = 29;
        }
        else {
            dias[1] = 28;
        }
        
        // Calcular dias transcurridos
        
        for (int i = 0; i < dias.length; i++){
            if (meses[i].equals(mes)){
                total += dia;
                break;
            }
            else{
                total += dias[i];
            }
        }
        System.out.println("Los días transcurridos desde el 1 de enero hasta el "+ dia + " de " + mes + " es: " + total);
    }
}
