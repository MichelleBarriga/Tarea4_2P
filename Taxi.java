
/**
 * Write a description of class Taxi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Taxi extends Vehiculo
{
    private String destino;
    
    public Taxi(String matricula, String marca,String modelo, int pas, String dest){
        super(matricula, marca, modelo, pas);
        destino = dest;
    }
    
    public String getDestino(){
        return destino;
    }
}
