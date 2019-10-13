/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso4;


/**
 *
 * @author Candido
 */
public class Moto {
    String marca;
    String modelo;
    String cor;
    private int marcha;
    
    public Moto(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        
        
    }
    
    
    void imprimir(){
        System.out.println(" a marca da moto é:" +marca+ "\n o modelo da moto é:"+modelo+
               "\n a cor do moto é:" +cor);
        
        
        
        }

    public int getMarcha() {
        return marcha;
    }

    public int setMarcha(int marcha) {
        if (marcha==0) {
            System.out.println(" a marcha é a: neutra");
            
        }else if(marcha==1){
            System.out.println(" a marcha é a: primeira");
            
        }else if(marcha==2){
            System.out.println(" a marcha é a: segunda");
            
        }else if(marcha==3){
            System.out.println(" a marcha é a: terceira");
            
        }else if(marcha==4){
            System.out.println(" a marcha é a: quarta");
            
        }else if(marcha==5){
            System.out.println(" a marcha é a: quinta");
            
        }
        this.marcha = marcha;
        return this.marcha = marcha;
    }
    
    void marchaAcima(){
       
        
    }
    
    void marchaAbaixo(){
        
        
    }
        
        }
        
    
    
