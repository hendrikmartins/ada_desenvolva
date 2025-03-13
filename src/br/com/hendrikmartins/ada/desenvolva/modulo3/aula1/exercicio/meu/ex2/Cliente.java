package br.com.hendrikmartins.ada.desenvolva.modulo3.aula1.exercicio.meu.ex2;

public class Cliente implements Autenticavel {

    @Override
    public boolean autenticar(String dados) {
        if (dados.equalsIgnoreCase("admin123")) {
            return true;
        } else {
            return false;
        }
    }
}
