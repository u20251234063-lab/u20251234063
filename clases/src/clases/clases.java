
package clases;

public class clases {
    public static void main (String[] args){
        person person = new person(" camila ",17);
        
        person.SayHello();
        
        student student1=new student(70);
        student1.reviewScore();
        student student2= new student(30);
        student2.reviewScore();
        System.out.println("      ");
        bankAccount ba= new bankAccount();
            ba.showbalance();
            ba.deposito(100);
            ba.deposito(238);
            ba.showbalance();
        System.out.println("    ");    
        moto mo = new moto();
        mo.mostrarVelocidad();
        mo.acelerar(30);
        mo.mostrarVelocidad();
        mo.frenar(3);
        mo.mostrarVelocidad();
    }
}
