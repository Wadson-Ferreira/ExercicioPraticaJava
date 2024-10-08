package Exercicio02.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private static final int AGENCIA_FIXA = 5562;
    private static int contadorNumeroConta = 1;

    private String titular;
    private int agencia;
    private int numeroDaConta;
    private double saldo;
    private List<String> transacoes;
    private static int contadorDepositos = 0;
    private static int contadorSaques = 0;
    private static int contadorOperacoes = 0;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = AGENCIA_FIXA;
        this.numeroDaConta = agencia * 1000 + contadorNumeroConta++;
        this.transacoes = new ArrayList<>();
    }

    public static int getContadorDepositos() {
        return contadorDepositos;
    }

    public static int getContadorSaques() {
        return contadorSaques;
    }

    public static int getContadorOperacoes() {
        return contadorOperacoes;
    }

    public String getTitular() {
        return titular;
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarSaldo(double valor) {
        if (valor < 1.0) {
            System.out.println("O valor deve ser maior que 1.00");
        }else{
            saldo += valor;
            contadorDepositos++;
            contadorOperacoes++;
            registrarTransacao("Depósito de: " + valor);
            System.out.println("Depósito de: " + valor + " realizado com " +
                    "sucesso");
        }
    }

    public void sacarSaldo(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        }else{
            saldo -= valor;
            contadorSaques++;
            contadorOperacoes++;
            registrarTransacao("Saque de: " + valor);
            System.out.println("Saque de " + valor + " realizado com sucesso");
        }

    }

    private void registrarTransacao(String transacao){
        transacoes.add(transacao);
    }
}
