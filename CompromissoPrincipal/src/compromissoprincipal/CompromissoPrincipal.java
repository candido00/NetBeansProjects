
package compromissoprincipal;

public class CompromissoPrincipal {

    public static void main(String[] args) {
        Horario horario = new Horario();
        Compromisso compromisso = new Compromisso();
        horario.getHora();
        horario.limpaHora();
        compromisso.cancelaCompromisso();
        compromisso.ativaCompromisso();
        
        System.out.println(horario.hora + ":" + horario.minuto + ":" + horario.segundo);
        System.out.println(compromisso.getAtivo());
    }
    
}