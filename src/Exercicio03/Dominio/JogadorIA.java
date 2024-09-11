package Exercicio03.Dominio;

public class JogadorIA implements JogadorInterface {
    private String nome;
    private char simbolo;
    private TipoJogador tipo;
    private Tabuleiro tabuleiro;

    public JogadorIA(String nome, char simbolo, TipoJogador tipo, Tabuleiro tabuleiro) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.tipo = tipo;
        this.tabuleiro = tabuleiro;
    }


    @Override
    public void fazerJogada(Tabuleiro tabuleiro) {

    }
}
