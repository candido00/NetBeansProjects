/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletronicos;

/**
 *
 * @author Candido
 */
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
