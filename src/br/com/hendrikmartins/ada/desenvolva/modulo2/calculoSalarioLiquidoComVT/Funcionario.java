package br.com.hendrikmartins.ada.desenvolva.modulo2.calculoSalarioLiquidoComVT;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salarioBase;
    private CalcularDesconto calcularDesconto;
    private RecebeValeTransporte recebeValeTransporte;


    public Funcionario(String nome, int idade, String cargo, double salarioBase, CalcularDesconto calcularDesconto,
                       RecebeValeTransporte recebeValeTransporte) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.calcularDesconto = calcularDesconto;
        this.recebeValeTransporte = recebeValeTransporte;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioLiquido(boolean recebeVT) {
        double desconto = CalcularDesconto.calcularDesconto(salarioBase);
        double descontoVT = RecebeValeTransporte.recebeVT(recebeVT, this);
        return salarioBase - (desconto + descontoVT);
    }
}

