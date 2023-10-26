// @author Lun

package paquete7;

import java.util.Scanner;

public class TerraMiticaFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aforoMax = 2;
        int bebés = 0;
        int niños = 0;
        int adolescentes = 0;
        int adultos = 0;
        int precioEntrada;
        int recaudacionNiños = 0;
        int recaudacionAdolescentes = 0;
        int recaudacionAdultos = 0;
        int recaudacionTotal = 0;
        int niñosPesoInferior = 0;
        int niñosSobrepeso = 0;
        int adolescentesPesoNormal = 0;
        int adolescentesSobrepeso = 0;
        int adultosPesoSuperior = 0;
        int adultosSobrepeso = 0;
        
        System.out.println("_______________________________________________________________________");
        
        int hora = Leer.enteroPositivo("Dime la hora: el horario es de 8 a 19, a las 20 se cierra");
        
        // Comprobamos si estamos dentro del horario de apertura
        if (hora >= 8 && hora <= 19){
          
            
            // Iniciamos el bucle para registrar a la gente
            for (int i = 0; i < aforoMax; i++){
              
                String nombre = Leer.cadena("Introduce el nombre");
                int edad = Leer.enteroPositivo("Introduce la edad");
                double peso = Leer.realDoblePositivo("Introduce el peso");
                short altura = (short) Leer.enteroPositivo("Dime la altura");

                byte imc = Calculo.imc(peso, altura);
                
                // Calcular el precio de la entrada y el número de asistentes
                if (edad < 4){
                   precioEntrada = 0;
                   bebés++;
                }
                
                if (edad >= 4 && edad < 12){
                    precioEntrada = 8;
                    recaudacionNiños += precioEntrada;
                    niños++;
                }
                if (edad >= 12 && edad <= 23){
                    precioEntrada = 15;
                    recaudacionAdolescentes += precioEntrada;
                    adolescentes++;
                }
                if (edad > 23){
                    precioEntrada = 20;
                    recaudacionAdultos += precioEntrada;
                    adultos++;
                }
                // Calcular la recaudación total
              recaudacionTotal = (recaudacionNiños + recaudacionAdolescentes + recaudacionAdultos);
              
              // Calcular peso
              // Niños
              if (edad >= 4 && edad < 12 && imc == 1){
                  niñosPesoInferior++;
              }
                  else if (edad >= 4 && edad < 12 && imc == 4){
                  niñosSobrepeso++;
              }
              // Adolescentes
              if (edad >= 12 && edad < 23 && imc == 2){
                  adolescentesPesoNormal++;
              }
              else if (edad >= 12 && edad < 23 && imc == 4){
                  adolescentesSobrepeso++;
              }
              // Adultos
              if (edad > 23 && imc == 3){
                  adultosPesoSuperior++;
              }
              else if (edad > 23 && imc == 4){
                  adultosSobrepeso++;
              }
            }
        }
        
        
        System.out.println("Número de niños que han asistido: " + niños);
        System.out.println("Número de niños con peso inferior a lo normal: " + niñosPesoInferior);
        System.out.println("Número de niños con sobrepeso: " + niñosSobrepeso);
        System.out.println("Recaudación por niños: " + recaudacionNiños);
        System.out.println("Número de adolescentes que han asistido: " + adolescentes);
        System.out.println("Número de adolescentes con peso normal: " + adolescentesPesoNormal);
        System.out.println("Número de adolescentes con sobrepeso: " + adolescentesSobrepeso);
        System.out.println("Recaudación por adolescentes: " + recaudacionAdolescentes);
        System.out.println("Número de adultos que han asistido: " + adultos);
        System.out.println("Número de adultos con peso superior al normal: " + adultosPesoSuperior);
        System.out.println("Número de adultos con sobrepeso: " + adultosSobrepeso);
        System.out.println("Recaudación por adultos: " + recaudacionAdultos);
        System.out.println("Recaudación total: " + recaudacionTotal);
    }     
}
