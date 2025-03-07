package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio.atributos;

public class Peso implements Verificador<Double> {
    private Double peso;

    public Peso(Double valor) {
        if (verificar(valor)) {
            this.peso = valor;
        } else {
            throw new IllegalArgumentException("Peso inválido. Deve ser maior que 0.");
        }
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public boolean verificar(Double peso) {
        return peso > 0;
    }
}
