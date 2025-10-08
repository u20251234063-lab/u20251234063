
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {
    public static void main(String[] args) {

        for (int i=0; i<11; i+=2){
            System.out.println("numero"+i);
        }
        System.out.println("    ");
        int x=1,j=95;
        
        do {
            System.out.println("numero"+x);
            x++;
        }while (x<=6);
        System.out.println(" ahora de 99 para abajo ");
            while(j<=99){
                System.out.println("numero"+j);
                j++;
            }
        Scanner in= new Scanner(System.in);
        System.out.println("ingrese nombres");
        String nombres = in.nextLine();
        String nombre=in.nextLine();
        int contraseña;
        System.out.println(" INGRESE CONTRASEÑA ");
        contraseña=in.nextInt();
        if(nombres.equals(nombre)){
            System.out.println("estan los mismos nombres");
        }else {
            System.out.println("no estan los mismos nombres");
        }
        System.out.println("    ");
        
        System.out.println(" inicia sesion ");
        System.out.println("      ");
        System.out.println("digite su nombre de usuario");
        String nombreUsuario = in.nextLine();
        System.out.println("verifique el nombre");
        String verificacionUsuario = in.nextLine();
        if (nombreUsuario.equals(verificacionUsuario)){
            System.out.println("verificacion exitosa");
        } else {
            System.out.println("vuelve a intentarlo");
        }
        System.out.println("ingrese contraseña ");
            System.out.println("verifique contraseña");
        int verifiqueContraseña=in.nextInt();
        if (contraseña == verifiqueContraseña){
            System.out.println("contraseña correcta");
        }else{
            System.out.println("contraseña incorrecta");
        }
    
       
    }   
}
