
package ejercicio1;
public class Persona {
     private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
    public int tiempoJubilacion  (int edad)throws EsMenorDeEdadException{
        if (edad<18){
            //return -1;
            EsMenorDeEdadException e1= new EsMenorDeEdadException();
            throw e1;
        }else if (edad>65) {
            YaEstaJubilado e2= new YaEstaJubilado();
            throw e2;
        } else{
            return -1;
        }
    }
}
