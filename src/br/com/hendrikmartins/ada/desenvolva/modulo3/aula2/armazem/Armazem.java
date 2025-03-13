package br.com.hendrikmartins.ada.desenvolva.modulo3.aula2.armazem;

import java.util.ArrayList;
import java.util.List;

public class Armazem <T>{
    private String endereco;
    private String gerente;
    private List<T> produtos;

    public Armazem(String endereco, String gerente) {
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
        this.gerente = gerente;

    }

    public Armazem() {
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public List<T> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(T produto) {
        this.produtos.add(produto);
    }
}
