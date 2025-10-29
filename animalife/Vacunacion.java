
package animalife;

import java.time.LocalDate;

public class Vacunacion extends ServicioVeterinario {
    String TipoVacuna;
    double CostoFijo=50.000;

    public Vacunacion(String TipoVacuna, LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        super(fecha, mascota, veterinario);
        this.TipoVacuna = TipoVacuna;
    }
    
    @Override
    public double calcularCosto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String generarlInforme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
