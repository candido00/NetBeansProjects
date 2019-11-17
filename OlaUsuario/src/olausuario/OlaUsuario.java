
package olausuario;

import java.util.Scanner;

public class OlaUsuario {

    public static void main(String[] args) {
        String nome;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();
        System.out.println("Olá" + "," + nome + ".");
    }
    
}
