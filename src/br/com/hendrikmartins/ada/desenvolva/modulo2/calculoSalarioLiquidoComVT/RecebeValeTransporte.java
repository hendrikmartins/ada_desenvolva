package br.com.hendrikmartins.ada.desenvolva.modulo2.calculoSalarioLiquidoComVT;

public class RecebeValeTransporte {
    public static double recebeVT(boolean valeTransporte, Funcionario funcionario) {
        double descontoAdicional = 0;

        if (valeTransporte && funcionario.getSalarioBase() > 2500.00) {
            descontoAdicional = funcionario.getSalarioBase() * 0.06;
        }
        return descontoAdicional;
    }
}