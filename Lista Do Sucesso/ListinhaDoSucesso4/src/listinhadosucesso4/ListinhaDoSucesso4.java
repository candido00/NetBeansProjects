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
public class ListinhaDoSucesso4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moto m = new Moto("honda","titan","preto");
        m.imprimir();
        m.setMarcha(0);
        m.marchaAcima();
        m.marchaAbaixo();
        
    }
    
}
