/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadorpoo;

/**
 *
 * @author Candido
 */
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


