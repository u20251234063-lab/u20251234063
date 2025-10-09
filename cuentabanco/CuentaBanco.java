
package cuentabanco;
public class CuentaBanco {
    
    private int numeroCuenta;
    private double saldo;
    private person cliente;

    public CuentaBanco(int numeroCuenta, double saldo, person cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
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
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Has ingresado " + cantidad + " correctamente 👍🏻");
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " correctamente 👍🏻 ");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar el retiro :( ");
        } else {
            System.out.println("La cantidad a retirar debe ser positiva ._. ");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + cliente);
        System.out.println("Saldo actual: " + saldo);
    }
   
}
