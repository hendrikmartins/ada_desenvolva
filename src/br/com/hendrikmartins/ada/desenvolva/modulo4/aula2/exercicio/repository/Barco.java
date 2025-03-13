package br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository;

import br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository.comportamento.Velocidade;
import br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository.comportamento.Flutuar;
import br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.exercicio.repository.comportamento.Mover;

public class Barco implements Mover, Flutuar, Velocidade {

    @Override
    public void flutuar() {
        System.out.println("barco flutuando");
    }

    @Override
    public void mover() {
        System.out.println("barco movendo");

    }

    @Override
    public void aumentar() {
        System.out.println("barco acelerando");

    }

    @Override
    public void diminuir() {
        System.out.println("barco reduzindo velocidade");

    }
}
