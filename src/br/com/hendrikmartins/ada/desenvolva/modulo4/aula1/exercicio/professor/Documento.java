package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.exercicio.professor;

public class Documento implements Imprimivel{
    @Override
    public void imprimir() {
        System.out.println("Imprimindo através da Classe Documento");
    }
}
