
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        float num1, num2, soma, subt, multip, divis;
        String sinal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe qual operação deseja fazer ( + - x / )");
        sinal = scan.nextLine();
        if(!sinal.equals("+") && !sinal.equals("-") && !sinal.equals("x") && !sinal.equals("/") ){
            System.out.println("Sinal inválido!");
            
        }
        switch(sinal){
            case "+":
                System.out.println("Informe um numero para calcular: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro numero para calcular: ");
                num2 = scan.nextInt();
                soma = (num1 + num2);
                System.out.println("Resultado da soma: " + soma);
                break;
                
            case "-":
                System.out.println("Informe um numero para calcular: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro numero para calcular: ");
                num2 = scan.nextInt();
                subt = (num1 - num2);
                System.out.println("Resultado da subtração: " + subt);
                break;
                
            case "x":
                System.out.println("Informe um numero para calcular: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro numero para calcular: ");
                num2 = scan.nextInt();
                multip = (num1 * num2);
                System.out.println("Resultado da Multiplicação: " + multip);
                break;
                
            case "/":
                System.out.println("Informe um numero para calcular: ");
                num1 = scan.nextInt();
                System.out.println("Informe outro numero para calcular: ");
                num2 = scan.nextInt();
                
                if(num2 <= 0){
                    System.out.println("Impossivel dividir!");
                    
                }else{
                    divis = (num1 / num2);
                    System.out.println("Resultado da divisão: " + divis);
                    break;
                }
        }
        
    }
    
}
