package Exercicio01.main;



import Exercicio01.Dominio.Lampada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Philips", 220.0, "LED", "A60 10W",
                "Branca", 29.90, 24, false, 0);

        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Verificar informações da lâmpada");
                System.out.println("2 - Ligar lâmpada.");
                System.out.println("3 - Aumentar intensidade da lâmpada");
                System.out.println("4 - Diminuir intensidade da lâmpada");
                System.out.println("5 - Desligar lâmpada.");
                System.out.println("6 - Timer para desligar a lâmpada");
                System.out.println("7 - Sair");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer de nova linha

                switch (opcao) {
                    case 1: lampada.imprimirInfoLampada();
                        break;
                    case 2: lampada.ligarLampada();
                        break;
                    case 3: lampada.aumentarIntensidade();
                        break;
                    case 4: lampada.diminuirIntensidade();
                        break;
                    case 5: lampada.desligarLampada();
                        break;
                    case 6:
                        System.out.println("Digite o tempo para o temporizador:");
                        int tempo = scanner.nextInt();

                        System.out.println("Digite a unidade de tempo (segundos ou minutos):");
                        String unidade = scanner.next();

                        lampada.temporizadorDesligarLampada(tempo, unidade);
                        break;
                    case 7: encerrarSistema(scanner);
                        return;
                    default: lidarComOpcaoInvalida();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
            }
        }
    }

    private static void lidarComOpcaoInvalida() {
        System.out.println("Opção Inválida, escolha novamente.");
    }

    private static void encerrarSistema(Scanner scanner) {
        System.out.println("Encerrando sistema...");
        scanner.close();
    }


}

