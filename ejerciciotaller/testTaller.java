
package ejerciciotaller;
public class testTaller {
    public static void main(String[] args) {
       // Crear la urbanización
        Urbanizacion urbanizacion = new Urbanizacion();

        // Crear objetos de las clases hijas
         Piso piso1 = new Piso(3, 201,"Calle x", 2500,80);
        Vivienda adosado1 = new Adosado(2,"Calle estrellada", 38000,120);
        Vivienda chalet1 = new Chalet(15, "calle estrellada", 720000, 250);

        // Agregar las viviendas a la urbanización
        urbanizacion.agregarVivienda(piso1);
        urbanizacion.agregarVivienda(adosado1);
        urbanizacion.agregarVivienda(chalet1);

        // Mostrar resultados
        System.out.println("Precio total de todas las viviendas: " + urbanizacion.calcularPrecioTotalViviendas());
        System.out.println("Precio total solo de chalets: " + urbanizacion.calcularPrecioTotalChalets());
    }
}


  
        
    
    

