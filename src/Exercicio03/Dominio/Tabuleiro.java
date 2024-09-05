package Exercicio03.Dominio;

public class Tabuleiro {
    private char[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new char[3][3];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public void mostrarTabuleiro(){
        System.out.println(" 0 1 2");
        for (int i = 0; i < 3; i++){
            System.out.println(i + " ");
            for (int j = 0; j < 3; j++){
                System.out.println(tabuleiro[i][j]);
                if(j < 2) System.out.println(" | ");
            }
            System.out.println();
            if(i < 2) System.out.println(" ---|---|---");
        }
    }

    public boolean atualizarTabuleiro(int linha, int coluna, char simbo){
        if(linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' '){
            tabuleiro[linha][coluna] = simbo;
            return true;
    } else {
            System.out.println("Posição inválida. Tente novamente.");
            return false;
        }
    }
}
