
package poo;

public class POO {

    public static void main(String[] args) {
        Piloto pilotoA = new Piloto();
        pilotoA.cor = "Azul";
        pilotoA.tampado = false;
        pilotoA.carga = 100;
        pilotoA.tamanho = 10;
        pilotoA.tampa = new Tampa("Pequena");
        
        Piloto pilotoV = new Piloto();
        pilotoV.cor = "Vermelho";
        pilotoV.tampado = false;
        pilotoV.carga = 100;
        pilotoV.tamanho = 10;
        pilotoV.tampa = new Tampa("Media");
        
        Piloto pilotoP = new Piloto();
        pilotoP.cor = "Preto";
        pilotoP.tampado = false;
        pilotoP.carga = 100;
        pilotoP.tamanho = 10;
        pilotoP.tampa = new Tampa("Grande");
        
        pilotoA.escrever("Olá, mundo!");
        pilotoV.escrever("Olá, mundo!");
        pilotoP.escrever("Olá, mundo!");
        pilotoA.escrever("Escrevi em Azul");
        pilotoV.escrever("Escrevi em Vermelho");
        pilotoP.escrever("Escrevi em Preto");
        pilotoA.tampar();
        pilotoV.tampar();
        pilotoP.tampar();
        System.out.println("Tamanho Tampa: " + pilotoA.tampa.tamanhoT + ". Cor tampa: " + pilotoA.cor + ".");
        System.out.println("Tamanho Tampa: " + pilotoV.tampa.tamanhoT + ". Cor tampa: " + pilotoV.cor + ".");
        System.out.println("Tamanho Tampa: " + pilotoP.tampa.tamanhoT + ". Cor tampa: " + pilotoP.cor + ".");
        
    }
    
}
