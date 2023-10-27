


// @author Lun

package paquete7;
public class Calculo {
    
    public static byte imc (double peso, short altura){       
    
        double imc = peso / (altura/100.0 * altura/100.0);
        
        // Convertir imc a byte
        byte clasificacion = 0;
        if (imc < 18.5)
            clasificacion = 1;
        else if (imc >= 18.5 && imc <= 24.9)
            clasificacion = 2;
        else if (imc >= 25.0 && imc <= 29.9)
            clasificacion = 3;
        else if (imc > 29.9)
            clasificacion = 4;
        
        return clasificacion;
    }
}