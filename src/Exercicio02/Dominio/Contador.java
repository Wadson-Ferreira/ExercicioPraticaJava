package Exercicio02.Dominio;

public class Contador {

    public static void imprimirContadores(){
        System.out.println("Total de Saque realizados: " + Conta.getContadorSaques());
        System.out.println("Total de Depositos realizados: " + Conta.getContadorDepositos());
        System.out.println("Total de Operações realizadas: " + Conta.getContadorOperacoes());
    }
}
