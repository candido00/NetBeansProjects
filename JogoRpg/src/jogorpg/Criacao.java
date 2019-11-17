
package jogorpg;

import jogorpg.ReinoDoFogo;

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
