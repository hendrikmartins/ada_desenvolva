package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.trabalho.number;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};

    public List<Integer> numbersLessThan5() {
        return Arrays.stream(NUMBERS)
                .filter(n -> n < 5)
                .collect(Collectors.toList());
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remova os números repetidos
        return Arrays.stream(NUMBERS)
                .collect(Collectors.toSet());
    }

    public Integer sumAllNumbers() {
        // Calcule a soma total dos números.
        return Arrays.stream(NUMBERS)
                .reduce(0, Integer::sum);
    }

    public Integer sumNumbersWithoutRepeats() {
        // Some todos os números, porém não utilize os repetidos
        return Arrays.stream(NUMBERS)
                .collect(Collectors.toSet())
                .stream()
                .reduce(0, Integer::sum);
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // EXTRA
        // Conte quantas vezes cada número aparece na lista. Exemplo de retorno: 4 -> 2, 1 -> 3
        return Arrays.stream(NUMBERS)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }

}
