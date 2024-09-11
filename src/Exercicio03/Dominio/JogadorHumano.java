package Exercicio03.Dominio;

import java.util.Scanner;

public class JogadorHumano implements JogadorInterface {
    private String nome;
    private char simbolo;
    private TipoJogador tipo;
    private Scanner scanner;

    public JogadorHumano(String nome, char simbolo, TipoJogador tipo, Scanner scanner) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.tipo = tipo;
        this.scanner = scanner;
    }

    @Override
    public void fazerJogada(Tabuleiro tabuleiro) {
        int linha, coluna;

        do {
            System.out.println(nome + ", é a sua vez!");
            System.out.println("Digite a linha (0, 1, 2");
            linha = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a coluna (0, 1, 2");
            coluna = scanner.nextInt();
            scanner.nextLine();
        } while (!tabuleiro.atualizarTabuleiro(linha,coluna, simbolo));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public TipoJogador getTipo() {
        return tipo;
    }

    public void setTipo(TipoJogador tipo) {
        this.tipo = tipo;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
