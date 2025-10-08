
package clases;
import java.util.Scanner;
public class Papel {
    Scanner in = new Scanner (System.in);
    String color;
    int grosor;

    public Papel() {
        this.color= "";
        this.grosor = 0;
    }

    
    public void ingresarColor(){
        System.out.println("ingresa color ");
        this.color=in.nextLine();
    }
    public void ingresarGrosor(){
        System.out.println(" que tan grande la quieres? ");
        this.grosor=in.nextInt();
    }
    public void mostrarColor(){
        System.out.println("tu color es "+ color);
    }
    public void mostrarGrosor(){
        System.out.println("así de grandes las quieres "+grosor);
    }
}
