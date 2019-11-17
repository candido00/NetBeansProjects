
package potencianumero;

import java.util.Scanner;

public class PotenciaNumero {

    public static void main(String[] args) {
        double calcQuadrado, calcCubo, calcRaizQuad, calcPotencia10;
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero para calcular: ");
        numero = scan.nextInt();
        calcQuadrado = Math.pow(numero, 2);
        calcCubo = Math.pow(numero, 3);
        calcRaizQuad = Math.sqrt(numero);
        calcPotencia10 = Math.pow(numero, 10);
        System.out.println("O quadradro do numero " + numero + " é: " + calcQuadrado);
        System.out.println("O cubo do numero " + numero + " é: " + calcCubo);
        System.out.println("A raiz quadrada do numero " + numero + " é: " +calcRaizQuad);
        System.out.println("O numero " + numero + " elevado a potência 10 é : " + calcPotencia10);
        
    }
    
}
