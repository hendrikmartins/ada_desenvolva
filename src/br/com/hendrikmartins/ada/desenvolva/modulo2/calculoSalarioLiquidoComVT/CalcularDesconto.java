package br.com.hendrikmartins.ada.desenvolva.modulo2.calculoSalarioLiquidoComVT;

public class CalcularDesconto {
    public static double calcularDesconto(double salarioBase) {
        double desconto = 0;
        if (salarioBase <= 2000.00) {
            desconto = salarioBase * 0.10; // 10%
        } else if (salarioBase <= 5000.00) {
            desconto = salarioBase * 0.15; // 15%
        } else {
            desconto = salarioBase * 0.20; // 20%
        }
        return desconto;
    }
}