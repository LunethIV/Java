
package paqueteJerarquia;
import paqueteOtros.*;
import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    
    // Atributos
    protected Nie nie;
    protected Nif nif;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNac;
    protected LocalDate fechaTrabajo; // Se refiere a la fecha de alta en la empresa
    protected int sueldo;
    
    // Constructores
    public Empleado(Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo)throws IllegalArgumentException{
        if(nif == null && nie == null){
            throw new IllegalArgumentException("Error, un empleado debe tener nif o nie");
        }
        
        this.nie = nie;
        this.nif = nif;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.fechaTrabajo = fechaTrabajo;
        this.sueldo = 0;
    }
    
    // Métodos
    public String tiempoEmpresa(){
        LocalDate fechaActual = LocalDate.now();
        
        Period tiempo = Period.between(fechaTrabajo, fechaActual);
        
        LocalDate fecha = fechaActual.plus(tiempo);
        
        String fechaFinal = Fecha.fechaFormateada(fecha);
        
        return fechaFinal;
    }
    
    public int calculaSueldo(){
        return 0;
    }

    @Override
    public String toString() {
        
        if(nif != null){
                    return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + ", fechaTrabajo=" + fechaTrabajo + ", sueldo=" + sueldo + '}';
        }else{
                    return "Empleado{" + "nie=" + nie + " nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + Fecha.fechaFormateada(fechaNac) + ", fechaTrabajo=" + fechaTrabajo + ", sueldo=" + sueldo + '}';
        }
    }

    public Nie getNie() {
        return nie;
    }

    public Nif getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public LocalDate getFechaTrabajo() {
        return fechaTrabajo;
    }

    public void setNie(Nie nie) {
        this.nie = nie;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaTrabajo(LocalDate fechaTrabajo) {
        this.fechaTrabajo = fechaTrabajo;
    }
}