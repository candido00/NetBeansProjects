
package metadenumero;

import java.util.Scanner;

public class MetadeNumero {

    public static void main(String[] args) {
        //int numero;
        float calcMetade, numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = scan.nextInt();
        if (numero > 20) {
            calcMetade = ( numero / 2 );
            System.out.println("A metade do numero: " + numero + " é: " + calcMetade);
            
        }
    }
    
}
