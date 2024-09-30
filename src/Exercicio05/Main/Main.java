package Exercicio05.Main;

import Exercicio05.Dominio.EstoqueManager;
import Exercicio05.Dominio.Produto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        EstoqueManager estoqueManager = new EstoqueManager(scanner, produtos);

        while(true) {
            try {
                System.out.println("Escolha uma opção");
                System.out.println("1 - Adicionar produto.");
                System.out.println("2 - Remover produto.");
                System.out.println("3 - Listar produtos.");
                System.out.println("4 - Buscar produto.");
                System.out.println("5 - Calcular estoque.");
                System.out.println("6 - Sair.");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao){
                    case 1: estoqueManager.adicionarProduto();
                        break;
                    case 2: estoqueManager.removerProduto();
                        break;
                    case 3: estoqueManager.mostrarEstoque();
                        break;
                    case 4: estoqueManager.buscarProduto();
                        break;
                    case 5: estoqueManager.calcularValorTotalEstoque();
                        break;
                    case 6: encerrarSistema(scanner);
                        return;
                    default:
                        lidarComOpcaoInvalida();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine();
            }
        }
    }

    private static void encerrarSistema(Scanner scanner) {
        System.out.println("Encerrando sistema...");
        scanner.close();
    }

    private static void lidarComOpcaoInvalida() {
        System.out.println("Opção Inválida, escolha novamente.");
    }

}
