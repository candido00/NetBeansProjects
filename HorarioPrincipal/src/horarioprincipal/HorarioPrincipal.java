
package horarioprincipal;


public class HorarioPrincipal {

    public static void main(String[] args) {
        Horario horario = new Horario();
        horario.getHorario("21","45","12");
        
        System.out.println(horario.hora + ":" + horario.minuto + ":" + horario.segundo);
    }
    
}
