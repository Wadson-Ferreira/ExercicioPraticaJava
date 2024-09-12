package Exercicio03.Dominio;

import java.util.Random;
import java.util.Scanner;

public class JogadorManager {

    private Scanner scanner;
    private static char ultimoSimboloIA = 'O';

    public JogadorManager(Scanner scanner) {
        this.scanner = scanner;
    }

    private JogadorHumano criarJogadorHumano(String nomeJogador) {
        System.out.println("Digite o nick do " + nomeJogador + ": ");
        String nome = scanner.nextLine();

        System.out.println("Qual símbolo deseja jogar? 'X' ou 'O'?");
        char simbolo = scanner.next().toUpperCase().charAt(0);

        while (simbolo != 'X' && simbolo != 'O') {
            System.out.println("Símbolo inválido, escolha 'X' ou 'O'.");
            simbolo = scanner.next().toUpperCase().charAt(0);
        }
        scanner.nextLine();

        return new JogadorHumano(nome, simbolo, TipoJogador.HUMANO, scanner);
    }

    private JogadorIA criarJogadorIA() {
        char simboloIA = (ultimoSimboloIA == 'X') ? 'O' : 'X';
        ultimoSimboloIA = simboloIA;

        return new JogadorIA("IA", simboloIA, TipoJogador.IA, new Random());
    }

    public JogadorInterface[] criarJogadores() {
        System.out.println("Escolha o tipo de jogo: ");
        System.out.println("1 - Jogador vs Jogador");
        System.out.println("2 - Jogador vs IA");
        System.out.println("3 - IA vs IA");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        JogadorInterface Jogador1, Jogador2;

        switch (opcao) {
            case 1:
                // Jogador vs Jogador
                Jogador1 = criarJogadorHumano("Jogador 1");
                Jogador2 = criarJogadorHumano("Jogador 2");
                break;

            case 2:
                // Jogador vs IA
                Jogador1 = criarJogadorHumano("Jogador 1");
                Jogador2 = criarJogadorIA();
                break;

            case 3:
                // IA vs IA
                Jogador1 = criarJogadorIA();
                Jogador2 = criarJogadorIA();
                break;

            default:
                throw new IllegalArgumentException("Opção inválida");
        }

        return new JogadorInterface[]{Jogador1, Jogador2};
    }
}
