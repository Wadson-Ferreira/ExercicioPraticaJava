package Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posicao = scanner.nextInt();
        scanner.close();
        posicao--;
        int prev = 0;
        int current = 1;

        for (int i = 0; i < posicao; i++) {
            int temp = prev + current;
            prev = current;
            current = temp;
        }

        System.out.println(current);

    }
}