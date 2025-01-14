package br.com.hendrikmartins.ada.coding_tank.aula.calculadoraimc;

public class CalcIMC {
    public static double IMC(double peso, double altura) {
        return peso / (altura * altura);

    }

    public static String Categoria(double IMC) {
        if (IMC < 18.5) {
            return ("abaixo do peso");
        } else if (IMC < 24.9) {
            return ("peso normal");
        } else if (IMC < 29.9) {
            return ("sobrepeso");
        } else {
            return ("obesidade");

        }
    }
}

