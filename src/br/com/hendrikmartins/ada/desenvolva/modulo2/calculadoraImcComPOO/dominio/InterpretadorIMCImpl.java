package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio;

public class InterpretadorIMCImpl implements InterpretadorIMC {
    @Override
    public String interpretar(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}