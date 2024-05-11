/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog09_tarea3_ej3;

import java.time.LocalDate;

/**
 *
 * @author danielmartinez
 */
public class Tractor {
    // ATRIBUTOS
    private String matricula;
    private int numBastidor;
    private String nombreDuenio;
    private LocalDate fechaCompra;

    // CONSTRUCTOR

    public Tractor(String matricula, int numBastidor, String nombreDuenio, LocalDate fechaCompra) {
        this.matricula = matricula;
        this.numBastidor = numBastidor;
        this.nombreDuenio = nombreDuenio;
        this.fechaCompra = fechaCompra;
    }
    
    // MÉTODOS SETTER Y GETTER
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }
    
    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    
        public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Tractor con matricula = " + matricula + " numBastidor = " + numBastidor + ", nombre del dueño = " + nombreDuenio + ", fecha de compra = " + fechaCompra;
    }
}
