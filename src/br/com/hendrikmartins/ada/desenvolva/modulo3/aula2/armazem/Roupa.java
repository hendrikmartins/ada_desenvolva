package br.com.hendrikmartins.ada.desenvolva.modulo3.aula2.armazem;

public class Roupa {
    private String cor;
    private char tamanho;

    public Roupa(String cor, char tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
