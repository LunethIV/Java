
package paquetePersona;

import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Nif {
    
    // Atributos
    private String nif;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    // Constructores
    public Nif(String nif){
        // Eliminar espacios en blanco y convertir a mayúsculas
        String nifSinEspacios = nif.replace(" ","").toUpperCase();
        
        // Patrón de expresión regular para NIF
        String patronNif = "^[0-9]{8}[A-Z]$";
        Pattern pattern = Pattern.compile(patronNif);
        Matcher matcher = pattern.matcher(nifSinEspacios);
        
        // Validar formato NIF
        if(!matcher.matches()){
            throw new IllegalArgumentException("Error, los datos introducidos no cumplen 8dígitos-máximoLETRA");
        }
        
        // Extraer letra y calcular resto de la división por 23
        String cadena = nifSinEspacios.substring(8);
        int resto = Integer.parseInt(nifSinEspacios.substring(0,8)) % 23;
        
        
        // Validar coincidencia letra y resto
        if(cadena.charAt(0) == LETRAS.charAt(1)){           
            System.out.println("Son iguales ");          
        }else{
            throw new IllegalArgumentException("Error, las letras no coinciden");
        }
        
        // Asignar valores a los atributos
        this.nif = nifSinEspacios;
    }
    
    public Nif(int dni){
        // Obtener el resto de la división por 23
        int resto = dni % 23;
        
        // Obtener la letra correspondiente al resto
        char letra = LETRAS.charAt(resto);
        
        // Formar DNI completo (con valueOf se convierte un int a String)
        String nif = String.valueOf(dni)+letra;
    }
    
    public Nif(Nif other){   
        this.nif = other.nif;
    }
    
    // Getters y setters

    public String getNif() {
        return nif;
    }

    public static String getLETRAS() {
        return LETRAS;
    }

    public void setNif(String nif) throws IllegalArgumentException{
        
        this.nif = nif;
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