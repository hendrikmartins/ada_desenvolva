package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio;

public class CalcularIMC {
    static IMC calculadoraIMC(Paciente paciente){
        double imc = paciente.getPeso() /(paciente.getAltura()* paciente.getAltura());
        return new IMC(imc);
    }
}
