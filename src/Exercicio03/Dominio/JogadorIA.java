package Exercicio03.Dominio;

import java.util.Random;

public class JogadorIA extends Jogador implements JogadorInterface {

    private Random random;

    public JogadorIA(String nome, char simbolo, TipoJogador tipo, Random random) {
        super(nome, simbolo, tipo);
        this.random = random;
    }

    @Override
    public void fazerJogada(Tabuleiro tabuleiro) {
        boolean jogadaFeita = false;

        while (!jogadaFeita) {
            int linha = random.nextInt(3);
            int coluna = random.nextInt(3);

            if(tabuleiro.atualizarTabuleiro(linha, coluna, getSimbolo())){
                jogadaFeita = true;
            }
        }

    }
}
