
package diferencanumero;

import java.util.Scanner;

public class DiferencaNumero {

    public static void main(String[] args) {
        int num1, num2, subt;
        subt = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero para calcular a diferença: ");
        num1 = scan.nextInt();
        System.out.println("Informe outro numero para calcular a diferença: ");
        num2 = scan.nextInt();
        
        if (num1 > num2) {
            subt = (num1 - num2);
            
        }else if(num2 > num1){
            subt = (num2 - num1);
            
        }else if(num1 == num2){
            System.out.println("Nao pode calcular a diferença entre numeros iguais!");
        }
        System.out.println("A diferença entre os numeros informados é: " + subt + ".");
    }
    
}
