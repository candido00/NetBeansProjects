
package planotrabalho;

import java.util.Scanner;

public class PlanoTrabalho {

    public static void main(String[] args) {
        String plano;
        double salario, salarioNo = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu plano de trabalho: ");
        plano = scan.next();
        System.out.println("Informe seu salario: ");
        salario = scan.nextFloat();
        
        while(!plano.equals("A") && !plano.equals("B") && !plano.equals("C")){
            System.out.println("Informe seu plano de trabalho (A B C): ");
            plano = scan.next();
            System.out.println("Informe seu salario: ");
            salario = scan.nextFloat();
            
        }
        switch(plano){
            case "A":
                salarioNo = (salario * 1.10);
                break;
                
            case "B":
                salarioNo = (salario * 1.15);
                break;
                
            case "C":
                salarioNo = (salario * 1.20);
                break;
        }
        System.out.println("O seu novo salario é: " + salarioNo);
        
    }
    
}
