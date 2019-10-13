
package categorianadador;

import java.util.Scanner;

public class CategoriaNadador {

    public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = scan.nextInt();
        
        while(idade <= 0){
            System.out.println("Idade nao pode ser menor ou igual a (0)!");
            System.out.println("Informe sua idade: ");
            idade = scan.nextInt();
            
        }
        
        if(idade < 5 && idade > 0){
            System.out.println("Categoria Bebê.");
            
        }else if(idade >= 5 && idade <= 7){
            System.out.println("Categoria Infantil A.");
            
        }else if(idade >= 8 && idade <= 10){
            System.out.println("Categoria Infantil B.");
            
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Categoria Juvenil A.");
            
        }else if(idade >= 14 &&  idade <= 17){
            System.out.println("Categoria Juvenil B.");
         
        }else if(idade >= 18 && idade <60){
            System.out.println("Categoria Sênior");
            
        }else if(idade >= 60){
            System.out.println("Categoria Ancião Sênior");
        }
        
            
        }
    }
    

