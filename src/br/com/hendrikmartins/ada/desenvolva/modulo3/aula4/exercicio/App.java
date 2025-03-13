package br.com.hendrikmartins.ada.desenvolva.modulo3.aula4.exercicio;

public class App {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1020, 50.00);
        Bd bd = new Bd();
        Notificacao notificacao = new Notificacao();
        Frete frete = new Frete();
        Recibo recibo = new Recibo();
        double valorFrete = frete.calcularTaxaEntrega(pedido);
        double valorTotalFrete = valorFrete + pedido.getValor();


        bd.salvarNoBanco(pedido);
        System.out.println("------------------------------------");
        notificacao.enviarNotificacao(pedido);
        System.out.println("------------------------------------");

        System.out.println(valorFrete);
        System.out.println(valorTotalFrete);
        System.out.println("------------------------------------");



        recibo.gerarRecibo(pedido);
        System.out.println("------------------------------------");

    }


}
