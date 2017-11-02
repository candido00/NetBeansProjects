/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogorpg;

import jogorpg.ReinoDoFogo;

/**
 *
 * @author Candido
 */
public class Criacao {

    

    public boolean personagemMorreu(Object p) {
        if (p instanceof Mago) {
            if (((Mago)p).getPontosDeVida() <= 0) {
                return true;
            }else{
               return false;
         }

        }
        return false;
    }

}
