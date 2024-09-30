package Exercicio05.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueManager {

    private Scanner scanner;
    private ArrayList<Produto> produtos;

    public EstoqueManager(Scanner scanner, ArrayList<Produto> produtos) {
        this.scanner = scanner;
        this.produtos = produtos;
    }

    public void adicionarProduto() {
        System.out.println("Qual produto deseja adicionar? ");
        String nome = scanner.nextLine();

        boolean produtoEcontrado = false;

        for(Produto produto:produtos){
            if(produto.getNome().equalsIgnoreCase(nome)){
                System.out.println("Produto já existente. Quantas unidades " +
                        "gostaria de adicionar?");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println("Quantidade atualizada com sucesso. O " +
                        "novo " + "estoque de " + produto.getNome() + " é de:" +
                        " " + produto.getQuantidade() + " unidades.");

                produtoEcontrado = true;
                break;
            }
        }

        if(!produtoEcontrado){
            System.out.println("Adicionando novo Produto. Insira a quantidade" +
                    " que deseja adicionar ao estoque: ");
            int quantidade = scanner.nextInt();

            System.out.println("Qual o preço unitário do produto?" );
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto novoProduto = new Produto(nome, quantidade, preco);
            produtos.add(novoProduto);

            System.out.println("Adicionado " + nome + " ao estoque com a " +
                    "quantidade de: " + quantidade + " unidades, com o preço " +
                    "unitário de: " + preco + "R$ com sucesso!");
        }
    }

    public void removerProduto(){
        if (produtos.isEmpty()){
            System.out.println("Atualmente o estoque está vazio.");
        }else {
            System.out.println("Qual produto deseja remover? ");
            String nome = scanner.nextLine();
            boolean produtoEcontrado = false;

            for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Produto encontrado. O produto possui "
                            + produto.getQuantidade() + "unidades em estoque. " +
                            "Quantas unidades deseja remover?");
                    int quantidade = scanner.nextInt();

                    scanner.nextLine();

                    if (quantidade == produto.getQuantidade()) {
                        System.out.println("Você está removendo todas as " +
                                "unidades do produto, deseja prosseguir e " +
                                "remover o produto do estoque? (S/N)");
                        String resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("S")) {
                            produtos.remove(produto);
                            System.out.println("Produto removido com sucesso!");
                        }
                        return;
                    } else if (quantidade > produto.getQuantidade()) {
                        System.out.println("ERRO! A quantidade solicitada é " +
                                "maior que o estoque atual.");
                    } else {
                        produto.setQuantidade(produto.getQuantidade() - quantidade);
                        System.out.println("Removido " + quantidade + " unidades " +
                                "do estoque. O produto " + nome + " agora possui: " +
                                produto.getQuantidade() + " unidades.");
                    }
                    produtoEcontrado = true;
                    break;
                }
            }
            if (!produtoEcontrado) {
                System.out.println("ERRO! Produto não encontrado no estoque.");
            }
        }
    }

    public void mostrarEstoque(){
        if (produtos.isEmpty()) {
            System.out.println("Atualmente o estoque está vazio.");
        }else {
            for (Produto produto : produtos) {
                System.out.println("| " + produto.getNome() + " | " + produto.getQuantidade()
                        + " | " + produto.getPreco() + "R$ |");
                System.out.println
                        ("-------------------------------------------------");
            }
            System.out.println("Atualmente esse é todo o estoque!");
        }
    }

    public void buscarProduto(){
        System.out.println("Qual produto está buscando? ");
        String nome = scanner.nextLine();

        boolean produtoEcontrado = false;

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("O produto " + produto.getNome() + " possui " + produto.getQuantidade()
                        + " unidades, cada uma custando: " + produto.getPreco() + "R$" );
                produtoEcontrado = true;
                break;
            }
        }

        if (!produtoEcontrado) {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public void calcularValorTotalEstoque(){
        if(produtos.isEmpty()){
            System.out.println("Estoque vazio, não há o que calcular ainda.");
        } else {
            double valorTotal = 0;
            for (Produto produto : produtos) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
            System.out.println("O valor total do estoque atualmente é dê: " + valorTotal);
        }

    }
}

