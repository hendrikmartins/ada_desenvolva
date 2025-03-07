package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.exercicio.meu.ex2;

public class Administrador implements Autenticavel{
    @Override
    public boolean autenticar(String dados) {
        if (dados.equalsIgnoreCase("123.456.789-00")) {
            return true;
        } else {
            return false;
        }
    }
}
