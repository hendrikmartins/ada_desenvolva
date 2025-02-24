package br.com.hendrikmartins.ada.desenvolva.modulo4.aula4;

public class Bd {
    public Bd() {
    }

    public void salvarNoBanco(Pedido pedido) {
        System.out.println("----- Salvando pedido no banco de dados -----");
        System.out.println("Pedido: " + pedido.getId());
        System.out.println("Valor: " + pedido.getValor());
        System.out.println("----------------------------------------------");
    }

}
