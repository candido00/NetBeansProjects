
package resolverexpressao;

import java.util.Scanner;

public class ResolverExpressao {

    public static void main(String[] args) {
        // TODO code application logic here
        int X, Y;
        double calcular ,soma, calcularX, calcularY, calcularXY;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número de (X) para calcular a expressão (X + Y)² ");
        X = scan.nextInt();
        System.out.println("Informe outro número de (Y) para calcular a expressão (X + Y)² ");
        Y = scan.nextInt();
        //soma = (X + Y) ;
        //calcular = Math.pow(soma, 2) ;
        calcularX = Math.pow(X, 2);
        calcularY = Math.pow(Y, 2);
        calcularXY = (2 * X * Y);
        calcular = (calcularX + calcularY + calcularXY);
        System.out.println("O resultado da expressão é: " + calcular);
       
    }
    
}
