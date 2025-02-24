package br.com.hendrikmartins.ada.desenvolva.modulo4.aula4;

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
