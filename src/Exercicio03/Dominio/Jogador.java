package Exercicio03.Dominio;

import java.util.Scanner;

public class Jogador {
    private String nome;
    private char simbolo;
    private TipoJogador tipo;

    public Jogador(String nome, char simbolo, TipoJogador tipo) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public TipoJogador getTipo() {
        return tipo;
    }

    public void setTipo(TipoJogador tipo) {
        this.tipo = tipo;
    }
}
