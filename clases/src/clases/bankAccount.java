
package clases;

public class bankAccount {
    double balance;

    public bankAccount() {
        this.balance = 0;
    }
    public void deposito(double value){
        this.balance+=value;
    }
    public void showbalance(){
        System.out.println("saldo actual: "+balance);  //observar el atributo en una clase 
    }
}
