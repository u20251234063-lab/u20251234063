
package clases;

public class moto {
    int velocidad;

    public moto() {
        this.velocidad = 0;
    }
     public void frenar (int disminucion){
        velocidad=-disminucion;
           
        
    }
    public void acelerar (int aumento){
   
          velocidad=+aumento;
        
    }
  
        public void mostrarVelocidad (){
            System.out.println("velocidad  "+velocidad);
        }
    
}
