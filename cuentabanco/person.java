
package cuentabanco;
import java. util.Scanner;
public class person {
    Scanner in= new Scanner (System.in);
    private String nombre;
    private String nif;

    public person(String nombre,String nif) {
       this.nif=nif;
       this.nombre=nombre;
    }
 public void nombreIngreso (){
   nombre=in.nextLine();
     System.out.println("nombre de cuenta: "+nombre);
 }
 public void nifIngreso(){
     this.nif=in.nextLine();
     System.out.println("codigo de cuenta: "+nif);
 }
    
}
