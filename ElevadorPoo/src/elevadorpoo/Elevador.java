
package elevadorpoo;

public class Elevador {
    int andarAtual;
    int totalAndar;
    int capacidade;
    int capacidadeAtual;
    
    public Elevador(){
        
    }
    void inicializar(int pCapacidade, int pTotalAndar){
        capacidade = pCapacidade;
        totalAndar = pTotalAndar;
        
    }
    void entrar(){
        if (capacidadeAtual < capacidade) {
            capacidadeAtual++;
        }
        
    }
    
}


