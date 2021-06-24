
/**
 * Write a description of class Vehiculo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehiculo
{
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int pasajeros;
    
    public Vehiculo(String matri, String marc, String mode, int pas){
        matricula = matri;
        marca = marc;
        modelo = mode;
        pasajeros = pas;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getPasajeros(){
        return pasajeros;
    }
}
