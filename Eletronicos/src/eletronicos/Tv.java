
package eletronicos;

public class Tv extends Eletronico implements IEletronico{
    int canal;
    
    public Tv(){
  
        
    }
    
    void aumentaCanal(){
        canal++;
        
    }
    void diminuiCanal(){
        canal--;
        
    }

    @Override
    public void mudarVolume(int novoVolume) {
        volume = novoVolume+1;
    }
    
    
}
