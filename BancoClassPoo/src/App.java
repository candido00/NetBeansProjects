
public class App {
    
    public static void main(String[] args) {
        //nomeDaClasse nomeDoObjeto = new nomeDaClasse
        Cliente c = new Cliente();
        c.nome = "Lucicleydson";
        c.cpf = "000.000.000-00";
        c.agencia = "0000";
        c.conta = "000000-0";
        c.saldo = 50000;
        c.creditar(1000);
        c.creditar(2000);
        System.out.println(c.saldo);
        c.debitar(500);
        c.creditar(9000);
        System.out.println(c.saldo);
        
        //credite
        //credite
        //sout no saldo
        //debite
        //credite
        //sout no saldo
        
    }
    
}
