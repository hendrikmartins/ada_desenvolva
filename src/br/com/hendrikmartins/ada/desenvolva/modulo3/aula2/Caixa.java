package br.com.hendrikmartins.ada.desenvolva.modulo3.aula2;

public class Caixa<T> {

    private T conteudo;
    private String nome;
    private String lugar;


    public T getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(T conteudoGenerico){
        this.conteudo = conteudoGenerico;
    }

}
