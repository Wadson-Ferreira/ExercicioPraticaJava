package Exercicio03.Dominio;

public class Tabuleiro {
    private final char[][] tabuleiro;
    private int contagemJogadas = 0;

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

    public void mostrarTabuleiro() {
        System.out.println("    0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    System.out.print("|   ");
                } else {
                    System.out.print("| " + tabuleiro[i][j] + " ");
                }
            }
            System.out.println("|");
            if (i < 2) {
                System.out.println("   ______________");
            }
        }
    }

    public boolean atualizarTabuleiro(int linha, int coluna, char simbo){
        if(linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' '){
            tabuleiro[linha][coluna] = simbo;
            contagemJogadas++;
            return true;
    } else {
            System.out.println("Posição inválida. Tente novamente.");
            return false;
        }
    }

    public boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro [i][1] == simbolo && tabuleiro [i][2] == simbolo) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if(tabuleiro[0][j] == simbolo && tabuleiro[1][j] == simbolo && tabuleiro[2][j] == simbolo) {
                return true;
            }
        }

        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true;
        }

        return tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo;
    }

    public boolean verificarEmpate(){
        if(verificarVitoria('x') || verificarVitoria('o')) {
            return false;
        }else return contagemJogadas >= 9;
    }

}
