/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadorpoo;

/**
 *
 * @author Candido
 */
public class ElevadorPoo {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Elevador e = new Elevador();
        
        e.inicializar(10,20);
        
        int i = 0;
        
        
        while (i < e.capacidade) {            
            
            e.entrar();
            System.out.println(e.capacidadeAtual);
            i++;
        }
        
    }
    
}
