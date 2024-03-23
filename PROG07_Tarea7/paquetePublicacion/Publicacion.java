
package paquetePublicacion;

/**
 *
 * @author Lun
 */
public abstract class Publicacion {
    
    // Atributos
    protected static int CONTEO_ID = 0;
    
    protected int id;
    protected String titulo;
    protected int añoPubli;
    
    // Constructor
    public Publicacion(String titulo, int añoPubli) throws IllegalArgumentException{
        if(añoPubli <= 0){
            throw new IllegalArgumentException("Error, el año debe ser positivo");
        }
        this.id = CONTEO_ID++;
        this.titulo = titulo;
        this.añoPubli = añoPubli;   
    }
    
    // Métodos
    public int getCONTEO_ID(){
        return Publicacion.CONTEO_ID;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAñoPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id=" + id + ", titulo=" + titulo + ", a\u00f1oPubli=" + añoPubli + '}';
    }
    
}