/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listinhadosucesso3;
/**
 *
 * @author Candido
 */
public class Circulo {
    double raio;
    double area;
    double perimetro;
    double pi = 3.141516;
    
    public Circulo(double raio, double area){
        this.raio = raio;
        this.area = area;
 
    }
    
    void calcularArea(){
        area = (pi*raio*raio);
        
        
    }
    
    void calcularPerimetro(){
        perimetro = (2*pi*raio);
        
    }
    
    void imprimir(){
        System.out.println(" o valor do raio é:" +raio+ "\n o valor da area é:" +area+ "\n o valor da do perimetro é:"+perimetro);
    }
    
}
