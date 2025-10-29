
package animalife;
import java.util.ArrayList;
public class Mascota {
    private String nombre,especie,propietario;
    private int edad;
    private ArrayList<String> historialMedico;

    public Mascota(String nombre, String especie, String propietario, int edad, ArrayList<String> historialMedico) {
        this.nombre = nombre;
        this.especie = especie;
        this.propietario = propietario;
        this.edad = edad;
        this.historialMedico = historialMedico;
    }
   
}
