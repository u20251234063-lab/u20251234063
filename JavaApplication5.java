package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        int[] digitados = new int[3];
        repetidos(digitados);
        int[] aleatorios = generarAleatorio(3, 1, 10);
        System.out.println(repetido(aleatorios));
        mostarAleatorio(aleatorios);
        System.out.println("numeros no repetidos");
        String name = "camila";
        System.out.println("nombre " + name);
        int edad = 17;
        System.out.println("edad " + edad);
        double altura = 1.58;
        System.out.println("altura " + altura);
        boolean gusto = false;
        System.out.println("te gusta programar? " + !gusto);
        String email = "camila@gmail.com";
        System.out.println("email " + email);
        char inicialNombre = 'C';
        System.out.println("inicial nombre  " + inicialNombre);

        //operadores 
        int A = 2, B = 2;
        int suma, resta, division;
        suma = A + B;
        resta = A - B;
        division = A / B;

        int[] resultado = new int[3];
        resultado[0] = suma;
        resultado[1] = resta;
        resultado[2] = division;

        System.out.println("resultados ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }

        int numeros = 1;
        while (numeros < 11) {
            System.out.println("los numero son " + numeros);
            numeros++;
        }
        int datos = 1;
        do {
            System.out.println(datos);
            datos++;
        } while (datos < 10);

        int multiplicacion = 5;
        int numero = 1;
        while (numero < 11) {
            System.out.println("los multiplos de 5 son " + (multiplicacion * numero));
            numero++;
        }
        int[] resultado2 = new int[4];
        resultado2[0] = 3;
        resultado2[1] = 4;
        resultado2[2] = 5;
        resultado2[3] = 3;
        int sumaTotal = 0;
        for (int x = 0; x < resultado2.length; x++) {
            sumaTotal += resultado2[x];
        }
        System.out.println("suma total " + sumaTotal);
    }

    public static int[] generarAleatorio(int n, int min, int max) {
        int[] aleatorios = new int[n];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return aleatorios;
    }

    public static void mostarAleatorio(int[] aleatorios) {
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.println("numeros aleatorios " + aleatorios[i]);
        }
    }

    public static boolean repetido(int[] aleatorios) {
        for (int i = 0; i < aleatorios.length; i++) {
            for (int x = 0; x < aleatorios.length; x++) {
                if (i != x && aleatorios[i] == aleatorios[x]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int repetidos(int[] digitados) {
        Scanner in = new Scanner(System.in);
        digitados = new int[3];
        int num, count = 0;
        for (int i = 0; i < digitados.length; i++) {
            System.out.println("agrega numeros");
            digitados[i] = in.nextInt();
            num = digitados[i];

            for (int x = 0; x < digitados.length; x++) {

                while (i != x && digitados[i] == digitados[x]) {
                    count++;
                    break;

                }
            }
            if (num == digitados[i]) {
                System.out.println("el numero " + num + " se repite " + count + " veces ");
            }
        }

        return count++;
    }
}
