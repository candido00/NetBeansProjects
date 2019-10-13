
package bonussalario;

import java.util.Scanner;

public class BonusSalario {

    public static void main(String[] args) {
        int anos;
        double porcent,salario;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salario: R$ ");
        salario = scan.nextFloat();
        System.out.println("Informe quantos anos de trabalho voce tem na empresa: ");
        anos = scan.nextInt();
        
        if(anos >= 5){
            porcent = (salario * 0.2);
            System.out.printf("O bonus do seu salario é de: R$ %.2f \n", porcent);
            
        }else if(anos > 0 && anos < 5){
            porcent = (salario * 0.1);
            System.out.printf("O bonus do seu salario é de: R$ %.2f \n", porcent);
            
        }else{
            System.out.println("Nao pode existir anos de trabalho igual ou inferior a (0)!");
        }
        //System.out.printf("O bonus do seu salario é de: R$ %.2f" + "\n", porcent);
    }
    
}
