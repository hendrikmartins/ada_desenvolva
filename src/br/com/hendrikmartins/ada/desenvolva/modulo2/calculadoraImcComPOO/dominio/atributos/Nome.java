package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio.atributos;

public class Nome implements Verificador<String> {
    private String nome;

    public Nome(String nome) {
        if (verificar(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido. Não pode ser vazio.");
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean verificar(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    @Override
    public String toString() {
        return nome;
    }
}
