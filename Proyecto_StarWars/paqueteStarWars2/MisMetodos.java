
package paqueteStarWars2;

public class MisMetodos {
    
    public static int generaNumAleatorio(int mayor, int menor){
        
        int aleatorio = (int) (Math.random() * (mayor - menor + 1)+ menor);
        
        return aleatorio;
    }
}