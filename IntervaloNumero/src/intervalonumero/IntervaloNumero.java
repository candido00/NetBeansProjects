
package intervalonumero;

import java.util.Scanner;

public class IntervaloNumero {
   
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = scan.nextInt();
        
        if(numero >= 50 && numero <= 100){
            System.out.println("O numero " + numero + " pertence ao intervalo!");
        }else{
            System.out.println("O numero " + numero + " nao pertence ao intervalo!");
        }
    }
    
}
