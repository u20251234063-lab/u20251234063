package triangulo;

import java.util.Scanner;

public class triangulo {

    int base, altura, resultado;

    public triangulo() {
        this.base = 0;
        this.altura = 0;
        this.resultado = 0;
    }
    public void medidas() {
        Scanner in = new Scanner(System.in);
        System.out.println(" ingrese las medidas del triangulo ");
        System.out.println(" base ");
        base = in.nextInt();
        System.out.println(" altura ");
        altura = in.nextInt();
    }

    public void areatriangulo() {
        resultado = (base*altura)/2;
        
    }

    public void mostrarMedidas() {
        System.out.println("la base del triangulo es: " + base + " la altura es: " + altura);
    }

    public void mostrartriangulo() {
        System.out.println("area del cuadrado segun los datos: " + resultado);
    }

}
