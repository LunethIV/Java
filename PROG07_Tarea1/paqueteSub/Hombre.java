
package paqueteSub;

import paqueteSuper.Hijo;
import paqueteSuper.Animal;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Hombre extends Vertebrado{
    
    // Atributos
    protected String nombre;
    protected boolean vivo;
    protected int numHijos = 0;
    protected ArrayList<Hijo> datosHijos;
    
    // Contructores
    public Hombre(String nombre, boolean vivo, ArrayList<Hijo> datosHijos, int numVertebras, double peso, LocalDate fechaNac){
        super(numVertebras, peso, fechaNac);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = datosHijos;
        numHijos = datosHijos.size();
    }

    public Hombre(String nombre, boolean vivo, int numVertebras, double peso, LocalDate fechaNac){
        super(numVertebras,peso,fechaNac);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = new ArrayList();
    }
    
    public Hombre(String nombre, boolean vivo, int numVertebras, double peso){
        super(numVertebras,peso);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = new ArrayList();
    }
    
    public Hombre(String nombre, boolean vivo, int numVertebras, Animal animal){
        super(numVertebras,animal.getPeso(), animal.getFecha());
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = new ArrayList();
    }
    
    public Hombre(String nombre, boolean vivo, ArrayList<Hijo> hijos, Vertebrado vertebrado){
        super(vertebrado);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = hijos;
        numHijos = hijos.size();
    }
    
    public Hombre(String nombre, boolean vivo, Vertebrado vertebrado){
        super(vertebrado);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = new ArrayList();
    }
    
    public Hombre(Hombre other){
        super(other.numVertebras,other.peso,other.fechaNac);
        this.nombre = other.nombre;
        this.vivo = other.vivo;
        this.datosHijos = other.datosHijos;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public boolean isVivo(){
        return this.vivo;
    }
    
    public ArrayList getDatosHijos(){
        return this.datosHijos;
    }
    
    public int getNumHijos(){
        return this.numHijos;
    }

    @Override
    public String toString() {
        return "Hombre{" + "nombre=" + nombre + ", vivo=" + vivo + ", numHijos=" + numHijos + ", datosHijos=" + datosHijos + '}';
    }
    
    public void morir()throws IllegalArgumentException{
        if(vivo == true){
            vivo = false;
        }else{
            throw new IllegalArgumentException("Error, solo se muere una vez");
        }
    }     
    
    public void tenerHijo(Hijo hijo){
        if(!datosHijos.contains(hijo)){
            datosHijos.add(hijo);
            numHijos++;
        }
    }
    
    public int edadHijoMenor(){
        int edadMenor = -1;
        LocalDate tiempoActual = LocalDate.now();
        
        if(!datosHijos.isEmpty()){
            for(Hijo hijo: datosHijos){
                LocalDate añoNacimiento = hijo.getFechaNac();
                Period diferencia = Period.between(añoNacimiento, tiempoActual); // No da la diferencia en años
                int diffEnAños = diferencia.getYears(); // Transforma la diferencia en años
                if(edadMenor == -1 || diffEnAños < edadMenor){
                    edadMenor = diffEnAños;
                }
            } 
        }
        return edadMenor;
    }
    
    public Hijo hijoMenor(){
        Hijo hijo1 = null;
        if(datosHijos.size() <= 0){
            return hijo1;
        }else{    
            int edadMenor = edadHijoMenor();
            for(Hijo hijo: datosHijos){
                if(Period.between(hijo.getFechaNac(),LocalDate.now()).getYears() == edadMenor){
                    hijo1 = hijo;
                }
            }
        }
        return hijo1;
    }
    
    public Hijo darHijo(int posicion){        
        if(posicion < 1 || posicion > numHijos){
            throw new IllegalArgumentException("Error, la posición no puede ser menor a 1 o mayor que el num de hijos");
        }
        if(datosHijos.size() <= 0){
            return null;
        }
        Hijo hijo = null;
        for(int i = 0; i < datosHijos.size(); i++){
            if(i + 1 == posicion){
                hijo = datosHijos.get(i);
            }
        }
        return hijo;
    }
}