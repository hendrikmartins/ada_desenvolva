package br.com.hendrikmartins.ada.desenvolva.modulo3.aula4;

public class CalculadoraImposto {

    public void calcularImpostos(Funcionario funcionario) {
        double imposto = funcionario.getSalario() * 0.2;
        System.out.println("Imposto calculado para " + funcionario.getSalario() + ": " + imposto);
    }

}
