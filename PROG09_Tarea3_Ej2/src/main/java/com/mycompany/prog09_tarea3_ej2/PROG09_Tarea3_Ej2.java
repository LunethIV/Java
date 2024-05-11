/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog09_tarea3_ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class PROG09_Tarea3_Ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
          String cadena;        
        
         ArrayList<Tractor> listaTractores = new ArrayList<>();

            Tractor t1 = new Tractor("E0400",4,"Juan Gomez",LocalDate.of(2020,10,23));
            Tractor t2 = new Tractor("E0200", 2,"Juan Gomez",LocalDate.of(2022,11,21));
            Tractor t3 = new Tractor("E0100", 1, "Lucia Martinez",LocalDate.of(2021,10,24));
            Tractor t4 = new Tractor("E0300", 3, "Marta Garcia",LocalDate.of(2020,10,24));

            listaTractores.add(t1);
            listaTractores.add(t2);
            listaTractores.add(t3);
            listaTractores.add(t4);

             ArrayList <Tractor> copia; //Para conservar el arrayList original
        int opcion;

        do {
            System.out.println("-----Ayto. de Archena--------------");
            System.out.println("Menu:");
            System.out.println("1. Alta tractores");
            System.out.println("2. Listado por orden de insercion");
            System.out.println("3. Listado ascendente por matricula");
            System.out.println("4. Listado descendente por matricula");
            System.out.println("5. Listado ascendente por fecha de compra");
            System.out.println("6. Listado ascendente por dueño+matricula");
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
                    System.out.println("Dime el numero del bastidor: "); 
                    cadena=teclado.nextLine();
                    int bastidor=Integer.parseInt(cadena);
                    System.out.println("Dime el dueño: ");
                    String duenio=teclado.nextLine();
                    System.out.println("Dime la fecha de compra: (AAAA-MM-DD) ");
                    cadena=teclado.nextLine();
                    LocalDate fecha=LocalDate.parse(cadena);
                    Tractor nuevo=new Tractor(mat, bastidor, duenio,fecha);
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
                    Collections.sort(copia, new ComparadorMatricula()); //se ordena la copia 
                                        
                    for (Tractor tractor : copia) {
                        System.out.println(tractor);
                    }           

                    break;
                
                case 4:
                    System.out.println("Opcion 4");
                    copia=new ArrayList <>(listaTractores); // se conserva el original                    
                    Collections.sort(copia, Collections.reverseOrder(new ComparadorMatricula())); //en orden inverso
                    
                    for (Tractor tractor : copia) {
                        System.out.println(tractor);
                    }           
                    
                    break;
                
                case 5:
                    System.out.println("Opcion 5");
                    copia=new ArrayList <>(listaTractores); // se conserva el original                    
                    Collections.sort(copia,new ComparadorFechaCompra()); 
                    
                    for (Tractor tractor : copia) {
                        System.out.println(tractor);
                    }           
                    
                    break;
                    
                case 6:
                    System.out.println("Opcion 6");
                    copia=new ArrayList <>(listaTractores); // se conserva el original                    
                    Collections.sort(copia,new ComparadorDuenioMatricula()); //en orden inverso
                    
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
