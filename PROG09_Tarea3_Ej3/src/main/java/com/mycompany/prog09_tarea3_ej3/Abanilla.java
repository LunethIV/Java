/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog09_tarea3_ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author danielmartinez
 */
public class Abanilla {

    //ATRIBUTOS
    private String nombre;
    private ArrayList<Tractor> listaTractores;

    //CONSTRUCTOR
    public Abanilla() {
        this.listaTractores = new ArrayList<>();
    }

    //MÉTODOS
    public boolean existeTractor(Tractor trac) {
        boolean existe = false;

        for (int i = 0; i < listaTractores.size(); i++) {
            if (listaTractores.get(i).getMatricula().equals(trac.getMatricula())) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void altaTractor(Tractor trac) {
        if (this.existeTractor(trac)) {
            System.out.println("\nEl tractor con matrícula " + trac.getMatricula() + " ya existe");
        } else {
            this.listaTractores.add(trac);
            System.out.println("\nTractor guardado correctamente.");
        }
    }

    //Listados
    public void listadoOrdenInsercion() {
        int c = 1;

        System.out.println("\n--- LISTADO DE TRACTORES POR INSERCCIÓN ---\n");
        for (Tractor trac : this.listaTractores) {
            System.out.println(c + " - " + trac.toString());
            c++;
        }
    }

     //CLASE INTERNA que usan ListadoOrdenAscenMatricula y ListadoOrdenDescenMatricula
    public class ComparadorMatricula implements Comparator<Tractor> {

        @Override
        public int compare(Tractor t1, Tractor t2) {
            return t1.getMatricula().compareToIgnoreCase(t2.getMatricula());
        }
    }

    public void listadoOrdenAscenMatricula() {
        int c = 1;

        ArrayList<Tractor> copia = new ArrayList<>(this.listaTractores);

        Collections.sort(copia, new ComparadorMatricula());

        System.out.println("\n--- LISTADO DE TRACTORES POR ORDEN ASCENDENTE DE MATRÍCULA ---\n");
        for (Tractor trac : copia) {
            System.out.println(c + " - " + trac);
            c++;
        }
    }

    public void listadoOrdenDescenMatricula() {
        int c = 1;

        ArrayList<Tractor> copia = new ArrayList<>(this.listaTractores);

        Collections.sort(copia, Collections.reverseOrder(new ComparadorMatricula()));
        
        System.out.println("\n--- LISTADO DE TRACTORES POR ORDEN DESCENDENTE DE MATRÍCULA ---\n");
        for (Tractor trac : copia) {
            System.out.println(c + " - " + trac);
            c++;
        }
    }

     //CLASE INTERNA que usa listadoOrdenAscFechaCompra   
    public class ComparadorFechaCompra implements Comparator<Tractor> {

        @Override
        public int compare(Tractor t1, Tractor t2) {
            return t1.getFechaCompra().compareTo(t2.getFechaCompra());
        }
    }

    public void listadoOrdenAscFechaCompra() {
        int c = 1;

        ArrayList<Tractor> copia = new ArrayList<>(listaTractores);

        Collections.sort(copia, new ComparadorFechaCompra());

        System.out.println("\n--- LISTADO DE TRACTORES POR ORDEN ASCENDENTE POR FECHA DE COMPRA ---\n");
        for (Tractor trac : copia) {
            System.out.println(c + " - " + trac);
            c++;
        }
    }

     //CLASE INTERNA que usa listadoOrdenAscDuenioMatricula  
    public class ComparadorDuenioMatricula implements Comparator<Tractor> {

        @Override
        public int compare(Tractor t1, Tractor t2) {
            if (t1.getNombreDuenio().equals(t2.getNombreDuenio())) {
                return t1.getMatricula().compareToIgnoreCase(t2.getMatricula());
            }

            return t1.getNombreDuenio().compareToIgnoreCase(t2.getNombreDuenio());
        }
    } 
    
    public void listadoOrdenAscDuenioMatricula() {
        int c = 1;

        ArrayList<Tractor> copia = new ArrayList<>(listaTractores);

        Collections.sort(copia, new ComparadorDuenioMatricula());

        System.out.println("\n--- LISTADO DE TRACTORES POR ORDEN ASCENDENTE POR NOMBRE DUEÑO + MATRÍCULA ---\n");
        for (Tractor trac : copia) {
            System.out.println(c + " - " + trac);
            c++;
        }
    }

  
}
