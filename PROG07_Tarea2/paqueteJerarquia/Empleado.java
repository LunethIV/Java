
package paqueteJerarquia;
import paqueteOtros.*;
import java.time.LocalDate;

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
    
    
}