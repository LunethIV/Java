
package paquetePublicacion;

/**
 *
 * @author Lun
 */

import java.time.LocalDate;
import paqueteInterfaces.*;

public class Libro extends Publicacion implements Prestable, Reservable{
    
    // Atributos
    
    protected boolean prestado;
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaDevolucion;
    protected boolean reservado;
    protected String telefonoReserva;
    
    // Constructor  
    
    public Libro(String titulo, int añoPubli){
        super(titulo,añoPubli);
        this.prestado = false;
        this.fechaPrestamo = null;
        this.fechaDevolucion = null;
        this.reservado = false;
        this.telefonoReserva = null;
    }
    
    // Métodos

    public boolean isPrestado() {
        return prestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isReservado() {
        return reservado;
    }

    public String getTelefonoReserva() {
        return telefonoReserva;
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

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void setTelefonoReserva(String telefonoReserva) {
        this.telefonoReserva = telefonoReserva;
    }

    @Override
    public String toString() {
        return "Libro{" + "prestado=" + prestado + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", reservado=" + reservado + ", telefonoReserva=" + telefonoReserva + '}';
    }
    
    @Override
    public void prestar() throws IllegalArgumentException{
        if(this.prestado == true){
            throw new IllegalArgumentException("Error, el libro ya está prestado");
        }else{
         this.fechaPrestamo = LocalDate.now();
         this.fechaDevolucion = this.fechaPrestamo.plusDays(15);
         this.prestado = true;
        }
    }
    
    @Override
    public void devolver(){
        if(this.prestado == false){
            throw new IllegalArgumentException("Error, el libro no está prestado");
        }else{
            this.prestado = false;            
        }
       
        if(this.reservado == true){
            System.out.println("Avisando al teléfono " + telefonoReserva + " de que el libro está disponible");
            reservado = false;
            telefonoReserva = null;
            prestar();
        }else{
            prestado = false;
        }
    }
    
    @Override
    public void reservar(String telefono){
        if(this.reservado == true){
            throw new IllegalArgumentException("Error, el libro ya está reservado");
        }else{
            this.reservado = true;
            this.telefonoReserva = telefono;
        }
    }
}