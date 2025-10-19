
package herencia;
public class Empleado extends persona{
  int numLegajo;
  String cargo;
double sueldo;

    public Empleado() {
    }

    public Empleado(int numLegajo, String cargo, double sueldo, int id, String dni, String apellido, String domicilio, String telefono) {
        super(id, dni, apellido, domicilio, telefono);
        this.numLegajo = 433546;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
   
}
