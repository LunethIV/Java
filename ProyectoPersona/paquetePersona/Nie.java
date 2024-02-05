
package paquetePersona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nie {
    
    // Atributos
    private String nie;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    // Constructores
    // Constructor el cual recibe un NIE como String
    public Nie(String nie) throws IllegalArgumentException{
        // Quitar los espacios
        String nieSinEspacios = nie.replace(" ","").toUpperCase();
        
        // Patrón de expresión regular de NIE
        String nieRegex = "^[XYZ][0-9]{7}[A-Z]$";
        Pattern pattern = Pattern.compile(nieRegex);
        Matcher matcher = pattern.matcher(nieSinEspacios);
        
        if(!matcher.matches()){
            throw new IllegalArgumentException("Error, los datos introducidos no cumplen LETRA7dígitosLETR");
        }
        
        // Extraer la última letra y comprobar si coincide
        String letra = nieSinEspacios.substring(8);
        int resto = Integer.parseInt(nieSinEspacios.substring(0,8)) % 23;
        
        if(letra.charAt(0) != LETRAS.charAt(resto)){
            throw new IllegalArgumentException("Error, las letras no coinciden");
        }
        
        this.nie = nie;
    }
    
    // Constructor el cual recibe otro objeto NIE como entrada
    public Nie(Nie other){
        this.nie = other.nie;
    }
    
    // Métodos públicos de acceso a propiedades
    public String getNie(){
        return this.nie;
    }
    
    public void setNie(String nie) throws IllegalArgumentException{
        // Quitar espacios
        String sinEspacios = nie.replace(" ", "").toUpperCase();
        
        // Patrón regex
        String nieRegex = "[XYZ][0-9]{7}[A-Z]";
        Pattern pattern = Pattern.compile(nieRegex);
        Matcher matcher = pattern.matcher(sinEspacios);
        
        
        if(!matcher.matches()){
            throw new IllegalArgumentException("Error, los datos introducidos no cumplen LETRA7dígitosLETR");
        }
        
        // Extraer y calcular
        String letra = sinEspacios.substring(8);
        int resto = Integer.parseInt(sinEspacios.substring(0,8)) % 23;
        
        if(letra.charAt(0) != LETRAS.charAt(resto)){
            throw new IllegalArgumentException("Error, las letras no coinciden");
        }                
        
        this.nie = sinEspacios;
    }
    
    public void setNie(Nie other){
        this.nie = other.nie;
    }
    
    // Métodos propios públicos
    
    @Override
    public String toString(){
        return "NIE: "+this.nie;
    }
    
    public boolean equals(Nie other){
        return this.nie.equals(other.nie);
    }
}
