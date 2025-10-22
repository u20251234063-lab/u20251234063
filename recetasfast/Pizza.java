
package recetasfast;

import java.util.ArrayList;

public class Pizza extends Receta{
    
    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
        super.nombre=nombre;
    }
    
    @Override
     public boolean isVegetariano(){
         for(String ingredientes:super.getIngredientes()){
            if(ingredientes.contains("carne")){
            return false;    
            } 
         }
        return true;
    }
     
     public String tipoDePreparacion(String horno){
         return horno;
     }
     
    public int tiempoDePreparacio(){
      int tiempo=2;
      for(int i=0; i<name.lenght;i++){
          
      }
        return tiempo;
    }
}
