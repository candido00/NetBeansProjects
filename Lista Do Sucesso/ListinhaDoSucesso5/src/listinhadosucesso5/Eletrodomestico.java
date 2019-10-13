/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso5;

/**
 *
 * @author Candido
 */
public class Eletrodomestico {
    boolean ligado;
    
    public Eletrodomestico(boolean ligado){
        this.ligado = ligado;
        
    }
    
    void ligar(boolean ligar){
        if (ligar==true) {
            System.out.println("Eletrodomestico ligado");
            
        }

    }
    void desligar(boolean desligar){
        if (desligar==false) {
            System.out.println("Eletrodomestico desligado");
            
        }
       
    }
    void imprimir(){
        ligar(ligado);
        desligar(ligado);
    }
    
}

