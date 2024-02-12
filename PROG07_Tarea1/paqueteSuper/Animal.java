package paqueteSuper;

import java.time.LocalDate;

public class Animal {
    
    // Atributos
    protected double peso;
    protected LocalDate fechaNac;
    
    // Constructores
    
    public Animal(double peso, LocalDate fecha){
        this.peso = peso;
        this.fechaNac = fecha;
    }
    
    public Animal(double peso){
        this.peso = peso;
        this.fechaNac = LocalDate.now();
    }
    
    public Animal(Animal other){
        this.peso = other.peso;
        this.fechaNac = other.fechaNac;
    }
    
    // Métodos públicos
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso)throws IllegalArgumentException{
        if(peso < 0 || peso > 5000){
            throw new IllegalArgumentException("Error, el peso no puede ser inferior a 0 o mayor a 5000");
        }
        this.peso = peso;
    }
    
    public LocalDate getFecha(){
        return this.fechaNac;
    }
    
    public void setFecha(LocalDate fecha){
        this.fechaNac = fecha;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", fechaNac=" + fechaNac + '}';
    }
}