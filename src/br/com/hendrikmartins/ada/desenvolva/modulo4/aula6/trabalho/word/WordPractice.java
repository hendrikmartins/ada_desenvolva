package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.trabalho.word;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordPractice {

    private static final String[] WORDS = {"Arroz", "Feijão", "Ovo", "Frito", "Radar", "Osso"};

    public List<String> wordsLessThan5Characters() {
        //Filtre apenas palavras que possuem menos de 5 caracteres
        return Arrays.stream(WORDS)
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList());

    }

    public List<String> words5Characters() {
        // Filtre apenas palavras que possuem 5 caracteres
        return Arrays.stream(WORDS)
                .filter(w -> w.length() == 5)
                .collect(Collectors.toList());
    }

    public List<String> wordsGreaterThan5Characters() {
        // Filtre apenas palavras que possuem mais de 5 caracteres
        return Arrays.stream(WORDS)
                .filter(w -> w.length() > 5)
                .collect(Collectors.toList());
    }

    public List<String> wordsArePalindromes() {
        // Identifique e retorne as palavras que sejam palíndromos(são iguais de trás para frente, exemplo: Radar)
        return Arrays.stream(WORDS)
                .filter(w -> new StringBuilder(w).reverse().toString().equalsIgnoreCase(w))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> countLetterEachWord() {
        //EXTRA
        //Calcule quantos caracteres cada palavra têm, o retorno deve ser a palavra -> quantidade de carateres. Exemplo: Osso -> 4
        return Arrays.stream(WORDS)
                .collect(Collectors.toMap(w -> w, String::length));
    }


    public Integer countLettersAllWordHave() {
        // EXTRA
        // Calcule quantos caracteres tem todas as palavras têm juntas.
        return Arrays.stream(WORDS)
                .mapToInt(String::length)
                .reduce(0, Integer::sum);
    }

}
