
package paqueteSub;

import paqueteSuper.Animal;
import java.time.LocalDate;

public class Vertebrado extends Animal {
    
    // Atributos
    protected int numVertebras;
    
    // Constructores
    // Constructor patron
    public Vertebrado(int vertebras, double peso, LocalDate fechaNac){
        super(peso, fechaNac);
        this.numVertebras = vertebras;
    }
    
    public Vertebrado(int vertebras, double peso){
        super(peso);
        super.fechaNac = LocalDate.now();
        this.numVertebras = vertebras;       
    }
    
    public Vertebrado(Animal other, int vertebras){
        super(other);
        this.numVertebras = vertebras;        
    }
    
    public Vertebrado(Vertebrado other){
        super(other.peso, other.fechaNac);
        this.numVertebras = other.numVertebras;
    }
    
    public int getVertebras(){
        return this.numVertebras;
    }
    
    public void setNumVertebras(int numVertebras)throws IllegalArgumentException{
        if(numVertebras < 200 || numVertebras > 1000){
            throw new IllegalArgumentException("Error, las vertebras deben ser mayor que 200 o menor que 1000");
        }
        this.numVertebras = numVertebras;
    }
    
    @Override
    public String toString(){
        return "Vertebras: "+this.numVertebras+ "Peso: "+super.peso+ "FechaNac: "+super.fechaNac;
    }
}