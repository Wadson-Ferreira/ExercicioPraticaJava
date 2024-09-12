package Exercicio03.Dominio;

import java.util.Scanner;

public class JogadorHumano extends Jogador implements JogadorInterface {

    private final Scanner scanner;

    public JogadorHumano(String nome, char simbolo, TipoJogador tipo, Scanner scanner) {
        super(nome, simbolo, tipo);
        this.scanner = scanner;
    }

    @Override
    public void fazerJogada(Tabuleiro tabuleiro) {
        int linha, coluna;

        do {
            System.out.println(getNome() + ", é a sua vez!");
            System.out.println("Digite a linha (0, 1, 2");
            linha = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a coluna (0, 1, 2");
            coluna = scanner.nextInt();
            scanner.nextLine();
        } while (!tabuleiro.atualizarTabuleiro(linha,coluna, getSimbolo()));
    }
}
