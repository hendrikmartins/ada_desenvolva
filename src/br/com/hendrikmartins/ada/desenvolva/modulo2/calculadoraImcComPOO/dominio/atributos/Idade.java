package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio.atributos;

public class Idade implements Verificador<Integer> {
    private Integer idade;

    public Idade(Integer idade) {
        if (verificar(idade)) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade inválido. Deve ser maior que 0.");
        }
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean verificar(Integer idade) {
        return idade > 0;
    }
}
