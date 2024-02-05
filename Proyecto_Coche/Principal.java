
package paqueteCoche;

public class Principal {

    public static void main(String[] args) {
        
        // Constructor patrón
        try{
            Coche coche1 = new Coche(Marcas.SEAT,Colores.AZUL,Combustible.GASOIL,"MANUAL",5,0);
            System.out.println("Coche1: "+coche1);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        } 
        
        // Constructor cadena
        try{
            Coche coche2 = new Coche("SEAT","AZUL","GASOIL","MANUAL",5,0);
            System.out.println("Coche2: "+coche2);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // Constructor por defecto
        try{
            Coche coche3 = new Coche();
            System.out.println("Coche3: "+coche3);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // Constructor copia
        Coche coche = new Coche();
        try{
            Coche coche4 = new Coche(coche);
            System.out.println("Coche4: "+coche4);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setMarca por enum
        try{
            coche.setMarca(Marcas.TOYOTA);
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
       
        // setMarca por String
        try{
            coche.setMarca("SEAT");
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setColor por enum
        try{
            coche.setColor(Colores.PLATEADO);
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setColor por String
        try{
            coche.setColor("ROJO");
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setCombustible por enum
        try{
            coche.setCombustible(Combustible.ELECTRICO);
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setCombustible por String
        try{
            coche.setCombustible("HIBRIDO");
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setCambio        
        try{
            coche.setCambio("AUTOMATICO");
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        // setPrecio
        try{
            coche.setPrecio(50);
            System.out.println("coche: "+coche);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}