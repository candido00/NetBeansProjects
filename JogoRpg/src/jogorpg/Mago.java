/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogorpg;

/**
 *
 * @author Candido
 */
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
