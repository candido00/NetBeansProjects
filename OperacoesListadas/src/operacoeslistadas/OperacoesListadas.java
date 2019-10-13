
package operacoeslistadas;

import java.util.Scanner;

public class OperacoesListadas {

    public static void main(String[] args) {
        
        float num1, num2, subt ,media, produt, divis;
        String escolha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        num1 = scan.nextInt();
        System.out.println("Informe outro numero: ");
        num2 = scan.nextInt();
        System.out.println("Informe qual operação: (M S P D): ");
        escolha = scan.next().toUpperCase();
        
        switch(escolha){
            case "M":
                media = ((num1 + num2) / 2);
                System.out.println("Media entre os numeros: " + media);
                break;
                
            case "S":
                if(num1 > num2){
                    subt = (num1 - num2);
                    System.out.println("Diferença entre os numeros: " + subt);
                    
                }else if(num2 > num1){
                    subt = (num2 - num1);
                    System.out.println("Diferença entre os numeros: " + subt);
                    
                }else{
                    System.out.println("Numeros são iguais!");
                }
                break;
                
            case "P":
                produt = (num1 * num2);
                System.out.println("Produto entre os numeros: " + produt);
                break;
                
            case "D":
                if(num2 <= 0){
                    System.out.println("Impossivel dividir!");                    
                }else{
                    divis = (num1 / num2);
                    System.out.println("Divisão entre os numeros: " + divis);
                    break;
                    
                }
                
        }
    }
    
}
