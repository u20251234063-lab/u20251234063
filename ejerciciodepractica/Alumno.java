package ejerciciodepractica;

public class Alumno {

    int id;
    String nombre;
    String apellido;
    // se creab acciones llamados METODOS
    // metodo donde el alumno pueda decir su nombre completo

    public void mostrarNombre() {

        System.out.println("hola soy un alumno y se decir mi nombre");

    }
    // constructor vacio 
// si implementa para usarse mas adelante

    public Alumno() {
    }
    // contructor con parametros

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // decir si esta aprobado o no
    public void saberAprobado(double calificacion) {
        if (calificacion >= 3) {
            System.out.println("aprobe la materia");
        } else {
            System.out.println("uuuy no aprobo...");
        }
    }
}
