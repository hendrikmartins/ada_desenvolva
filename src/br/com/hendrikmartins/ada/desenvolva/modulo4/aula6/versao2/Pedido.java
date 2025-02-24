package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.versao2;

public class Pedido {
    private double valor;
    private TipoFrete tipoFrete;


    public Pedido(double valor, TipoFrete tipoFrete) {
        this.valor = valor;
        this.tipoFrete = tipoFrete;
    }

    @Override
    public String toString() {
        return "----------Pedido---------\n" +
                "Valor:" + valor + "\n" +
                "Tipo de Frete: " + tipoFrete + "\n" +
                "Custo Total: " + custoTotalPedido()+ "\n"
                + "-------------------------";
    }

    public double custoTotalPedido() {
        return valor + tipoFrete.valorFrete();


    }
}