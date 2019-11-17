
package exemploform;

import javax.swing.JOptionPane;

public class ExemploForm {

    public static void main(String[] args) {
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
