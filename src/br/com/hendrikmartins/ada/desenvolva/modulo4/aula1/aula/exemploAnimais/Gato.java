package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploAnimais;

public class Gato extends Animal implements AdotavelInterface{

    @Override
    public void emitirSom(){
        System.out.println("Gato Miando");
    }

    @Override
    public void proteger() {
        System.out.println("Unhar");
    }

    @Override
    public void treinar() {

    }
}
