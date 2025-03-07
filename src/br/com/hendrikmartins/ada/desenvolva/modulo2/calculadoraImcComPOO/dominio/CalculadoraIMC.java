package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio;

public class CalculadoraIMC {
    private CalculoIMC calculoIMC;
    private InterpretadorIMC interpretadorIMC;

    public CalculadoraIMC(CalculoIMC calculoIMC, InterpretadorIMC interpretadorIMC) {
        this.calculoIMC = calculoIMC;
        this.interpretadorIMC = interpretadorIMC;
    }

    public String calcularEInterpretar(Paciente paciente) {
        double imc = calculoIMC.calcular(paciente.getPeso(), paciente.getAltura());
        return interpretadorIMC.interpretar(imc);
    }
}
