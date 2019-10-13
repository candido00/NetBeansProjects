
package compromissoprincipal;

public class Horario extends Hora{
    
    public void getHora(){
        this.hora = 12;
        this.minuto = 12;
        this.segundo = 12;
    }
    public void limpaHora(){
        this.hora = 00;
        this.minuto = 00;
        this.segundo = 00;
        
    }
    
    public Horario(){
        
    }
    public Horario(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    
}
