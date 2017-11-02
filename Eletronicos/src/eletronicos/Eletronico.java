
package eletronicos;


public class Eletronico {
    int volume;
    boolean ligado;
    final int MAX_VOLUME=100;
    final int MIN_VOLUME=0;
    
    public Eletronico(){
        
    }
    
    void aumentaVolume(){
        if (volume<MAX_VOLUME) {
            volume++;
            
        }
         
        
    }
    void diminuiVolume(){
        if (volume>MIN_VOLUME) {
            volume--;
            
        }
        
        
    }
    void ligar(){
        ligado=true;
        
    }
    void desligar(){
        ligado=false;
    }
    
}
