
package diasemana;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        int dia;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        dia = scan.nextInt();
        
        while(dia < 1 || dia > 7){
            System.out.println("Informe um numero entre (1 e 7): ");
            dia = scan.nextInt();
        }
        switch(dia){
            case 1:
                System.out.println("Domingo.");
                break;
                
            case 2:
                System.out.println("Segunda.");
                break;
                
            case 3:
                System.out.println("Terça.");
                break;
                
            case 4:
                System.out.println("Quarta.");
                break;
                
            case 5:
                System.out.println("Quinta.");
                break;
                
            case 6:
                System.out.println("sextou.");
                break;
                
            case 7:
                System.out.println("Sábado.");
                break;    
        }
    }
    
}
