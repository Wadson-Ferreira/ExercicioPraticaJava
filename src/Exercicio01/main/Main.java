package Exercicio01.main;

import Exercicio01.Dominio.Lampada;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Philips", 220.0, "LED", "A60","Branco"
                ,25.99, 1, false, 100 );

        lampada.ligarLampada();
        lampada.diminuirIntensidade();
        lampada.desligarLampada();
    }
}
