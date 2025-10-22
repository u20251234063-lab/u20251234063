
package recetasfast;

import java.util.ArrayList;

public class Sandwich extends Receta {
   

    public Sandwich(String plancha, String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }
    
    @Override
      public boolean isVegetariano(){
        return true;
    }
            
    @Override
    public String tipoPreparacion(String plancha) {
     return plancha;
    }
}
