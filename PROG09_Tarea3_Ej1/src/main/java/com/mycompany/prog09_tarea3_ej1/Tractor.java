/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog09_tarea3_ej1;
/**
 *
 * @author APardo
 */


class Tractor implements Comparable<Tractor> {
    private String matricula;
    private String nombreDuenio;
    
    //Constructor
    public Tractor(String matricula, String nombreDuenio) {
        this.matricula = matricula;
        this.nombreDuenio = nombreDuenio;
    }

    //getters y setters
    public String getMatricula() {
        return matricula;    
    }
    
    public String getNombreDuenio() {
        return matricula;    
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    
    
    //tostring
    @Override
    public String toString() {
        return "Tractor {matricula=" + matricula + ", nombre del Dueño=" + nombreDuenio + "}";
    }
    
    // comparar por matrícula
    @Override
    public int compareTo(Tractor otroTractor) {
        return this.matricula.compareToIgnoreCase(otroTractor.matricula);
    }

}

