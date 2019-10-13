
package horarioprincipal;


public class Horario {
    String hora, minuto, segundo;
    
    public Horario(){
        this.hora = "00";
        this.minuto = "00";
        this.segundo = "00";
        
        
    }
    public void getHorario(String hora, String minuto, String segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        
        
    }
    
    
}
