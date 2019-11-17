
package quilowatt;

import java.util.Scanner;

public class Quilowatt {

    public static void main(String[] args) {
        double salario, calcValorKw, calcKwTotal, calcKwDesc15;
        int kw;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");
        salario = scan.nextDouble();
        System.out.println("Informe quantos Kw você gasta na sua residência: ");
        kw = scan.nextInt();
        calcValorKw = (salario * 0.002);
        calcKwTotal = (calcValorKw * kw);
        calcKwDesc15 = calcKwTotal * 0.85;
        System.out.println("O valor de cada KW é: " + calcValorKw + " R$.");
        System.out.println("O valor a ser pago pela sua residência é: " + calcKwTotal + " R$.");
        System.out.println("O valor a ser pago pela sua residência com 15% de desconto é: " + calcKwDesc15 + " R$.");
        
        
    }
    
}
