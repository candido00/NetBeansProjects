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
public class Radio extends Eletronico implements IEletronico{
    int estacao;
    final int MAX_VOLUME=50;
    
    
    public Radio(){
        
    }
    void aumentaVolume(){
        if (volume<MAX_VOLUME) {
            volume= volume+2;
            
        }
    }
    
    
    void aumentaEstacao(){
        estacao++;
        
    }
    void diminuiEstacao(){
        estacao--;
        
    }

    @Override
    public void mudarVolume(int novoVolume) {
        volume= novoVolume+2;
    }
    
    
}
