
package compromissoprincipal;

public class Compromisso {
    public Horario horario;
    public String descricao;
    private boolean ativo;
    
    public boolean getAtivo(){
        return ativo;
    }
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    public Compromisso(){
        
    }
    public Compromisso(int hora, int minuto, int segundo, String descricao){
        this.horario.hora = hora;
        this.horario.minuto = minuto;
        this.horario.segundo = segundo;
        this.descricao = descricao;
    }
    public void cancelaCompromisso(){
        this.ativo = false;
        
    }
    public void ativaCompromisso(){
        this.ativo = true;
        
    }
    
}
