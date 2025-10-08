
package clases;

import java.util.Scanner;

public class Mascara {
    Scanner in = new Scanner(System.in);
    String personaje;
    boolean pelo = false;
    String pelonOno,pelo2;
    
    public Mascara() {
        this.personaje = "";
        this.pelonOno = "";
    }

    public void nombrePersonaje() {
        System.out.println("ingresemos nombre del personaje");
        this.personaje = in.nextLine();
    }

    public void TenerPelo() {
        System.out.println(" ese personaje tiene pelo? si/no");
        if (!pelo) {
            pelonOno = in.nextLine();
            if (pelonOno.equals("si")){
                pelo2="no";
            }else {
                pelo2="si";
            }
        } 
    }

    public void mostrarPersonaje() {
        System.out.println(" entonces  " + personaje+ " es tu personaje");
    }

    public void mostrarPelonOno() {
        System.out.println(" en ese caso " + pelo2 +" esta pelon ");
    }
}
