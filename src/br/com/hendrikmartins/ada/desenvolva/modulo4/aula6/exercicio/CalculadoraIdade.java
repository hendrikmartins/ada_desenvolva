package br.com.hendrikmartins.ada.desenvolva.modulo4.aula6.exercicio;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class CalculadoraIdade {

    public static int calcularIdade(Pessoa pessoa) {
    LocalDate dataNascimento = pessoa.getDateBirth();
    LocalDate dataAtual = LocalDate.now();
    return Period.between(dataNascimento, dataAtual).getYears();
}

    public static int somarIdades(List<Pessoa> pessoas) {
        return pessoas.stream()
                .mapToInt(CalculadoraIdade::calcularIdade)
                .reduce(0, Integer::sum);
    }
}
