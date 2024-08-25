package Exercicio01.Dominio;

public class Lampada {
    String marca;
    double voltagem;
    String tipo;
    String modelo;
    String cor;
    double preco;
    int garantia;
    boolean ligadoOuDesligado = true;
    int intensidade;

    public Lampada(String marca, double voltagem, String tipo, String modelo,
                    String cor, double preco, int garantia, boolean ligadoOuDesligado, int intensidade) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.garantia = garantia;
        this.ligadoOuDesligado = ligadoOuDesligado;
        this.intensidade = intensidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isLigadoOuDesligado() {
        return ligadoOuDesligado;
    }

    public void setLigadoOuDesligado(boolean ligadoOuDesligado) {
        this.ligadoOuDesligado = ligadoOuDesligado;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public void ligarLampada (){
        if (this.ligadoOuDesligado){
            System.out.println("A lâmpada já está ligada.");
        }else{
            this.ligadoOuDesligado = true;
            this.intensidade = 100;
            System.out.println("Lâmpada ligada. Intensidade: " + this.intensidade + "%.");
        }
    }

    public void desligarLampada (){
        if (!this.ligadoOuDesligado){
            System.out.println("A lâmpada já está apagada.");
        }else{
            this.ligadoOuDesligado = false;
            this.intensidade = 0;
            System.out.println("Lâmpada apagada.");
        }

    }

    public void aumentarIntensidade(){
        if(!this.ligadoOuDesligado){
            System.out.println("A lâmpada está desligada.");
        }else{
            if (this.intensidade < 100){
                this.intensidade += 5;
                if (this.intensidade >= 100){
                    this.intensidade = 100;
                }
                System.out.println("Intensidade da lâmpada aumentada " +
                        "para: " + this.intensidade + "%.");
            }else{
                System.out.println("A intensidade já está no máximo.");
            }
        }
    }

    public void diminuirIntensidade(){
        if(!this.ligadoOuDesligado){
            System.out.println("A lâmpada está desligada.");
        }else{
            if (this.intensidade > 5){
                this.intensidade -= 5;
                System.out.println("Intensidade da lâmpada reduzida " +
                        "para: " + this.intensidade + "%.");
            }else{
                System.out.println("A intensidade já está no mínimo.");
            }
        }
    }


}
