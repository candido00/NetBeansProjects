
package pesoideal;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        String sexo;
        double altura, pesoIdMasc, pesoIdFem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        altura = scan.nextDouble();
        System.out.println("Informe o seu sexo(MASCULINO ou FEMININO): ");
        sexo = scan.next();
        
        while(!sexo.equalsIgnoreCase("MASCULINO") && !sexo.equalsIgnoreCase("FEMININO")){
            System.out.println("Informe o seu sexo(MASCULINO ou FEMININO)");
            sexo = scan.next();
            
        }
        if(sexo.equalsIgnoreCase("MASCULINO")){
            pesoIdMasc = ((72.7 * altura) - 58);
            System.out.printf("O peso ideal para você é: %.3f KG. \n" , pesoIdMasc);
            
        }else if(sexo.equalsIgnoreCase("FEMININO")){
            pesoIdFem = ((62.1 * altura) - 44.7);
            System.out.printf("O peso ideal para você é: %.3f KG. \n" , pesoIdFem);
        }
    }
    
}
