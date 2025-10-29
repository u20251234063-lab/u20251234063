
package animalife;
public abstract class PersonalVeterinario implements Atendible {
  protected String nombre,Id,especialidad;

    public PersonalVeterinario(String nombre, String Id, String especialidad) {
        this.nombre = nombre;
        this.Id = Id;
        this.especialidad = especialidad;
    } 
}
