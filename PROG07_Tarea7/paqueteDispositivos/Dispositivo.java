
package paqueteDispositivos;

/**
 *
 * @author Lun
 */

import java.time.LocalDate;
import paqueteInterfaces.*;

public class Dispositivo implements Prestable{
    
    // Atributos
    private String tipo;
    private int numReferencia;
    private String modelo;
    private boolean prestado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    // Constructor
    public Dispositivo(String tipo, int numReferencia, String modelo)throws IllegalArgumentException{
        this.tipo = tipo;
        this.numReferencia = numReferencia;
        this.modelo = modelo;
        this.prestado = false;
        if(numReferencia <= 0){
            throw new IllegalArgumentException("Error, el número de referencia debe ser positivo");
        }
    }
    
    // Métodos
    @Override
    public String toString(){
        if(prestado){
            return "Prestado: Sí"+" Tipo: "+tipo+" numReferencia: "+numReferencia+" Modelo: "+modelo+" FechaPrestamo: "+fechaPrestamo+" FechaDevolucion: "+fechaDevolucion;
        }else{
            return "Prestado: No"+" Tipo: "+tipo+" numReferencia: "+numReferencia+" Modelo: "+modelo;
        }
    }
    
    @Override
    public void prestar(){
        if(prestado){
            throw new IllegalArgumentException("Error, el dispositivo ya está prestado");
        }else{
            this.fechaPrestamo = LocalDate.now();
            this.fechaDevolucion = this.fechaPrestamo.plusDays(7);
            this.prestado = true;
        }
    }
    
    @Override
    public void devolver(){
        if(!prestado){
            throw new IllegalArgumentException("Error, el dispositivo no está prestado");
        }else{
            System.out.println("El dispositivo: " + numReferencia + " ha sido devuelto");
            this.prestado = false; 
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
}
