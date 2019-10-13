
package descontoinss;

import java.util.Scanner;

public class DescontoInss {

    public static void main(String[] args) {
        float salario;
        double calculo20, calculo25, calculo30;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");
        salario = scan.nextFloat();
        
        if(salario <= 600){
            System.out.println("Isento de pagar taxa INSS :).");
            
        }else if(salario > 600 && salario <= 1200){
            calculo20 = (salario * 0.20); 
            System.out.println("Voce precisa pagar R$ " + calculo20 + " de taxa de INSS infelizmente :(.");
            
        }else if(salario > 1200 && salario <= 2000){
            calculo25 = (salario * 0.25);
            System.out.println("Voce precisa pagar R$ " + calculo25 + " de taxa de INSS infelizmente :(.");
            
        }else if(salario > 2000){
            calculo30 = (salario * 0.30);
            System.out.println("Voce precisa pagar R$ " + calculo30 + " de taxa de INSS infelizmente :(.");
        }
        
    }
    
}
