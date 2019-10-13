/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencianumero;

import java.util.Scanner;

/**
 *
 * @author cleyd
 */
public class PotenciaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double calcQuadrado, calcCubo, calcRaizQuad, calcPotencia10;
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero para calcular: ");
        numero = scan.nextInt();
        calcQuadrado = Math.pow(numero, 2);
        calcCubo = Math.pow(numero, 3);
        calcRaizQuad = Math.sqrt(numero);
        calcPotencia10 = Math.pow(numero, 10);
        System.out.println("O quadradro do numero " + numero + " é: " + calcQuadrado);
        System.out.println("O cubo do numero " + numero + " é: " + calcCubo);
        System.out.println("A raiz quadrada do numero " + numero + " é: " +calcRaizQuad);
        System.out.println("O numero " + numero + " elevado a potência 10 é : " + calcPotencia10);
        
    }
    
}
