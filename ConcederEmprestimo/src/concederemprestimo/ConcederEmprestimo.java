
package concederemprestimo;

import java.util.Scanner;

public class ConcederEmprestimo {

    public static void main(String[] args) {
        float salarioBru, prestacao;
        double calculoPrest;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salario bruto: R$");
        salarioBru = scan.nextFloat();
        System.out.println("Informe o valor da prestação: R$");
        prestacao = scan.nextFloat();
        calculoPrest = (salarioBru * 0.3);
        
        if(prestacao > calculoPrest){
            System.out.println("Emprestimo nao pode ser concedido!");
            
        }else if(prestacao < calculoPrest && prestacao > 0){
            System.out.println("Emprestimo concedido!");
            
        }else if(prestacao == calculoPrest){
            System.out.println("Emprestimo concedido no ultimo centavo!");
            
        }else{
            System.out.println("Prestação nao pode ser menor ou igual a (0)");
        }
    }
    
}
