package br.com.hendrikmartins.ada.desenvolva.modulo4.aula4.exercicio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Function;

public class ExFunction {
    public static void main(String[] args) {
        // Dado que possuo um BigDecimal implemente a conversão para string.
        // Deve ser utilizado a interface Function

//        Function<BigDecimal, String> bigDecimalConverter = (numero) -> numero.toString();
//        var bigDecimal :BigDecimal = BigDecimal.TEN;
//        var text :String = bigDecimalConverter.apply(bigDecimal);
//        System.out.println(text);

//        Dado que possuo uma string que representa a data no formato dd/MM/yy
//        escreva um conversor para o tipo LocalDate
//        Deve ser utilizado a interface Function

        String dataString = "25/10/23";


        Function<String, LocalDate> conversor = data -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            return LocalDate.parse(data, formatter);
        };

        LocalDate dataLocalDate = conversor.apply(dataString);

        System.out.println("Data convertida: " + dataLocalDate);

    }
}
