



package jogorpg;

/**
 *
 * @author Candido
 */
public class Jogo {
    
    public static void main(String[] args) {
        
        //REINO DO FOGO
        Cavaleiro cv = new Cavaleiro(10);
        cv.setNome("Lancelot");
        cv.setPontosDeVida(10);
        
        
        Mago mg = new Mago(10);
        mg.setNome("Gandalf");
        mg.setPontosDeVida(10);
        
        
        //REINO DO GELO
        Fada fd = new Fada(10);
        fd.setNome("Sininho");
        fd.setPontosDeVida(10);
        fd.incluirPontosDeVida(0);
        
        Monstro mt = new Monstro();
        mt.setNome("Smigol");
        mt.setPontosDeVida(10);
        
        //BATALHA
        Batalha bt = new Batalha();
        bt.setPersonagemFogo(cv);
        bt.setPersonagemGelo(fd);
        
        cv.retiraPontosDeVida(fd.usarMagia());
        fd.retiraPontosDeVida(cv.usarEspada());
        fd.retiraPontosDeVida(cv.usarEspada());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        cv.retiraPontosDeVida(fd.usarMagia());
        
        System.out.println("A fada tem "+fd.getPontosDeVida()+" pontos de vida");
        System.out.println("O cavaleiro tem "+cv.getPontosDeVida()+" pontos de vida");
        
        System.out.println("O vencedor é:"+bt.vencedor());
        System.out.println("O perdedor é:"+bt.perdedor());
        
        
        
        
    }
    
}
