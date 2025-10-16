package ejerciciodepractica;

public class EjercicioDePractica {

    public static void main(String[] args) {
        //* para constructor vacio  
        Alumno a1 = new Alumno();
        // para constructor con parametros
        Alumno a2 = new Alumno(345, "camila", "Quimbaya");
        System.out.println("la id del alumno 2 es: " + a2.getId());
        String nombre = a2.getNombre();
        System.out.println("el nombre del alumno es: " + nombre);
        System.out.println("el apellido del alumno es: " + a2.getApellido());
        System.out.println("cambio de dato (id)");
        a2.setId(346);
        System.out.println("cambio de id: " + a2.id);

        System.out.println("para cconsttructor vacio");
        a1.setId(4567); // se les asigna
        a1.setNombre("camila");
        a1.setApellido("Quimbaya");
        System.out.println("el apellido del alumno es: " + a1.getApellido());
        System.out.println("la id del alumno 2 es: " + a1.getId());
    }
}
