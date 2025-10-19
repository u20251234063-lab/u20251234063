
package ejerciciotaller;

public abstract class Vivienda implements IVviviendas {
    protected String calle;
    protected double precio;
    protected int superficieEnMetros;

    public Vivienda(String calle, double precio, int superficieEnMetros) {
        this.calle = calle;
        this.precio = precio;
        this.superficieEnMetros = superficieEnMetros;
    }
    public double calcularPrecio() {
        return superficieEnMetros * 1000; // Por defecto
    }

    public abstract double impuestoMunicipal();

    @Override
    public void aumentarPrecio(int aumento) {
        this.precio += aumento;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCalle() {
        return calle;
    }
}
