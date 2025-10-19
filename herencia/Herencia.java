/* crea una clase madre que sea tipo perosna con apellido, id, telefono etc.
de la misma deriva dos subclases Empleado (sus atributos seran numero de legajo, cargo y sueldo)   
y consultor (nombre del consultor y numero)
*/
package herencia;
public class Herencia {
    public static void main(String[] args) {
        Empleado emple = new Empleado();
        emple.setCargo("Ingeniera");
        System.out.println("el cargo del empleado es: "+emple.getCargo());
        emple.setSueldo(25000);
        System.out.println("sueldo del empleado "+emple.getSueldo());
        emple.setApellido("QUIMBAYA");
        System.out.println("el apellido del empleado es: "+emple.getApellido());
        System.out.println("-----------------");
        Consultor consul= new Consultor();
        consul.setNombreConsultor("consultor");
        System.out.println("nombre del consultor es: "+consul.getNombreConsultor());
        consul.setNumConsultor(34757575);
        System.out.println("numero del consultor "+consul.getNumConsultor());
     
      } 
    }

