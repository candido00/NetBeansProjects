
package jogorpg;

public class Mago extends ReinoDoFogo {

    private int quantidadePoMagico;

    public Mago(int q){
            this.quantidadePoMagico = q;
        

    }

    public int usarPoMagico() {
        if (quantidadePoMagico > 0) {
            this.quantidadePoMagico--;
            return 1;

        } else {
            return 0;
        }

    }

    public int getQuantidadePoMagico() {
        return quantidadePoMagico;
    }

    private void setQuantidadePoMagico(int quantidadePoMagico) {
        this.quantidadePoMagico = quantidadePoMagico;
    }

}
