package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio;

public class CalculoIMCImpl implements CalculoIMC{
    @Override
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
}
