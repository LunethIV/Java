
package paqueteInterfaces;

/**
 *
 * @author Lun
 */
public class Viaje implements Vendible {
    
    // Atributos
    protected String origen;
    protected String destino;
    protected int ndias;
    protected double precio;
    protected static double IVA = 0.2d;
    
    // Constructor
    public Viaje(String origen, String destino, double precio){
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }
    
    // Métodos
    @Override
    public double precioIva(){
        return (this.precio * Viaje.IVA) / 100;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getNdias() {
        return ndias;
    }

    public double getPrecio() {
        return precio;
    }

    public static double getIVA() {
        return IVA;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void setIVA(double IVA) {
        Viaje.IVA = IVA;
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", ndias=" + ndias + ", precio=" + precio + '}';
    }
    
}