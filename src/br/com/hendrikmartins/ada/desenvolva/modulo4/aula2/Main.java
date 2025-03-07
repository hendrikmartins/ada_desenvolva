package br.com.hendrikmartins.ada.desenvolva.modulo4.aula2;

import br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.exercicio.professor.Pdf;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listaDeObjetos = new ArrayList<>();
        List<Pdf> listaDeObjetosPdf = new ArrayList<>();

        Pdf pdf = new Pdf();
        String nome1 = "Pedro";
        String nome2 = "REnato";

        listaDeObjetos.add(nome1);
        listaDeObjetos.add(nome2);

        for(int i =0; i < listaDeObjetos.size() ; i++ ){

            String retornoDaLista = listaDeObjetos.get(i);
            System.out.println(retornoDaLista);
        }

    }
}
