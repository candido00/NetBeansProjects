/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso1;

/**
 *
 * @author Candido
 */
public class Quadrado {
    float lado;
    float area;
    float perimetro;
    
    public Quadrado(float lado){
        this.lado = lado;
        
    }
    
    void calcularArea(){
        area=lado * lado;
        
    }
    
    void caucularPerimetro(){
        perimetro = (4*lado);
        
    }
    
    void imprimir(){
        System.out.println(" o valor do lado é:" +lado+ "\n o valor da area é:"+area+" \n o valor do perimetro é:"+perimetro);
    }
}
