
package ejerciciotaller;
public  class Adosado extends Vivienda implements IVviviendas{
    int numPlantas;

    public Adosado(int numPlantas, String calle, double precio, int superficieEnMetros) {
        super(calle, precio, superficieEnMetros);
        this.numPlantas = numPlantas;
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
