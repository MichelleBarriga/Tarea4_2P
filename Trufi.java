
/**
 * Write a description of class Trufi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trufi extends Vehiculo
{
    private String ruta;
    private int peaje;
    public Trufi(String matricula, String marca,String modelo, int pas,
                 String rut, int peaj){
        super(matricula, marca, modelo, pas);
        ruta = rut;
        peaje = peaj;
    }
    
    public int ganancia(){
        return (super.pasajeros - 1) * peaje;
    }
}
