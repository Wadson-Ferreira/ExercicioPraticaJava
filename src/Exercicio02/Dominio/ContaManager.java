package Exercicio02.Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class ContaManager {

    private final Scanner scanner;
    private final ArrayList<Conta> contas;

    private ContaManager(Scanner scanner, ArrayList<Conta> contas) {
        this.scanner = scanner;
        this.contas =contas;
    }

    public void AdicionarConta(){
        System.out.println("Digite o nome do Titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Qual o saldo deseja depositar para iniciar a " +
                "conta? ");
        double saldoInicial = scanner.nextInt();
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

    public void depositarSaldo(double valor){
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

    public void sacarSaldo(double valor){
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

    private Conta encontrarContaPorTitular(String nomeTitular){
        for(Conta conta : contas){
            if(conta.getTitular().equals(nomeTitular)){
                return conta;
            }
        }
        return null;
    }
}
