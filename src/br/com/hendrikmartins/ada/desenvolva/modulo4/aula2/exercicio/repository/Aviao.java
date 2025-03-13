package br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository;

import br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository.comportamento.Velocidade;
import br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository.comportamento.Mover;
import br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository.comportamento.Voar;

public class Aviao implements Mover, Voar, Velocidade {


    @Override
    public void mover() {
        System.out.println("Aviação Acelerando");

    }

    @Override
    public void voar() {
        System.out.println("Aviação Acelerando");

    }

    @Override
    public void aumentar() {

    }

    @Override
    public void diminuir() {

    }
}
