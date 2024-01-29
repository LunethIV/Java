
package paquetePunto1;

public class Punto {
    
    // Atributos
    private int x;
    private int y;
    
    // Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Métodos
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }   

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // equals
    public boolean equals(Punto other) {
        return this.x == other.x && this.y == other.y;
    }    
    
    //punto clone
    @Override
    public Punto clone(){
        return new Punto(this.x, this.y);
    }
    
    public double distancia(Punto other){
        double dist = Math.hypot(this.x - other.x, this.y - other.y);
        
        return dist;
    }
    
    public double distancia(int x, int y){
        double dist = Math.hypot(this.x - x, this.y - y);
        
        return dist;
    }
    
    public Punto puntoIntermedio(Punto other){
        Punto aux = new Punto((this.x + other.x) / 2, (this.y + other.y) / 2);
        
        return aux;
    }
    
    public Punto puntoIntermedio(int x, int y){
        Punto aux = new Punto((this.x + x) / 2, (this.y + y) / 2);
        
        return aux;
    }
    
    public Punto puntoSuma(int x, int y){
        return new Punto(this.x + x, this.y + y);
    }
    
    public Punto puntoSuma(Punto other){
        // return new Punto(this.x + other.x, this.y + other.y);
        return this.puntoSuma(other.x, other.y);
    }
    
    public Punto ptoOpuesto(){
        return new Punto(-this.x, this.y);
    }
}