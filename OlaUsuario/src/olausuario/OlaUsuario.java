/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olausuario;

import java.util.Scanner;

/**
 *
 * @author cleyd
 */
public class OlaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();
        System.out.println("Olá" + "," + nome + ".");
    }
    
}
