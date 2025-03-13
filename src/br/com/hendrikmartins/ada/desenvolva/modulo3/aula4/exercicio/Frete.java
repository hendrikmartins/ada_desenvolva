package br.com.hendrikmartins.ada.desenvolva.modulo3.aula4.exercicio;

public class Frete {
    public Frete() {
    }
//    public void calcularTaxaEntrega(Pedido pedido){
//        double frete = pedido.getValor()*0.1;
//        System.out.println(frete);
//    }

    public Double calcularTaxaEntrega(Pedido pedido) {
        return pedido.getValor() * 0.1;
    }
}
