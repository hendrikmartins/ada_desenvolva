package br.com.hendrikmartins.ada.desenvolva.modulo3.aula7;

public class Gerente extends LidaPessoas {
    @Override
    public void trabalhar() {
        System.out.println("Gerenciando a equipe...");
    }

    @Override
    public void baterPonto() {
        System.out.println("Ponto registrado.");
    }

    @Override
    public void fazerPausa() {
        System.out.println("Pausa para reunião.");
    }

    @Override
    public void atenderCliente() {
        System.out.println("Negociando com clientes.");
    }

    @Override
    public void gerenciarProjeto() {
        System.out.println("Acompanhando cronograma do projeto.");
    }
}
