package excepciones;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        try { // codigo que quiero que se ejecute el cual no sabemos si tiene error
            int valor1, valor2, resultado;
            Scanner in = new Scanner(System.in);
            System.out.println("Ingresa el primer valor: ");
            valor1 = in.nextInt();
            System.out.println("Ingresa el segundo valor: ");
            valor2 = in.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Division igual a : " + resultado);
        } catch (/*objeto de la clase excepcion*/Exception e) {
            // comportamieto del programa que no tenemos previsto
            System.out.println(" Error !!!"+e);
        }finally{
            System.out.println("Operacion terminada");
        }

        int edades[] = {15, 12, 13, 30};
        try {
            System.out.println("la edad de la posicion 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println(" Intentaste acceder a un indice inexistente ");
        }

        try {
            int ecuacion = 3 / 0;
        } catch (Exception e) {
            System.out.println(" No se puede dividir por cero!!!");
        }
    }

}
