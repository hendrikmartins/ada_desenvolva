package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.exercicio.professor;

public class Main {

    public static void main(String[] args) {
        Documento variavelDeInstanciaDeUmDocumento = new Documento();
        impressora(variavelDeInstanciaDeUmDocumento);

        Relatorio variavelDeInstanciaDeUmRelatorio = new Relatorio();
        impressora(variavelDeInstanciaDeUmRelatorio);

        Pdf variavelDeInstanciaDeUmPdf = new Pdf();
        impressora(variavelDeInstanciaDeUmPdf);

    }

    public static void impressora(Imprimivel contrato){
        System.out.println("Iniciar a Impressora");
        System.out.println("Iniciar Preprar cartucho");
        contrato.imprimir();
        System.out.println("Fim");
    }
}
