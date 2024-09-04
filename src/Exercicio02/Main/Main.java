package Exercicio02.Main;

import Exercicio02.Dominio.Conta;
import Exercicio02.Dominio.ContaManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        ContaManager contaManager = new ContaManager(scanner, contas);

        while(true){
            System.out.println("Escolha uma opção");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Acessar conta");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    contaManager.adicionarConta();
                    break;
                case 2:
                    contaManager.acessarConta();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
    }
}
