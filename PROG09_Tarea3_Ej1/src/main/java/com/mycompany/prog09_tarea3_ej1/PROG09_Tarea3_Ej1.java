/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog09_tarea3_ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class PROG09_Tarea3_Ej1 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String cadena;        
        
         ArrayList<Tractor> listaTractores = new ArrayList<>();

            Tractor t1 = new Tractor("E0400", "Juan Gomez");
            Tractor t2 = new Tractor("E0200", "Jose Perez");
            Tractor t3 = new Tractor("E0100", "Lucia Martinez");
            Tractor t4 = new Tractor("E0300", "Marta Garcia");

            listaTractores.add(t1);
            listaTractores.add(t2);
            listaTractores.add(t3);
            listaTractores.add(t4);

            ArrayList <Tractor> copia;
            
        int opcion;

        do {
            System.out.println("------Ayto. de La Murta-------------");
            System.out.println("Menu :");
            System.out.println("1. Alta tractores");
            System.out.println("2. Listado por orden de insercion");
            System.out.println("3. Listado ascendente por matricula");
            System.out.println("4. Listado descendente por matricula");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            cadena = teclado.nextLine();
            opcion=Integer.parseInt(cadena);
                      
           
            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");                   
                   
                    //pedir por teclado un tractor nuevo
                    System.out.println("Dime la matricula: "); 
                    String mat=teclado.nextLine();
                    System.out.println("Dime el dueño: ");
                    String duenio=teclado.nextLine();
                    Tractor nuevo=new Tractor(mat, duenio);
                    //comprobar si existe
                    if (!existeTractor(nuevo, listaTractores))
                        listaTractores.add(nuevo);
                    break;
                   
                case 2:
                    System.out.println("Opcion 2");
                     
                    for (Tractor tractor : listaTractores) {
                        System.out.println(tractor);
                    }           

                    break;
                
                case 3:
                    System.out.println("Opcion 3");
                    copia=new ArrayList <>(listaTractores); // se conserva el original
                    Collections.sort(copia); //se ordena la copia 

                    for (Tractor tractor : copia) {
                        System.out.println(tractor);
                    }           

                    break;
                
                case 4:
                    System.out.println("Opcion 4");
                    copia=new ArrayList <>(listaTractores); // se conserva el original
                    Collections.sort(copia, Collections.reverseOrder()); //se ordena la copia en orden descendente

                    for (Tractor tractor : copia) {
                        System.out.println(tractor);
                    }           
                    
                    break;
                
                case 0:
                    System.out.println("Saliendo");
                    break;
                
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

    }
    
     public static boolean existeTractor(Tractor t, ArrayList <Tractor> lista){
        boolean existe=false;
        for(Tractor tractor: lista){
            if (t.getMatricula()==tractor.getMatricula()){ existe=true; break;}
        }
        return existe;
    }  
}

    

