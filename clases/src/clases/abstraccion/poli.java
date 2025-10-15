
package clases.abstraccion;

import clases.*;
import java.util.ArrayList;

public class poli {
    public static void main(String[] args) {
        ArrayList <animal> animales =new ArrayList <>();
        animales.add(new animal());
        animales.add(new aves());
        animales.add(new caninos());
        animales.add(new felinos());
        animales.add(new lobo());
        animales.add(new gallo());
        animales.add(new perro());
        animales.add(new pollo());
        for (animal a: animales){
         a.makeSound();
        }
    }
}
