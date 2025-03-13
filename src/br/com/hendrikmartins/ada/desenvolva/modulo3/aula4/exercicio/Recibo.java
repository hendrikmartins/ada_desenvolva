package br.com.hendrikmartins.ada.desenvolva.modulo3.aula4.exercicio;

public class Recibo {
    public Recibo() {
    }

    public void gerarRecibo(Pedido pedido) {
        System.out.println("----- Gerando recibo do pedido -----");
        System.out.println("Pedido: " + pedido.getId());
        System.out.println("Valor: " + pedido.getValor());
        System.out.println("----------------------------------------------");
    }
}
