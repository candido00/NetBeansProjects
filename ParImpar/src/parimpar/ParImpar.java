/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author cleyd
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = scan.nextInt();
        if (numero % 2 == 1) {
            System.out.println("Numero impar!");
            
        } else {
            System.out.println("Numero par!");
        }
    }
    
}
