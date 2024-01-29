package paqueteStarWars1;

import paqueteStarWars2.MisMetodos;

public class Personaje {
   
   // Definición de miembros de la clase Personaje
   // Propiedades, atributos o variables
   
   private String nombre;
   private int salud;
   private int fisico;
   private int fuerza;
   private int nivel;
   private int ph;
   private final int id;
   private static int ContPersonajes = 0;
   
    //Constructor
    public Personaje(String nombre, int salud, int fisico, int fuerza, int nivel, int ph){
        this.nombre=nombre;
        this.salud=salud;
        this.fisico=fisico;
        this.fuerza=fuerza;
        this.nivel=nivel;
        this.ph=ph;
        ContPersonajes++;
        this.id = ContPersonajes;       
    }
   
    // Métodos
    public String getNombre(){ // Devuelve el nombre del personaje actual 
       return nombre;
    }
  
    public void setNombre(String nick){ // Cambia el nombre del personaje actual por otro considerado como dato de entrada
        nombre = nick;
    }
    
    public int getSalud(){ // Devuelve la salud del personaje actual
        return salud;
    }
    
    public void setSalud(int hp){ // Cambia la salud del personaje actual por otra considerado como dato de entrada
        salud = hp;
    }
    
    public int getFisico(){ // Devuelve el fisico del personaje actual
        return fisico;
    }
    
    public void setFisico(int cons){ // Cambia el fisico del personaje actual por otro considerado como dato de entrada
        fisico = cons;
    }
    
    public int getFuerza(){ // Devuelve la fuerza del personaje actual
        return fuerza;
    }
    
    public void setFuerza(int str){ // Cambia la fuerza del personaje actual por otra considerado como dato de entrada
        fuerza = str;
    }
    
    public int getNivel(){ // Devuelve el nivel del personaje actual
        return nivel;
    }
    
    public void setNivel(int lvl){ // Cambia el nivel del personaje actual por otro considerado como dato de entrada
        nivel = lvl;
    }
    
    public int getPh(){ // Devuelve el ph del personaje actual
        return ph;
    }
    
    public void setPh(int ph){ // Cambia el ph del personaje actual por otro considerado como dato de entrada
        this.ph = ph;
    }

    public int getId(){
        return id;
    }
    
    public static int getContPersonajes(){
        return ContPersonajes;
    }
    

    
    @Override
    public String toString(){ // Devuelve una cadena que contiene TODOS los atributos del personaje
        String cadena;
        cadena = "Nombre: "+nombre+"\nSalud: "+salud+"\nFisico: "+fisico+"\nFuerza: "+fuerza+"\nNivel: "+nivel+"\nPh: "+ph+ "\nid: "+id;
        return cadena;
    }
    
    public int ataque_fisico(){ // Devuelve un valor resultante del producto de un número al azar entre 0 y 2 (ambos incluidos) con el nivel del personaje actual
       
       int Aleatorio = MisMetodos.generaNumAleatorio(2, 0);
       
       return Aleatorio * nivel * fisico;
    }
    
    public int ataque_fuerza(){ //Devuelve un valor entero, sería 0 si los ph son 0 o negativo. Si son positivos, sería: Decrementar los puntos de habilidad en 1 y devolver el producto del nivel con la fuerza

        if(ph > 0){
            ph--;
            return nivel * fuerza;
        }
        else{
            return 0;
        }
    }
    
    public void defensa(int daño){ // Se decrementa la salud en función de un número entero positivo considerado como dato de entrada
        this.salud -= daño;
    }
    
    public boolean isVivo(){ // Devuelve true si la salud del personaje es positiva y false si es 0 o negativa
       return salud > 0;
    }
}