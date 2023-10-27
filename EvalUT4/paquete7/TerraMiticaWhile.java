// @author Lun

package paquete7;

import java.util.Scanner;

public class TerraMiticaWhile {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aforo = 0;
        int precioEntradaNiños;
        int precioEntradaAdolescentes;
        int precioEntradaAdultos;
        int recaudacionTotal = 0;
        int recaudacionNiños = 0;
        int recaudacionAdolescentes = 0;
        int recaudacionAdultos = 0;
        double peso;
        short altura;
        int niños = 0;
        int adolescentes = 0;
        int adultos = 0;
        int niñosPesoInferior = 0;
        int niñosSobrepeso = 0;
        int adolescentePesoNormal = 0;
        int adolescenteSobrepeso = 0;
        int adultosPesoMayor = 0;
        int adultosSobrepeso = 0;
        
            System.out.println("___________________________________________________");

            System.out.println("Introduce la hora: (recepción: 8:00 a 19:00, a las 20:00 se cierra)");
            int hora = sc.nextInt();          
        
        // Comprobar si está abierto
        if (hora >= 8 && hora <= 19){
                
            // El programa se ejecuta en bucle hasta completar el aforo siempre que esté en horario de apertura
            while(aforo != 3000){            
          
                Leer.cadena("Buenos días, introduce el nombre");
               
                int edad = Leer.enteroPositivo("Introduce la edad: ");
                
                peso = Leer.realDoblePositivo("Introduce el peso: ");
                
                altura = (short) Leer.enteroPositivo("introduce la altura: ");
                
                
                byte imc = Calculo.imc(peso, altura);
                  
               // Calcular precio de entradas y recaudación              
               // Niños
                if (edad < 4){                                               
                    niños++;
                    aforo++;
                } 
                
                if (edad >= 4 && edad < 12){
                 precioEntradaNiños = 8;                    
                 recaudacionNiños += precioEntradaNiños;
                 niños++;
                 aforo++;    
                }
                
                // Adolescentes
                if (edad >= 12 && edad <= 23){
                    precioEntradaAdolescentes = 15;
                    recaudacionAdolescentes += precioEntradaAdolescentes;
                    adolescentes++;
                    aforo++;
                }
                
                // Adultos
                if (edad > 23){
                    precioEntradaAdultos = 20;
                    recaudacionAdultos += precioEntradaAdultos;
                    adultos++;
                    aforo++;
                }
                
                //Calcular recaudación total
                recaudacionTotal = (recaudacionNiños + recaudacionAdolescentes + recaudacionAdultos);
                
                // Calcular el peso de los niños
                if (edad < 4 && imc == 1){
                    niñosPesoInferior++;
                }
                else if (edad < 4 && imc == 4){
                    niñosSobrepeso++;
                }
                
                if (edad >= 4 && edad < 12 && imc == 1){
                    niñosPesoInferior++;
                }
                else if (edad >= 4 && edad < 12 && imc == 4){
                    niñosSobrepeso++;
                }
                // Calcular el peso de los adolescentes
                if (edad >= 12 && edad <= 23 && imc == 2){
                    adolescentePesoNormal++;
                }
                else if (edad >= 12 && edad <= 23 && imc == 4){
                    adolescenteSobrepeso++;
                }
                // Calcular el peso de los adultos
                if (edad > 23 && imc == 3){
                    adultosPesoMayor++;
                }    
                else if (edad > 23 && imc == 4){
                    adultosSobrepeso++;
                }
            }
   
            System.out.println("Número de niños que han asistido: " + niños);
            System.out.println("Número de niños con peso inferior al normal: " + niñosPesoInferior);
            System.out.println("Número de niños con sobrepeso: " + niñosSobrepeso);
            System.out.println("La recaudación por niños es: " + recaudacionNiños);
            System.out.println("Número de adolescentes que han acudido: " + adolescentes);
            System.out.println("Número de adolescentes con peso normal: " + adolescentePesoNormal);
            System.out.println("Número de adolescentes con sobrepeso: " + adolescenteSobrepeso);
            System.out.println("La recaudación por adolescentes es: " + recaudacionAdolescentes);
            System.out.println("Número de adultos que ha asistido es: " + adultos);
            System.out.println("Número de adultos con peso superior al normal: " + adultosPesoMayor);
            System.out.println("Número de adultos con sobrepeso: " + adultosSobrepeso);
            System.out.println("La recaudación por adultos es: " + recaudacionAdultos);
            System.out.println("Total de personas que han entrado al parque: " + aforo);
            System.out.println("Recaudación total: " + recaudacionTotal);
        }else
            System.out.println("Está cerrado");
    }
}

