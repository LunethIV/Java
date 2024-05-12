/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog09_tarea3_ej4;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author isabel
 */
public class PROG09_Tarea3_Ej4 {

    public static void main(String[] args) {
        TreeMap<String, Tractor> aytoTorrePacheco = new TreeMap<>();

        Scanner teclado = new Scanner(System.in);
        String cadena, matricula, duenio;
        int opc, numBastidor;

        Tractor t1 = new Tractor(4,"Juan Gomez",LocalDate.of(2020,10,23));
        Tractor t2 = new Tractor(2,"Juan Gomez",LocalDate.of(2022,11,21));
        Tractor t3 = new Tractor( 1, "Lucia Martinez",LocalDate.of(2021,10,24));
        Tractor t4 = new Tractor( 3, "Marta Garcia",LocalDate.of(2020,10,24));
        
        aytoTorrePacheco.put("E0400", t1);
        aytoTorrePacheco.put("E0200", t2);
        aytoTorrePacheco.put("E0100", t3);
        aytoTorrePacheco.put("E0300", t4);

        do {
            System.out.println("\n--- AYUNTAMIENTO DE TORRE PACHECO ---");
            System.out.println("\n1. Dar de alta a un tractor.");
            System.out.println("2. Listado de tractores en ORDEN ASCENDENTE de matrícula.");
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

                    Tractor trac = new Tractor(numBastidor, duenio, fechaCompra);

                    aytoTorrePacheco.put(matricula, trac);
                    System.out.println("");
                }

                case 2 -> {
                    for (String matr : aytoTorrePacheco.keySet()) {
                        System.out.println("Tractor con matrícula = " + matr + " - Datos: " + aytoTorrePacheco.get(matr));
                    }
                    System.out.println("");
                }
            }
        } while (opc != 0);
    }
}
