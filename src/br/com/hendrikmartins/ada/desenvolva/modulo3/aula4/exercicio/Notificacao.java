package br.com.hendrikmartins.ada.desenvolva.modulo3.aula4.exercicio;

public class Notificacao {

    public Notificacao() {
    }

    public void enviarNotificacao(Pedido pedido) {
        System.out.println("Enviando notificação do pedido " + pedido.getId());
    }
}
