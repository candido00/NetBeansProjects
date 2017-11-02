
public class Cliente {
    //Atributos
    String nome;
    String cpf;
    String agencia;
    String conta;
    double saldo;
    //Construtor
    Cliente(){
        
    }
    //TipodeRetorno nomeDoMetodo(Parametros){
    //}
    void creditar(double pCredito){
        saldo = saldo + pCredito;
        
        
    }
    void debitar(double pDebito){
        if(saldo > 0 && pDebito <=saldo){
            saldo = saldo - pDebito;
        }
        
    }
}
 