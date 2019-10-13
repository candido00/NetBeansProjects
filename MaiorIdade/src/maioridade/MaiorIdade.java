
package maioridade;

import java.util.Scanner;

public class MaiorIdade {

    public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        idade = scan.nextInt();
        
        if(idade >= 18 && idade < 60){
            System.out.println("Voce é maior de idade.");
            
        }else if(idade < 18 && idade > 0){
            System.out.println("Voce é menor de idade.");
            
        }else if(idade >= 60){
            System.out.println("Parabéns, voce ja é um ancião.");
            
        }else{
            System.out.println("Voce não pode ter idade igual ou inferior a (0)!");
        }
    }
    
}
