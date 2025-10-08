package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        int[] vector = generaArrayInt(10, 1, 100);
        mostrarArray(vector);
        System.out.println(" el minimo es: " + minimoArraInt(vector));
        System.out.println(" el maximo es: " + maximoArraInt(vector));
        System.out.println(" la media es: " + mediaArrayInt(vector));
        System.out.println("tu numero esta?:  " + estaEnArrayInt(vector));
        System.out.println("tu numero verificado es: " + posicionEnArray(vector));
        System.out.println("el array invertido es: " + volteaArrayInt(vector));
        System.out.println("Array rotado 3 posiciones a la derecha:");
        rotaDerechaArrayInt(vector, 3);

        System.out.println("Array rotado 2 posiciones a la izquierda:");
        rotaIzquierdaArrayInt(vector, 2);
    }

    public static int[] generaArrayInt(int n, int min, int max) {
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return vector;
    }

    public static void mostrarArray(int[] vector) {
        for (int x = 0; x < vector.length; x++) {
            System.out.println(vector[x]);
        }
    }

    public static int minimoArraInt(int[] vector) {
        int min = vector[0];
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] < min) {
                min = vector[x];
            }
        }

        return min;
    }

    public static int maximoArraInt(int[] vector) {
        int max = vector[0];
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] > max) {
                max = vector[x];
            }
        }

        return max;
    }

    public static double mediaArrayInt(int[] vector) { // para poner como entero solo cambia el metodo de double a int
        double med = 0; // para dar entero la media usa *int*
        for (int x = 0; x < vector.length; x++) {
            med += vector[x];

        }

        return med / vector.length;
    }

    public static boolean estaEnArrayInt(int[] vector) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite el numero que desea verificar: ");
        int numeroDigitado = in.nextInt();
        
        for (int x = 0; x < vector.length; x++) {
            if (numeroDigitado == vector[x]) {
                System.out.println("tu numero SI esta aqui");
                return true; // si lo encuentra arroja true
            }
        }
        System.out.println("tu numero NO esta aqui");
        return false; // no encontrado, false
    }

    public static int posicionEnArray(int[] vector) {
        int posicion = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero que deseas buscar la posicion: ");
        int n = leer.nextInt();
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] == n) {
                posicion = x;
            }

        }
        if (posicion == 0) {
            System.out.println("no se encontro el numero");

        } else {
            System.out.println("la posicion de " + n + " es: " + posicion);
        }
        return n;

    }

    public static int[] volteaArrayInt(int[] vector) {
        int[] invertido = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            invertido[i] = vector[vector.length - 1 - i];
        }

        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + " ");
        }

        System.out.println();

        return invertido;
    }

    public static int[] rotaIzquierdaArrayInt(int[] vector, int n) {
        int[] resultado = new int[vector.length];
        n = n % vector.length;

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[(i + n) % vector.length];
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();

        return resultado;
    }

    public static int[] rotaDerechaArrayInt(int[] vector, int n) {
        int[] resultado = new int[vector.length];
        n = n % vector.length; // Para evitar rotaciones mayores al tamaño

        for (int i = 0; i < vector.length; i++) {
            resultado[(i + n) % vector.length] = vector[i];
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();

        return resultado;
    }
}
