
package elevadorpoo;

public class ElevadorPoo {
 
    public static void main(String[] args) {
        
        Elevador e = new Elevador();
        
        e.inicializar(10,20);
        
        int i = 0;
        
        
        while (i < e.capacidade) {            
            
            e.entrar();
            System.out.println(e.capacidadeAtual);
            i++;
        }
        
    }
    
}
