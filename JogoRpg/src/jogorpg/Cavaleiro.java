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
public class Cavaleiro extends ReinoDoFogo {

    private int durabilidadeEspada;

    
    
    public Cavaleiro(int durabilidadeEspada) {
        this.durabilidadeEspada = durabilidadeEspada;
    }

    public int usarEspada() {
        if (durabilidadeEspada > 0) {
            this.durabilidadeEspada--;
            return 1;

        } else {
            return 0;
        }

    }

    public int getDurabilidadeEspada() {
        return durabilidadeEspada;
    }

    private void setDurabilidadeEspada(int durabilidadeEspada) {
        this.durabilidadeEspada = durabilidadeEspada;
    }

}
