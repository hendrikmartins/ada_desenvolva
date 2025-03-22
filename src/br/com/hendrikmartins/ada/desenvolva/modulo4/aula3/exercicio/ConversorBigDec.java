package br.com.hendrikmartins.ada.desenvolva.modulo4.aula3.exercicio;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.IntFunction;

public class ConversorBigDec implements IntFunction<String> {
        @Override
        public String apply(int value) {
            return "O número é: " + value;
        }
}
