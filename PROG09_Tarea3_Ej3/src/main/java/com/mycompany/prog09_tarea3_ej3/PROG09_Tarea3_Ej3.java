/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog09_tarea3_ej3;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class PROG09_Tarea3_Ej3 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String cadena; 
          String matricula;
          int numBastidor;
          String duenio;
        
         Abanilla listaTractores = new Abanilla();

            Tractor t1 = new Tractor("E0400",4,"Juan Gomez",LocalDate.of(2020,10,23));
            Tractor t2 = new Tractor("E0200", 2,"Juan Gomez",LocalDate.of(2022,11,21));
            Tractor t3 = new Tractor("E0100", 1, "Lucia Martinez",LocalDate.of(2021,10,24));
            Tractor t4 = new Tractor("E0300", 3, "Marta Garcia",LocalDate.of(2020,10,24));

            listaTractores.altaTractor(t1);
            listaTractores.altaTractor(t2);
            listaTractores.altaTractor(t3);
            listaTractores.altaTractor(t4);    
         

        int opc;

        do {
            System.out.println("\n--- AYUNTAMIENTO DE ABANILLA ---");
            System.out.println("\n1. Dar de alta a un tractor.");
            System.out.println("2. Listado de tractores según orden de inserción.");
            System.out.println("3. Listado de tractores en ORDEN ASCENDENTE de matrícula");
            System.out.println("4. Listado de tractores en ORDEN DESCENDENTE de matrículas");
            System.out.println("5. Listado de tractores por ORDEN ASCENDENTE por fecha de Compra");
            System.out.println("6. Listado de tractores por ORDEN ASCENDENTE del nombre de dueño + matricula");
            System.out.println("0. Salir");

            System.out.print("\nElige una opción: ");
            cadena = teclado.nextLine();
            opc = Integer.parseInt(cadena);

            switch (opc) {
                case 1 -> {
                    System.out.println("\n--- DAR DE ALTA TRACTOR ---");
                    System.out.print("\nMatrícula del tractor: ");
                    matricula = teclado.nextLine();

                    System.out.print("Número de bastidor: ");
                    cadena = teclado.nextLine();
                    numBastidor = Integer.parseInt(cadena);

                    System.out.print("Nombre del dueño: ");
                    duenio = teclado.nextLine();

                    System.out.print("Fecha de la compra (YYYY-MM-DD): ");
                    cadena = teclado.nextLine();
                    LocalDate fechaCompra = LocalDate.parse(cadena);

                    Tractor trac = new Tractor(matricula, numBastidor, duenio, fechaCompra);

                    listaTractores.altaTractor(trac);
                }
                
                case 2 -> {
                    listaTractores.listadoOrdenInsercion();
                }
                
                case 3 -> {
                    listaTractores.listadoOrdenAscenMatricula();
                }
                
                case 4 -> {
                    listaTractores.listadoOrdenDescenMatricula();
                }
                
                case 5 -> {
                    listaTractores.listadoOrdenAscFechaCompra();
                }
                
                case 6 -> {
                    listaTractores.listadoOrdenAscDuenioMatricula();
                }
            }
        } while (opc != 0);

}
}
    

