
package paqueteFraccion;

public class Fraccion {
    
    // Atributos
    private int num;
    private int den;

    // Constructor PATRON
    // Con este constructor inicializa la fracción con 2 valores de tipo entero, y después se reduce llamando al método reducir
    public Fraccion(int num, int den) { 
        this.num = num;
        this.den = den;
        reducir();
    }
        
    // Constructor por defecto
    // Con este constructor los valores de la fracción si inicializan a 1 por defecto
    public Fraccion(){
        this(1,1);
    }
    
    // Constructor de copia
    // Con este constructor se inicializa la fracción a los valores de otra fracción considerada como dato de entrada
    public Fraccion(Fraccion other){
        this(other.num, other.den);
    }
        
    // mcd metodo patron (Calcula el maximo comun divisor)
    private static int mcd(int x, int y){
        while(y != 0){
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
    
    private static int mcd(Fraccion other){
        return Fraccion.mcd(other.num,other.den);
    }
    
    // Reduce la fracción actual hasta hacerla irreducible
    private void reducir(){
        int mcd = Fraccion.mcd(this);
        
        this.num /= mcd;
        this.den /= mcd;
    }
    
    // Getters y Setters
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public int getDen(){
        return den;
    }
    
    public void setDen(int den){
        this.den = den;
    }
    
    // toString
    @Override
    public String toString(){
        return "Num: " + num + "\nDen: " + den;
    }
    
    public boolean equals(Fraccion other){
        return this.num == other.num && this.den == den;
    }
    
    public boolean equals(int num, int den){
        return this.num == num && this.den == den;
    }
    
    // FraccionSuma PATRON
    public Fraccion suma(Fraccion other) {
        
        int numerador = this.num * other.den + other.num * this.den;
        int denominador = this.den * other.den;
        
        return new Fraccion(numerador, denominador);
    }
    
    // Este método llama al método suma patrón, ya que el otro utiliza una fracción como parámetro de entrada se debe introducir una new Fraccion al llamarlo.
    public Fraccion suma(int num, int den){
            
        return this.suma(new Fraccion(num,den));
    }
    
    // Resta Patron (se llama con this)
    public Fraccion resta(Fraccion other){
        
        int numerador = (this.num * other.den) - (this.den * other.num);
        int denominador = this.den * other.den;

        return new Fraccion(numerador,denominador);
    }
    
    public Fraccion resta(int num, int den){
        
        return this.resta(new Fraccion(num,den));
    }
    
    public Fraccion producto(int num, int den){
        
        return new Fraccion(this.num * num, this.den * den);
    }
    
    public Fraccion producto(Fraccion other){
        
        return this.producto(other.num, other.den);
    }
    
    public Fraccion cociente(int num, int den){
        
        return new Fraccion(this.num * den, this.den * num);
    }
    
    public Fraccion cociente(Fraccion other){
        
        return this.cociente(other.num, other.den);
    }
}