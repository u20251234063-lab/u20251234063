
package herencia;

public class Consultor extends persona {
    String nombreConsultor;
    int numConsultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultor, int numConsultor, int id, String dni, String apellido, String domicilio, String telefono) {
        super(id, dni, apellido, domicilio, telefono);
        this.nombreConsultor = nombreConsultor;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultor() {
        return nombreConsultor;
    }

    public void setNombreConsultor(String nombreConsultor) {
        this.nombreConsultor = nombreConsultor;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
    
    }


