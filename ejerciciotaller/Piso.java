
package ejerciciotaller;
public  class Piso extends Vivienda implements IVviviendas {
    // private ya que no hereda 
    private int planta;
    private int puerta;

    public Piso(int planta, int puerta, String calle, double precio, int superficieEnMetros) {
        super(calle, precio, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }
     
   
    @Override
    public double calcularPrecio(){
        return superficieEnMetros*1000;
    }
    @Override
    public  double impuestoMunicipal(){
    return precio*0.5;
}

}

