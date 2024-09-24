package Exercicio03.Main;

import Exercicio03.Dominio.JogadorInterface;
import Exercicio03.Dominio.JogadorManager;
import Exercicio03.Dominio.Tabuleiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            JogadorManager jogadorManager = new JogadorManager(scanner);
            Tabuleiro tabuleiro = new Tabuleiro();

            JogadorInterface[] jogadores = jogadorManager.criarJogadores();
            JogadorInterface jogador1 = jogadores[0];
            JogadorInterface jogador2 = jogadores[1];

            boolean jogoAtivo = true;
            boolean turnoJogador1 = true;

            while (jogoAtivo) {
                tabuleiro.mostrarTabuleiro();

                JogadorInterface jogadorAtual;
                if (turnoJogador1){
                    jogadorAtual = jogador1;
                }else{
                    jogadorAtual = jogador2;
                }

                System.out.println(jogadorAtual.getNome() + "(" + jogadorAtual.getSimbolo() + ") é a sua vez.");
                jogadorAtual.fazerJogada(tabuleiro);

                if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())){
                    tabuleiro.mostrarTabuleiro();
                    System.out.println(jogadorAtual.getNome()+" Venceu o " +
                            "jogo!");
                    jogoAtivo = false;
                } else if (tabuleiro.verificarEmpate()){
                    tabuleiro.mostrarTabuleiro();
                    System.out.println("O jogo terminou em empate!");
                    jogoAtivo = false;
                }

                turnoJogador1 = !turnoJogador1;
            }

            System.out.println("Deseja jogar novamente? (S/N)");
            String resposta = scanner.nextLine().toUpperCase();
            if (!resposta.equals("S")) {
                jogarNovamente = false;
            }
        }



    }
}