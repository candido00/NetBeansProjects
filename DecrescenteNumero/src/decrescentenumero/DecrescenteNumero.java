
package decrescentenumero;

import java.util.Scanner;

public class DecrescenteNumero {

    public static void main(String[] args) {
        float num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        num1 = scan.nextInt();
        System.out.println("Informe outro numero: ");
        num2 = scan.nextInt();
        
        if(num1 > num2){
            System.out.println("Ordem decrescente entre os numeros informados: " + num1 + "  " + num2 + ".");
            
        }else if(num2 > num1){
            System.out.println("Ordem decrescente entre os numeros informados: " + num2 + "  " + num1 + ".");
            
        }else if(num1 == num2){
            System.out.println("Nao pode colocar numeros iguais em ordem decrescente!");
        }
    }
    
}
