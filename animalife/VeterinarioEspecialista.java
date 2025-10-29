
package animalife;

public class VeterinarioEspecialista extends PersonalVeterinario {

    public VeterinarioEspecialista(String nombre, String Id, String especialidad) {
        super(nombre, Id, especialidad);
        super.especialidad = "cardiologia";
        super.especialidad = "Dermatologia";
    }

    @Override
    public void atenderMascota(Mascota m) {
    }

    @Override
    public void registrarObservaciones(String obs) {
    }

}
