
package exerciciomediaaluno02;

import java.util.Scanner;

public class ExercicioMediaAluno02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("informe seu nome:");
        nome = entrada.nextLine();
        entrada.nextLine();
        float media;
        float n1;
        float n2;
        System.out.println("informe a primeira nota:");
        n1 = entrada.nextFloat();
        System.out.println("informe a segunda nota:");
        n2 = entrada.nextFloat();
        media = (n1+n2)/2;
        if (media >=7){
            System.out.println("aprovado!");
        }
        else {System.out.println("reprovado!");
    }
    }
    
}
    
