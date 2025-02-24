package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.versao1;

public class Pedido {
    private double valor;
    private TipoDeEntrega tipoDeEntrega;

    public Pedido(double valor, TipoDeEntrega tipoDeEntrega) {
        this.valor = valor;
        this.tipoDeEntrega = tipoDeEntrega;
    }

    public double custoTotal (){
        return this.valor + tipoDeEntrega.calcularFrete();
    }


}
