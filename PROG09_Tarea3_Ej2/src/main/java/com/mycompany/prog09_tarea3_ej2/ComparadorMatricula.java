/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog09_tarea3_ej2;

import java.util.Comparator;

/**
 *
 * @author danielmartinez
 */
public class ComparadorMatricula implements Comparator<Tractor> {

        @Override
        public int compare(Tractor t1, Tractor t2) {
            return t1.getMatricula().compareToIgnoreCase(t2.getMatricula());
        }
    
    }
