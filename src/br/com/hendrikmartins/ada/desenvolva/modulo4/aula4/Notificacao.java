package br.com.hendrikmartins.ada.desenvolva.modulo4.aula4;

public class Notificacao {

    public Notificacao() {
    }

    public void enviarNotificacao(Pedido pedido) {
        System.out.println("Enviando notificação do pedido " + pedido.getId());
    }
}
