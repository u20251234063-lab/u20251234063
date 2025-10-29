
package animalife;

import java.time.LocalDate;

public class Cirugia extends ServicioVeterinario {
   int duracionCirugia;
   int nivelComplejidad;
   double PrecioHoraCirugia=75.000;

    public Cirugia(int duracionCirugia, int nivelComplejidad, LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        super(fecha, mascota, veterinario);
        this.duracionCirugia = duracionCirugia;
        this.nivelComplejidad = nivelComplejidad;
        this.PrecioHoraCirugia=75.000;
    }
   
}
