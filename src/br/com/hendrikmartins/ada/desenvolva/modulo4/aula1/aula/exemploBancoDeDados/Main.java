package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploBancoDeDados;

public class Main {

    public static void main(String[] args) {
        Pessoa pedro = new Pessoa();
        BancoDeDados bancoDeDados = new BancoXPTO();
        bancoDeDados.salvar(pedro);
    }
}
