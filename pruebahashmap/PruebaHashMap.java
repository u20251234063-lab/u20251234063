package pruebahashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PruebaHashMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ingresa = in.nextLine();
        HashMap<Integer, String> datos = new HashMap<>();
        datos.put(12345, "camila");
        datos.put(678910, "karla");
        datos.put(101112, "aleja");
        datos.containsValue("karla");
        datos.containsValue("molina");
        // si lo queremos booleano para usar condicionales
        if (datos.containsValue(ingresa)) {
            System.out.println("si esta bebesota");
        } else {
            System.out.println("sorry honey");
        }
        int ingresar=in.nextInt();
        if (datos.containsKey(ingresar)) {
            System.out.println("si esta bebesota");
        } else {
            System.out.println("sorry honey");
        }
        // imprimir en conjunto los values y keys
        System.out.println(datos.values());
        System.out.println(datos.keySet());
        // como saber si un value esta con un key o visecersa?
        String nombre = datos.get(12345);
        System.out.println("el name de la persona es: "+nombre);
       
    }

}
