/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso7;

/**
 *
 * @author Candido
 */
public class Microondas {
    boolean ligado;
    
    public Microondas(boolean ligado){
        this.ligado = ligado;
        
    }
    void ligar(){
        if (this.ligado==true) {
            System.out.println("Micriondas ligado");
            
        }
        
    }
    void desligar(){
        if (this.ligado==false) {
            System.out.println("Microondas desligado");
            
        }
        
    }
    void imprimir(){
        ligar();
        desligar();
        
    }
    
}
