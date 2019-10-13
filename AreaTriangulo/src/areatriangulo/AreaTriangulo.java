
package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        
        float base, altura, calcular;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho da base do triangulo: ");
        base = scan.nextFloat();
        System.out.println("Informe a altura do triangulo: ");
        altura = scan.nextFloat();
        calcular = (base * altura) / 2;
        System.out.println("A área do triangulo é: " + calcular + " CM²");
        
    }
    
}
