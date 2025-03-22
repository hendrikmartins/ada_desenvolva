package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Pessoa> pessoas = pessoaList();
        int somaIdades = CalculadoraIdade.somarIdades(pessoas);
        System.out.println("Soma das idades: " + somaIdades);


        //Resolução Professor
        var somaIdade = pessoaList() . stream()
            .map(pessoa -> 2025 - pessoa. getDateBirth().getYear() )
            .reduce ((idade1, idade2) -> idade1 + idade2)
            .orElse (  0);
        System.out.println("A soma de todas as idades é: "+somaIdade);


        var pessoaMaisNova = pessoaList().stream()
                .max(Comparator.comparing(Pessoa:: getDateBirth))
                .orElse(null);
        System.out.println(pessoaMaisNova);

        var pessoaMaisVelha = pessoaList().stream()
                .min(Comparator.comparing(Pessoa:: getDateBirth))
                .orElse(null);
        System.out.println(pessoaMaisVelha);

        pessoas.stream()
                .forEach(pessoa -> {
                    int comprimentoNome = pessoa.getName().length();
                    System.out.println("Nome: " + pessoa.getName() + ", Comprimento: " + comprimentoNome);
                });

        System.out.println("------------MAP--------------------------------");
        pessoas.stream()
                .map(pessoa -> "Nome: " + pessoa.getName() + ", Comprimento: " + pessoa.getName().trim().length())
                .forEach(System.out::println);

        System.out.println("------------MAP2--------------------------------");
        pessoas.stream()
                .map(pessoa -> "Nome: " + pessoa.getName() + ", Comprimento: " + pessoa.getName().replaceAll("\\s+", "").length())
                .forEach(System.out::println);


    }

    public static List<Pessoa> pessoaList() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "Alice Johnson", "1234567890", LocalDate.of(1985, 11, 15)));
        pessoas.add(new Pessoa(2L, "Bob Smith", "9876543210", LocalDate.of(1990, 5, 20)));
        pessoas.add(new Pessoa(3L, "Bob Brown", "5555555555", LocalDate.of(1975, 9, 30)));
        pessoas.add(new Pessoa(4L, "David Lee", "4444444444", LocalDate.of(1995, 2, 10)));
        pessoas.add(new Pessoa(5L, "Emily Davis", "3333333333", LocalDate.of(1988, 7, 25)));
        pessoas.add(new Pessoa(6L, "Frank Wilson", "2222222222", LocalDate.of(1970, 12, 5)));
        pessoas.add(new Pessoa(7L, "Grace Miller", "1111111111", LocalDate.of(1992, 3, 18)));
        pessoas.add(new Pessoa(8L, "Henry Baker", "0000000000", LocalDate.of(1982, 8, 7)));
        pessoas.add(new Pessoa(9L, "Isabella Green", "9999999999", LocalDate.of(1997, 4, 12)));
        pessoas.add(new Pessoa(10L, "Jack Taylor", "8888888888", LocalDate.of(1978, 6, 23)));
        pessoas.add(new Pessoa(11L, "Alice Cooper", "156143541695", LocalDate.of(1978, 6, 23)));
        return pessoas;
    }
}