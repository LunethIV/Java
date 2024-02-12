
package paqueteSuper;

import java.time.LocalDate;
import java.time.Period;

public class Hijo {
    
    // Atributos
    private String nombre;
    private LocalDate fechaNac;
    
    // Constructores
    public Hijo(String nombre, LocalDate fecha){
        this.nombre = nombre;
        this.fechaNac = fecha;
    }
    
    public Hijo(String nombre){
        this.fechaNac = LocalDate.now();
        this.nombre = nombre;
    }
    
    public Hijo(Hijo other){
        this(other.nombre, other.fechaNac);
    }
    
    public String getNombre(){
        return nombre;
    }

    // Setters y getters
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public int Edad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }
    
    @Override
    public String toString(){
        return "\nNombre hijo: "+this.nombre+" \nNacimiento hijo: "+fechaNac+" \nEdad: "+Edad();
    }
}
