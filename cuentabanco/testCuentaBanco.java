
package cuentabanco;
public class testCuentaBanco {
   public static void main(String[] args) {
        person p = new person("Camila", "Ayez");
        CuentaBanco c = new CuentaBanco(934848, 0.0, p);
        c.getCliente();
        c.mostrarInformacion();
        c.ingresar(200.000);
        c.retirar(150.000);
        System.out.println("ingresa tu nif");
        p.nifIngreso();
        System.out.println("ahora tu nombre");
        p.nombreIngreso();
}
}
