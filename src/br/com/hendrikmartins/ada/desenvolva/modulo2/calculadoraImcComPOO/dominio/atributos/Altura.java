package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio.atributos;

public class Altura implements Verificador<Double> {
    private Double altura;

    public Altura(Double valor) {
        if (verificar(valor)) {
            this.altura = valor;
        } else {
            throw new IllegalArgumentException("Altura inválida. Deve ser maior que 0.");
        }
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public boolean verificar(Double altura) {
        return altura > 0;
    }
}
