
package clases;
public class clases {
    public static void main (String[] args){
    bankAccount ba= new bankAccount();
    ba.showbalance();
    ba.deposito(450.000);
    ba.showbalance();
    ba.deposito(-450.000);
    ba.showbalance();
        System.out.println("   ");
    Papel pa= new Papel();
    pa.ingresarColor();
    pa.mostrarColor();
    pa.ingresarGrosor();
    pa.mostrarGrosor();
        System.out.println("    ");
        Mascara ma = new Mascara();
        ma.nombrePersonaje();
        ma.mostrarPersonaje();
        ma.TenerPelo();
        ma.mostrarPelonOno();
    }
}
