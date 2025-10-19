
package ejerciciotaller;
public  class Chalet extends Vivienda implements IVviviendas {
    int numParcela;
    boolean conPiscina=false;
    
    public Chalet(int numParcela, String calle, double precio, int superficieEnMetros) {
        super(calle, precio, superficieEnMetros);
        this.numParcela = numParcela;
    }

   
    @Override
    public double calcularPrecio(){
       return superficieEnMetros*1300;
    }
      @Override
    public  double impuestoMunicipal(){
    if(!conPiscina){
       precio+=200.000; 
        precio*=0.5;
    }else{
        precio*=0.5;
    }
    return precio;
}
}
