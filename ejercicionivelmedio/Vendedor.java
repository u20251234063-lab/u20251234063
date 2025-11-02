
package ejercicionivelmedio;

public class Vendedor {

    private String nombre;
    private double sueldo;

    public Vendedor(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Sueldo: " + sueldo;
    }
}
