
/**
 * Write a description of class Privado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Privado extends Vehiculo
{
    private boolean permiso;
    public Privado(String matricula, String marca,String modelo, int pas, boolean per){
        super(matricula, marca, modelo, pas);
        permiso = per;
    }
    
    public String dejarPasar(){
        String reporte;
        if(permiso){
            reporte = "Puede pasar";
        }else{
            reporte = "No puede pasar";
        }
        return reporte;
    }
}
