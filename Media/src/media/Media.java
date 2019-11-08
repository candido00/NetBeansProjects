
package media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        float nota1, nota2, nota3, media;
        Scanner scan = new Scanner(System.in);
            System.out.println("Informe a primeira nota: ");
            nota1 = scan.nextFloat();
            System.out.println("Informe a segunda nota: ");
            nota2 = scan.nextFloat();
            System.out.println("Informe a terceira nota: ");
            nota3 = scan.nextFloat();
            
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do estudante é: " + media);
        }
            
                   
        }
