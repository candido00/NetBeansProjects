
package jogorpg;

public class Fada extends ReinoDoGelo {

    private int durabilidadeMagia;
    private int pontosDeVida;

    public Fada(int durabilidadeMagia) {
        this.durabilidadeMagia = durabilidadeMagia;
        

    }
    public void incluirPontosDeVida(int pontosDeVida){
        this.pontosDeVida+=3;
        
    }
    public int usarMagia(){
        if (durabilidadeMagia>0) {
            this.durabilidadeMagia--;
            return 1;
            
        }else{
            return 0;
        }
        
    }

    public int getDurabilidadeMagia() {
        return durabilidadeMagia;
    }

    public void setDurabilidadeMagia(int durabilidadeMagia) {
        this.durabilidadeMagia = durabilidadeMagia;
    }

}
