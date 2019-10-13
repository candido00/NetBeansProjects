
package cachorropoo;

public class CachorroPoo {

    public static void main(String[] args) {
        Cachorro snoop = new Cachorro();
        snoop.idCachorro = 1;
        snoop.nome = "Costelinha";
        snoop.raca = "Labrador";
        snoop.peso = 50;
        snoop.comprimento = 70;
        snoop.altura = 80;
        snoop.cor = "Preto";
        snoop.idade = 30;
        
        Cachorro snoop1 = new Cachorro();
        snoop1.idCachorro = 2;
        snoop1.nome = "Apolo";
        snoop1.raca = "Pug";
        snoop1.peso = 20;
        snoop1.comprimento = 30;
        snoop1.altura = 40;
        snoop1.cor = "Marrom";
        snoop1.idade = 10;
        
        Cachorro snoop2 = new Cachorro();
        snoop2.idCachorro = 3;
        snoop2.nome = "Pingo";
        snoop2.raca = "Buldogue";
        snoop2.peso = 40;
        snoop2.comprimento = 60;
        snoop2.altura = 70;
        snoop2.cor = "Branco";
        snoop2.idade = 25;
        
        
        
        System.out.println(snoop.idCachorro + "\n" + snoop.nome + "\n" + snoop.raca + "\n" + snoop.peso + "\n" 
                + snoop.comprimento + "\n" + snoop.altura + "\n" + snoop.cor + "\n" + snoop.idade + "\n");
        
        System.out.println(snoop1.idCachorro + "\n" + snoop1.nome + "\n" + snoop1.raca + "\n" + snoop1.peso + "\n" 
                + snoop1.comprimento + "\n" + snoop1.altura + "\n" + snoop1.cor + "\n" + snoop1.idade + "\n");
        
        System.out.println(snoop2.idCachorro + "\n" + snoop2.nome + "\n" + snoop2.raca + "\n" + snoop2.peso + "\n" 
                + snoop2.comprimento + "\n" + snoop2.altura + "\n" + snoop2.cor + "\n" + snoop2.idade);
        
    }
    
}
