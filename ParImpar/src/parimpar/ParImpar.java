
package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = scan.nextInt();
        if (numero % 2 == 1) {
            System.out.println("Numero impar!");
            
        } else {
            System.out.println("Numero par!");
        }
    }
    
}
