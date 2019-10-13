package numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {

    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2, i, resto;
        boolean ePrimo = true;           
        System.out.println("Informe um número: ");
        num1 = scan.nextInt();
        num2 = num1 -1;
        while (num1 <= 1) {            
            System.out.println("Informe um número maior que (1): ");
            num1 = scan.nextInt();
        }
        
        for (i = num2; i >= 2; i--) {
            resto = num1 % i;
            if (resto == 0) {
                ePrimo = false;
            } 
        }
        if(ePrimo){
            System.out.println("O número " +num1+ " é primo.");
        }
        else{
            System.out.println("O número " +num1+ " não é primo.");
        }
                
            
        }
        
        
    }
    

