
package paqueteOtros;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import paqueteExcepciones.NifException;

public class Nif {
    
    // Atributos
    private String nif;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    // Constructores
    public Nif(String nif) throws NifException {
        // Eliminar espacios en blanco y convertir a mayúsculas
        String nifSinEspacios = nif.replace(" ","").toUpperCase();
        
        // Patrón de expresión regular para NIF
        String patronNif = "^[0-9]{8}[A-Z]$";
        Pattern pattern = Pattern.compile(patronNif);
        Matcher matcher = pattern.matcher(nifSinEspacios);
        
        // Validar formato NIF
        if(!matcher.matches()){
            throw new NifException("Error, los datos introducidos no cumplen 8dígitos-máximoLETRA");
        }
        
        // Extraer letra y calcular resto de la división por 23
        String cadena = nifSinEspacios.substring(8);
        int resto = Integer.parseInt(nifSinEspacios.substring(0,8)) % 23;
        
        
        // Validar coincidencia letra y resto
        if(cadena.charAt(0) != LETRAS.charAt(resto)){           
            throw new NifException("Error, las letras no coinciden");         
        }
        
        // Asignar valores a los atributos
        this.nif = nifSinEspacios;
    }
    
    // Constructor que recibe un valor entero en lugar de una cadena
    public Nif(int dni){
        // Obtener el resto de la división por 23
        int resto = dni % 23;
        
        // Obtener la letra correspondiente al resto
        char letra = LETRAS.charAt(resto);
        
        // Formar DNI completo (con valueOf se convierte un int a String)
        this.nif = String.valueOf(dni)+letra;
    }
    
    // Constructor que recibe otro nif como entrada
    public Nif(Nif other){   
        this.nif = other.nif;
    }
    
    // Getters y setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) throws NifException{
        // Quitar espacios
        String sinEspacios = nif.replace(" ", "");
        
        // Patrón de expresión regular para NIF
        String patronNif = "^[0-9]{8}[A-Z]$";
        Pattern pattern = Pattern.compile(patronNif);
        Matcher matcher = pattern.matcher(sinEspacios);
        
        // Validar formato NIF
        if(!matcher.matches()){
            throw new NifException("Error, los datos introducidos no cumplen 8dígitos-máximoLETRA");
        }
        
        // Extraer letra y calcular resto de la división por 23
        String cadena = sinEspacios.substring(8);
        int resto = Integer.parseInt(sinEspacios.substring(0,8)) % 23;
               
        // Validar coincidencia letra y resto
        if(cadena.charAt(0) != LETRAS.charAt(resto)){           
            throw new NifException("Error, las letras no coinciden");         
        }
        
        this.nif = nif;
    }

    public void setNif(int dni){
        String dniCadena = String.valueOf(dni);
        
        String letra = calcularLetra(dni);
        
        this.nif = dniCadena + letra;
    }
    
    public void setNif(Nif other){
        this.nif = other.nif;
    }
    
    @Override
    public String toString() {
        return "Nif{" + "nif=" + nif + '}';
    }
    
    public boolean equals(Nif other) {
        return this.nif.equals(other.nif);
    }
   
    public String calcularLetra(int dni){
        // Obtener el resto de la división por 23
        int resto = dni % 23;
        
        // Obtener la letra correspondiente al resto
        char letra = LETRAS.charAt(resto);
        
        // Formar DNI completo (con valueOf se convierte un int a String)
        String nif = String.valueOf(dni)+letra;
        
        return nif;
    }
}