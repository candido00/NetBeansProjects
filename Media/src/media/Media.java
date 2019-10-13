/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.Scanner;

/**
 *
 * @author cleyd
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
