package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploAnimais;

public class Cachorro extends Animal implements AdotavelInterface, Proibidos {

    @Override
    public void emitirSom(){
        System.out.println("Cachorro Latindo");
    }

    @Override
    public String getNome(){
        return "Qualquer outra coisa";
    }

    public void fazerXixiNoPoste(){
        System.out.println("Fazendo xixi no poste");
    }

    @Override
    public void proteger() {
        System.out.println("Latir");
    }

    @Override
    public void treinar() {

    }

    @Override
    public void atacarPessoas() {

    }
}
