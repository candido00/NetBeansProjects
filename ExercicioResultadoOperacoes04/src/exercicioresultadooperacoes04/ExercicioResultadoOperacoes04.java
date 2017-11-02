/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioresultadooperacoes04;

import java.util.Scanner;

/**
 *
 * @author Candido
 */
public class ExercicioResultadoOperacoes04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n1 = entrada.nextInt();
        int n2;
        entrada = new Scanner(System.in);
        System.out.println("Digite outro número inteiro: ");
        n2 = entrada.nextInt();
        int soma;
        soma= (n1+n2);
        System.out.println("o resultado da soma é:"+soma);
        float divisao; 
        divisao= (n1/n2);
        System.out.println("o resultado da divisão é:"+divisao);
        int multiplicacao;
        multiplicacao= (n1*n2);
        System.out.println("o resultado da multiplição é:"+multiplicacao);
        float subtracao;
        subtracao= n1-n2;
        System.out.println("o resultado da subtração é:"+subtracao);
        System.out.println("FIM");
    }
    
}
