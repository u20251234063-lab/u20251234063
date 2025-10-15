
package clases;
public class cuenta {
    private int numeroCuenta;
    private double saldo;
    private person cliente;

    public cuenta(int numeroCuenta, person cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public person getCliente() {
        return cliente;
    }

    public void setCliente(person cliente) {
        this.cliente = cliente;
    }
    public void ingresar(double x){
        while(saldo>0){ 
            this.saldo+=x;  
        }
    }
    public void retirar(double x){
        
    }

    @Override
    public String toString() {
        return "cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
}
