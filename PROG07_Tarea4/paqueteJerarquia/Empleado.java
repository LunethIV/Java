
package paqueteJerarquia;
import paqueteOtros.*;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    
    // Atributos
    protected Nie nie = null;
    protected Nif nif = null;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNac;
    protected LocalDate fechaTrabajo;
    protected float sueldo = 0.0f;
    
    // Constructor
    public Empleado(Object object,String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo)throws Exception{
        if(object == null){
            throw new Exception("Error, un empleado debe tener nif o nie de forma obligada");
        }
        if(!(object instanceof Nif) && !(object instanceof Nie)){
            throw new Exception("Error, un empleado debe tener nif o nie y no otra cosa");
        }
        
        
        if(object instanceof Nif){
            this.nif = (Nif) object;
            this.nie = null;
        }else{
            this.nie = (Nie) object;
            this.nif = null;
        }
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.fechaTrabajo = fechaTrabajo;
        this.sueldo = 0.0f;
    }
    
    
    // Métodos
    public String tiempoEmpresa(){
        
        int periodo = Period.between(fechaTrabajo, LocalDate.now()).getYears();
        
        if(periodo > 1){
            return periodo+"Años";
        }else{
            return periodo+"Año";
        }    
    }
    
    public abstract float calculaSueldo();
    
    /*toString(): con nie o nif (según el caso), nombre, apellidos, fecha de
    Nacimiento (con formato dd/mm/yyyy) y tiempo en la empresa y sueldo.*/
    @Override
    public String toString(){
        if(nif != null){
            return "Nif: "+nif+" Nombre: "+nombre+" Apellidos: "+apellidos+" FechaNac: "+Fecha.fechaFormateada(fechaNac)+" TiempoEmpresa: "+tiempoEmpresa()+" Sueldo: "+sueldo;
        }else{
            return "Nie: "+nie+" Nombre: "+nombre+" Apellidos: "+apellidos+" FechaNac: "+Fecha.fechaFormateada(fechaNac)+" TiempoEmpresa: "+tiempoEmpresa()+" Sueldo: "+sueldo;
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

    public float getSueldo() {
        return sueldo;
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

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
