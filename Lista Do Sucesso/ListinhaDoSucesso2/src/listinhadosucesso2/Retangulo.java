/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso2;

/**
 *
 * @author Candido
 */
public class Retangulo {
    float comprimento;
    float largura;
    float area;
    float perimetro;
    
    public Retangulo(float comprimento ,float largura ){
        
        this.comprimento = comprimento;
        this.largura = largura;
        this.area = area;
        this.perimetro = perimetro;
        
    }
     void calcularArea(){
         area = (comprimento*largura);
         
     }
     
     void calcularPerimetro(){
         perimetro = (2*comprimento)+(2*largura);
         
     }
     
     void imprimir(){
         
         System.out.println(" o valor do comprimento é:" +comprimento+ "\n o valor da largura é:" +largura+ "\n o valor da area é:"+area+" \n o valor do perimetro é:"+perimetro);
     }
    
}
