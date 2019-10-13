
package poo;

public class Piloto {
    String cor;
    Tampa tampa;
    double tamanho;
    int carga;
    boolean tampado;
    
    public void escrever(String texto){
        if(!tampado && carga > 0){
            System.out.println(texto);
            
        }else{
            System.out.println("Impossivel escrever");
        }
        
    }
    public void tampar(){
        if(tampado == true){
            System.out.println("Já está tampado!");
            
        }else{
            tampado = false;
            System.out.println("Piloto tampado!");
        }
        
    }
    public void destampar(){
        if(tampado == true){
            tampado = false;
            System.out.println("Piloto tampado!");
            
        }else{
            System.out.println("Já está destampado!");
        }
        
    }
    
    public Piloto(){
        tampado = true;
        carga = 100;
        
    }
    
}
