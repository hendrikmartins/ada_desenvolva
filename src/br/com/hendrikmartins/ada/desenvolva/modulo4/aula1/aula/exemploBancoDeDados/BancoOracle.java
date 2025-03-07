package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploBancoDeDados;

public class BancoOracle implements BancoDeDados{
    @Override
    public void salvar(Pessoa pessoa) {
        System.out.println("Solicitar usuario");
        System.out.println("Recuperar uma lib de conexão");
    }

    @Override
    public void alterar(Pessoa pessoa) {

    }

    @Override
    public void excluir(Pessoa pessoa) {

    }
}
