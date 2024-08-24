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
    int intesidadeDaLuz;

    public Lampada(String marca, double voltagem, String tipo, String modelo,
                    String cor, double preco, int garantia, boolean ligadoOuDesligado, int intesidadeDaLuz) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.garantia = garantia;
        this.ligadoOuDesligado = ligadoOuDesligado;
        this.intesidadeDaLuz = intesidadeDaLuz;
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

    public int getIntesidadeDaLuz() {
        return intesidadeDaLuz;
    }

    public void setIntesidadeDaLuz(int intesidadeDaLuz) {
        this.intesidadeDaLuz = intesidadeDaLuz;
    }

    public void ligarLampada (){
        if (this.ligadoOuDesligado){
            System.out.println("A lâmpada já está ligada.");
        }else{
            this.ligadoOuDesligado = true;
            System.out.println("Lâmpada ligada");
        }
    }

    public void desligarLampada (){
        if (!this.ligadoOuDesligado){
            System.out.println("A lâmpada já está apagada.");
        }else{
            this.ligadoOuDesligado = false;
            System.out.println("Lâmpada apagada");
        }
    }


}
