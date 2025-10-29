
package animalife;
public class VeterinarioGeneral extends PersonalVeterinario {

    public VeterinarioGeneral(String nombre, String Id, String especialidad) {
        super(nombre, Id, especialidad);
        super.especialidad="General";
    }
    
    @Override
    public void atenderMascota(Mascota m) {
    
    }

    @Override
    public void registrarObservaciones(String obs) {
    }
    
}
