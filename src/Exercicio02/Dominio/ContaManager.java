package Exercicio02.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class ContaManager {

    private final Scanner scanner;
    private final ArrayList<Conta> contas;

     public ContaManager(Scanner scanner, ArrayList<Conta> contas) {
        this.scanner = scanner;
        this.contas =contas;
     }

    public void adicionarConta(){
        System.out.println("Digite o nome do Titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Qual o saldo deseja depositar para iniciar a " +
                "conta? ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();

        if (saldoInicial > 0){
            Conta conta = new Conta(nomeTitular, saldoInicial);
            contas.add(conta);
            System.out.println("Conta criada com sucesso!");
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Número da conta: " +conta.getNumeroDaConta());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Saldo inicial: " + saldoInicial + " R$");
        }else{
            System.out.println("O saldo inicial deve ser maior que 0.");
        }
    }

    public void depositarSaldo(){
        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        Conta conta = encontrarContaPorTitular(nomeTitular);
        if(conta != null){
            System.out.println("Qual valor deseja depositar: ");
            double valorDepositado = scanner.nextDouble();
            scanner.nextLine();

            conta.depositarSaldo(valorDepositado);
            System.out.println("Seu saldo atual é de: " + conta.getSaldo() +
                    " R$");
        }else{
            System.out.println("Titular da conta não encontrado, tente " +
                    "novamente.");
        }
    }

    public void sacarSaldo(){
        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        Conta conta = encontrarContaPorTitular(nomeTitular);
        if(conta != null){
            System.out.println("Qual valor deseja sacar? ");
            double valorSacado = scanner.nextDouble();
            scanner.nextLine();

            conta.sacarSaldo(valorSacado);
            System.out.println("Seu saldo atual é de: " + conta.getSaldo() +
                    " R$");
        }else{
            System.out.println("Titular da conta não encontrador, tente " +
                    "novamente.");
        }
    }

    public void exibirExtrato(String nomeTitular){
        Conta conta = encontrarContaPorTitular(nomeTitular);
        if (conta != null){
            System.out.println("Extrato da conta: " + conta.getNumeroDaConta() + " Agência: "
                    + conta.getAgencia() +":");
            for (String transacao : conta.getTransacoes()) {
                System.out.println(transacao);
            }
            Contador.imprimirContadores();
        }
    }

    public void acessarConta(){
       System.out.println("Digite o nome do titular da conta: ");
       String nomeTitular = scanner.nextLine();

       Conta conta = encontrarContaPorTitular(nomeTitular);
       if(conta != null){
            while (true){
                System.out.println("Escolha uma opção");
                System.out.println("1 - Depositar.");
                System.out.println("2 - Sacar.");
                System.out.println("3 - Extrato Bancário.");
                System.out.println("4 - Voltar ao menu anterior.");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao){
                    case 1:
                        depositarSaldo();
                        break;
                    case 2:
                        sacarSaldo();
                        break;
                    case 3:
                        exibirExtrato(nomeTitular);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
       }else{
           System.out.println("Conta não encontrada.");
       }

   }

    private Conta encontrarContaPorTitular(String nomeTitular){
        for(Conta conta : contas){
            if(conta.getTitular().equals(nomeTitular)){
                return conta;
            }
        }
        return null;
    }
}
