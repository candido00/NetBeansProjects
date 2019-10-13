/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso6;

/**
 *
 * @author Candido
 */
public class Televisor {
    boolean ligado;
    int canal;
    int volume;
    int numeroCanais;
    int volumeMaximo;
    
    public Televisor(boolean ligado,int canal,int volume,int numeroCanais,int volumeMaximo){
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
        this.numeroCanais = numeroCanais;
        this.volumeMaximo = volumeMaximo;
        
    }
    void ligar(boolean ligar){
        if (ligar==true) {
            System.out.println(" Televisor ligado");
            System.out.println(" o canal sintonizado é: "+canal+ "\n o volume esta em: "+volume+"%"+
                    "\n o numero maximo de canais é:"+numeroCanais+ "\n o volume Maximo permitido é :"+volumeMaximo+"%");
            
            
        }
        
    }
    void desligar(boolean desligar){
        if (desligar==false) {
            System.out.println(" Televisor desligado");
            
        }
        
    }
    
    void canalAcima(){
        if (this.ligado==true) {
            canal++;
            if (canal>numeroCanais) {
                canal=1;
                
                
            }
            
            
        }
        
        
    }
    
    void canalAbaixo(){
        if (this.ligado==true) {
            canal--;
            if (canal<1) {
                canal=numeroCanais;
                
            }
                
            
            
        }
        
        
    }
    
    void volumeAcima(){
        if (this.ligado==true) {
            if (volume>=0 && volume<volumeMaximo) {
                volume++;   
            }else if(volume<0){
                volume=0;
            }else if(volume>volumeMaximo){
                volume=volumeMaximo;
                
            } 
        }
        
        
    }
    void volumeAbaixo(){
        if (this.ligado==true) {
            if (volume>0 && volume<=volumeMaximo) {
                volume--;   
            }else if(volume<0){
                volume=0;
            }else if(volume>volumeMaximo){
                volume=volumeMaximo;
                
            }
            
        }
    }
    
    void imprimir(){
        ligar(this.ligado);
        desligar(this.ligado);
        volumeAcima();
        volumeAbaixo();
        
        
        
        
       
        
    }
    
    
}
