package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploBancoDeDados;

public class BancoPostgre implements BancoDeDados{
    @Override
    public void salvar(Pessoa pessoa) {
        System.out.println("Recuperar uma lib de conexão");
        System.out.println("Solicitar usuario");
    }

    @Override
    public void alterar(Pessoa pessoa) {

    }

    @Override
    public void excluir(Pessoa pessoa) {

    }
}
