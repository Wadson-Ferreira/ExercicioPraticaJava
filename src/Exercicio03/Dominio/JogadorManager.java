package Exercicio03.Dominio;

import java.util.Scanner;

public class JogadorManager {

    private Scanner scanner;

    public JogadorManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public Jogador novoJogador(){
        System.out.println("Digite o seu Nick: ");
        String nome = scanner.nextLine();

        System.out.println("Qual Simbolo deseja Jogar? 'X' Ou 'O'?");
        char simbolo = scanner.next().toUpperCase().charAt(0);

        while (simbolo != 'X' && simbolo != 'O'){
            System.out.println("Símbolo inválido. Escolha 'X' ou 'O'.");
            simbolo = scanner.next().toUpperCase().charAt(0);
        }

        return new Jogador(nome, simbolo, TipoJogador.HUMANO);
    }
}
