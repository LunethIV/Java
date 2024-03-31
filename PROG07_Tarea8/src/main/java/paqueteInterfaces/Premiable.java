
package paqueteInterfaces;

/**
 *
 * @author Lun
 */

public interface Premiable {
    
    public default void premiar(){
        System.out.println("---GRAN PREMIO---");
    }
}