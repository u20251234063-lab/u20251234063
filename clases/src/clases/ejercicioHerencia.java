
package clases;
public class ejercicioHerencia {
    private String nombre;
    private String nif;

    public ejercicioHerencia(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "ejercicioHerencia{" + "nombre=" + nombre + ", nif=" + nif + '}';
    }

    
}
