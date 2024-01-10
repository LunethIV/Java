
package paqueteTriangulo;

public class Triangulo {
    
    // Atributos
    private int altura;
    private int base;
    
    // Constructor
    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    // Métodos
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + ", base=" + base + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangulo other = (Triangulo) obj;
        if (this.altura != other.altura) {
            return false;
        }
        return this.base == other.base;
    }
    
    public int area(){
        int area = (this.base*this.altura) / 2;
        
        return area;
    }
    
    public double perimetro(){
        return this.base + this.altura + this.hipotenusa();
    }
    
    private double hipotenusa(){
        return Math.hypot(this.altura, this.base);
    }
    
    public double getHipotenusa(){
        return this.hipotenusa();
    }
    
    public void duplicaTamaño(){
        this.altura *= 2;
        this.base *= 2;
    }
    
    public void ampliaTamaño(int tamaño){
        this.altura += tamaño;
        this.base += tamaño;
    }
}
