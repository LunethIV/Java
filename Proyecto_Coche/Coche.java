
package paqueteCoche;

public class Coche {
    
    // Atributos
    private Marcas marca;
    private Colores color;
    private Combustible combustible;
    private String cambio;
    private int numPuertas;
    private int precio;
    private final static String CAMBIOS[]={"MANUAL","AUTOMATICO"};
    
    // Constructores
    // Constructor patrón
    public Coche(Marcas marca, Colores color, Combustible combustible, String cambio, int numPuertas, int precio)throws IllegalArgumentException{
        
        // Tratamiento de excepciones
        if(numPuertas < 3 || numPuertas > 5){
            throw new IllegalArgumentException("Error, la cantidad de puertas no puede ser menor a 3 o mayor a 5");
        }else if(precio < 0){
            throw new IllegalArgumentException("Error, el precio del coche no puede ser menor a 0");
        }else if(!cambio.equals(CAMBIOS[0]) && !cambio.equals(CAMBIOS[1])){
            throw new IllegalArgumentException("Error, el cambio debe ser MANUAL o AUTOMATICO");
        }
        
        this.marca = marca;
        this.color = color;
        this.combustible = combustible;
        this.cambio = cambio;
        this.numPuertas = numPuertas;
        this.precio = precio;
    }
    // Contructor por Strings
    public Coche(String marca, String color,String combustible, String cambio, int numPuertas, int precio)throws IllegalArgumentException{
        
        // Tratamiento de excepciones
        if(numPuertas < 3 || numPuertas > 5){
            throw new IllegalArgumentException("Error, la cantidad de puertas no puede ser menor a 3 o mayor a 5");
        }else if(precio < 0){
            throw new IllegalArgumentException("Error, el precio del coche no puede ser menor a 0");
        }else if(!cambio.equals(CAMBIOS[0]) && !cambio.equals(CAMBIOS[1])){
            throw new IllegalArgumentException("Error, el cambio debe ser MANUAL o AUTOMATICO");
        }
        
        try{
            this.marca = Marcas.valueOf(marca);
            this.color = Colores.valueOf(color);
            this.combustible = Combustible.valueOf(combustible);
            this.cambio = cambio;
            this.numPuertas = numPuertas;
            this.precio = precio;
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("Error, alguno de los datos introducidos no es correcto");
        }
    }
    
    // Constructor por defecto
    public Coche(){
        this.marca = Marcas.SEAT;
        this.color = Colores.ROJO;
        this.combustible = Combustible.GASOIL;
        this.cambio = CAMBIOS[0];
        this.numPuertas = 3;
        this.precio = 0;
    }
    
    // Contructor copia
    public Coche(Coche other){
        this.marca = other.marca;
        this.color = other.color;
        this.combustible = other.combustible;
        this.cambio = other.cambio;
        this.numPuertas = other.numPuertas;
        this.precio = other.precio;
    }
    
    // Métodos de acceso a las propiedades
    public void setMarca(Marcas marca){
        this.marca = marca; 
    }
    
    public void setMarca(String marca){
        
        try{
            this.marca = Marcas.valueOf(marca);
        }catch(IllegalArgumentException ex){
            System.out.println("Error, esa marca no existe");
        }
    }
    
    public void setColor(Colores color){
        this.color = color;
    }
    
    public void setColor(String color){
        
        try{
            this.color = Colores.valueOf(color);
        }catch(IllegalArgumentException ex){
            System.out.println("Error, el color introducido no existe");
        }
    }
    
    public void setCombustible(Combustible combustible){
        this.combustible = combustible;
    }
    
    public void setCombustible(String combustible)throws IllegalArgumentException{
        
        try{
            this.combustible = Combustible.valueOf(combustible);
        }catch(IllegalArgumentException ex){
            System.out.println("Error, el combustible introducido no existe");
        }
    }
    
    public void setCambio(String cambio){    
            this.cambio = cambio;       
    }
    
    public void setNumPuertas(int numPuertas)throws IllegalArgumentException{
        
        if(numPuertas < 3 || numPuertas > 5){
            throw new IllegalArgumentException("Error, introduce una cantidad de 3 a 5");
        }
        
        this.numPuertas = numPuertas;     
    }

    public void setPrecio(int precio)throws IllegalArgumentException{
        if(precio < 0){
            throw new IllegalArgumentException("Error, el precio no puede ser menor a 0");
        }
        this.precio = precio;
    }
    
    // Métodos propios
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", combustible=" + combustible + ", cambio=" + cambio + ", numPuertas=" + numPuertas + ", precio=" + precio + '}';
    }   
}