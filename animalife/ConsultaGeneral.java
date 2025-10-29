
package animalife;

import java.time.LocalDate;

public class ConsultaGeneral extends ServicioVeterinario {
    protected double CostoFijo=50.000;

    public ConsultaGeneral(LocalDate fecha, Mascota mascota, PersonalVeterinario veterinario) {
        super(fecha, mascota, veterinario);
        this.CostoFijo=50.000;
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
