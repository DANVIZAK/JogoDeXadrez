
package Tabuleiro;

import javax.swing.text.Position;


public class Peca  {
    protected Position posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    
    
    

    
}
