
package recetasfast;

import java.util.ArrayList;

public class Receta {
    
    private String nombre;
    private ArrayList<String> ingredientes;
    private ArrayList<String> pasosPreparacion;
   
    
    public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasosPreparacion() {
        return pasosPreparacion;
    }

    public void setPasosPreparacion(ArrayList<String> pasosPreparacion) {
        this.pasosPreparacion = pasosPreparacion;
    }
    
    
    public boolean isVegetariano(){
        return true;
    }
    
    public String tipoPreparacion(String preparacion){
        return preparacion;
    }
    
    public int tiempoDePreparacio(int tiempo){
        return tiempo;
    }
}
