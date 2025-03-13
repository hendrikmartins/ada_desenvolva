package br.com.hendrikmartins.ada.desenvolva.modulo3.aula6.versao2;

public class AppEntrega {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(10.00, TipoFrete.PADRAO);
        Pedido pedido2 = new Pedido(10.00, TipoFrete.EXPRESSA);
        Pedido pedido3 = new Pedido(10.00, TipoFrete.INTERNACIONAL);
        Pedido pedido4 = new Pedido(10.00, TipoFrete.PRIORITARIA);

        System.out.println(pedido1.toString());
        System.out.println(pedido1.toString());
        System.out.println(pedido2.toString());
        System.out.println(pedido3.toString());
        System.out.println(pedido4.toString());

    }
}
