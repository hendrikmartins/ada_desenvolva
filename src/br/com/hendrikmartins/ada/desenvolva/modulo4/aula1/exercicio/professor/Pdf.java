package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.exercicio.professor;

public class Pdf implements Imprimivel{
    @Override
    public void imprimir() {
        System.out.println("Imprimir através do PDF");
    }
}
