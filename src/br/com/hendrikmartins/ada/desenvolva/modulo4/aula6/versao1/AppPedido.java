package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.versao1;

public class AppPedido {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(40.0,new EntregaPadrao());
        Pedido pedido2 = new Pedido(40.0,new EntregaExpressa());
        Pedido pedido3 = new Pedido(40.0,new EntregaInternacional());
        Pedido pedido4 = new Pedido(40.0,new EntregaPrioritaria());

        System.out.println(pedido.custoTotal());
        System.out.println(pedido2.custoTotal());
        System.out.println(pedido3.custoTotal());
        System.out.println(pedido4.custoTotal());
    }
}
