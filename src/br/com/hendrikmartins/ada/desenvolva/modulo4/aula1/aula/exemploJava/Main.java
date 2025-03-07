package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploJava;



import br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploAnimais.Animal;
import br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploAnimais.Pessoa;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List listaDeObjetos = new ArrayList();
        List listaDeObjetosDois = new LinkedList();
        listaDeObjetosDois.add(new Pessoa());
        listaDeObjetosDois.add(new Animal());
    }
}
