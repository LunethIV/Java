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
public class ComparadorDuenioMatricula implements Comparator<Tractor> {
        
        @Override
        public int compare(Tractor t1, Tractor t2) {
            if (t1.getNombreDuenio().equals(t2.getNombreDuenio())) {
                return t1.getMatricula().compareToIgnoreCase(t2.getMatricula());
            }
            
            return t1.getNombreDuenio().compareToIgnoreCase(t2.getNombreDuenio());
        }
    }
