
package proyectoPROG06_Tarea1;

public class Ej4 {

    public static void main(String[] args) {
        
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};               
        
        int dia = Introducir.entero("Introduce el día");
        int mes = Introducir.entero("Introduce el mes");
        int año = Introducir.entero("Introduce el año");
        boolean esBisiesto = Fecha.bisiesto(año);
        
        if (esBisiesto == true){
            dias[1] = 29;
        }
        else {
            dias[1] = 28;
        }
        
        if(año >= 0 && año <= 3000 && mes >=1 && mes <= 12 && dia >=1 && dia <= dias[mes]){
         System.out.println("La fecha es válida");
        }
        else
         System.out.println("La fecha no es válida");       
    }    
}