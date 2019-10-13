/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadepessoa;

import java.util.Scanner;

/**
 *
 * @author cleyd
 */
public class IdadePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anoNasc, anoAtual, calcIdade, calc2020;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu ano de nascimento: ");
        anoNasc = scan.nextInt();
        System.out.println("Informe o ano atual: ");
        anoAtual = scan.nextInt();
        calcIdade = (anoAtual - anoNasc);
        calc2020 = (2020 - anoNasc);
        System.out.println("Sua idade atual é: " + calcIdade + " anos.");
        System.out.println("E em 2020 você terá: " + calc2020 + " anos.");
    }
    
}
