
package ejerciciotaller;

import java.util.ArrayList;

public class Urbanizacion {
    private ArrayList<Vivienda> viviendas;

    public Urbanizacion() {
        viviendas = new ArrayList<>();
    }

    public void agregarVivienda(Vivienda v) {
        viviendas.add(v);
    }

    public double calcularPrecioTotalViviendas() {
        double total = 0;
        for (Vivienda v : viviendas) {
            total += v.getPrecio();
        }
        return total;
    }

    public double calcularPrecioTotalChalets() {
        double total = 0;
        for (Vivienda v : viviendas) {
            if (v instanceof Chalet) {
                total += v.getPrecio();
            }
        }
        return total;
    }

      
    }    

