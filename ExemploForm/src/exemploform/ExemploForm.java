/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploform;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExemploForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Que Coisa Coisada");
        //JOptionPane.showMessageDialog(null, "Nathália Coisada");
        String entrada = "";
        entrada = JOptionPane.showInputDialog(null, "Primeiro valor:");
        int primeiroValor = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null, "Segundo valor:");
        int segundoValor = Integer.parseInt(entrada);
        String mensagem = "Os valores informados foram:";
        mensagem += "\nPrimeiro valor: " + primeiroValor;
        //mensagem = mensagem + "";
        // \n quebra de linha no texto
        mensagem += "\nSegundo valor: " + segundoValor;

        if (primeiroValor > segundoValor) {
            mensagem += "\nMaior valor: " + primeiroValor;
        } else {
            mensagem += "\nMaior valor: " + segundoValor;
        }
        JOptionPane.showMessageDialog(null, mensagem);

    }

}
