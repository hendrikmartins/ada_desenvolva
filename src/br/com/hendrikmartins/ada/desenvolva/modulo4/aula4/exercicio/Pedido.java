package br.com.hendrikmartins.ada.desenvolva.modulo4.aula4.exercicio;

public class Pedido {
    private int id;
    private double valor;


    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}