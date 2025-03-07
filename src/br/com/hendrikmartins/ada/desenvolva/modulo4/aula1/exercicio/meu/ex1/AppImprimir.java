package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.exercicio.meu.ex1;

public class AppImprimir {
    public static void main(String[] args) {
        Imprimivel documento = new Documento();
        Imprimivel relatorio = new Relatorio();

        impressora(documento);
        impressora(relatorio);


    }

    public static void impressora(Imprimivel documento){
        System.out.println("-------------------------------");
        System.out.println("Iniciando Impressora....");
        documento.imprimir();
        System.out.println("Finalizando Impressora....");
        System.out.println("-------------------------------");
    }
}
