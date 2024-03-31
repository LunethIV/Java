
package paqueteJerarquia;

import paqueteOtros.*;
import java.time.LocalDate;
import java.time.Period;
import paqueteExcepciones.*;
import paqueteInterfaces.*;

public abstract class Empleado implements Premiable, Jubilable{
    
    // Propiedades
    protected Nie nie;
    protected Nif nif;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNac;
    protected LocalDate fechaTrabajo;
    protected float sueldo;
    protected boolean despedido = false;
    protected int nivelDiscapacidad;
    protected boolean jubilado = false;
    protected static int EDAD_JUBILACION = 65;
    
    // Constructor
    public Empleado(Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException{
        if(object == null){
            throw new IdException("Error, un empleado debe tener nif o nie de forma obligada");
        }else if(!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String)){
            throw new IdException("Error, un empleado debe tener nif o nie y No otra cosa");
        }else if(object instanceof Nif){
            this.nif = (Nif) object;
            this.nie = null;
        }else if(object instanceof Nie){
            this.nie = (Nie) object;
            this.nif = null;
        }else if(object instanceof String){
            try{
              this.nif = new Nif((String) object); 
            }catch(NifException e){
              this.nie = new Nie((String) object);
            } 
        }
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.fechaTrabajo = fechaTrabajo;
        this.sueldo = 0.0f;
        this.despedido = false;
        this.jubilado = false;
        this.nivelDiscapacidad = 0;
    }
    
    // Métodos
    public String tiempoEmpresa(){
        int dif = Period.between(fechaTrabajo, LocalDate.now()).getYears();
        
        if(dif == 1){
            return "Lleva en la empresa "+dif+" año";
        }else{
            return "Lleva en la empresa "+dif+" años";
        }
    }
    
    public abstract float calculaSueldo();
    
    @Override
    public String toString(){
        if(this.nif != null){
            return "Nif: "+nif+"\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nFechaNac: "+Fecha.fechaFormateada(fechaNac)+"\nTiempo en empresa: "+tiempoEmpresa()+"\nSueldo: "+sueldo;
        }else{
            return "Nie: "+nie+"\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nFechaNac: "+Fecha.fechaFormateada(fechaNac)+"\nTiempo en empresa: "+tiempoEmpresa()+"\nSueldo: "+sueldo;
        }
    }
    
    public void setNif(Nif nif){
        this.nif = nif;
    }
    
    public void setNif(String nif) throws NifException{
        this.nif = new Nif(nif);
    }
    
    public void setNie(Nie nie){
        this.nie = nie;
    }
    
    public void setNie(String nie) throws NieException{
        this.nie = new Nie(nie);
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
    
    public boolean isDespedido(){
        return this.despedido = true;
    }
    
    public void setDespedido(){
        this.despedido = true;
    }
    
    public void setNivelDiscapacidad(int NivelDiscapacidad){
        this.nivelDiscapacidad = NivelDiscapacidad;
    }
    
    public int getNivelDiscapacidad(){
        return this.nivelDiscapacidad;
    }
    
    public void setEDAD_JUBILACION(int EDAD_JUBILACION){
        Empleado.EDAD_JUBILACION = EDAD_JUBILACION;
    }
        
    public int getEDAD_JUBILACION(){
        return Empleado.EDAD_JUBILACION;
    }
    
    @Override
    public void jubilar(){
        Period periodo = Period.between(fechaNac, LocalDate.now());
        
        int edad = periodo.getYears();
        
        if(edad >= Empleado.EDAD_JUBILACION){
            this.jubilado = true;
        }else if(edad >= 61 && this.nivelDiscapacidad >= 65){
            this.jubilado = true;
        }else if(edad > 56 && this.nivelDiscapacidad == 45){
            this.jubilado = true;
        }else if(jubilado == true){
            premiar();
            System.out.println("DE JUBILACIÓN"+getNombre()+" "+getApellidos());            
        }
    }
    
    @Override
    public void despedir(){
        Period periodo = Period.between(fechaNac, LocalDate.now());
        
        int edad = periodo.getYears();
        
        if(edad >= 65){
            jubilar();
            this.despedido = true;
        }else{
            this.despedido = true;
        }
    }
}