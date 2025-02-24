package br.com.hendrikmartins.ada.desenvolva.modulo3;

class Relatorio implements Imprimivel{
    private String conteudo;

    public Relatorio(String conteudo){
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("---Relatório---");
        System.out.println(conteudo);
        System.out.println("----------------");
    }
}
