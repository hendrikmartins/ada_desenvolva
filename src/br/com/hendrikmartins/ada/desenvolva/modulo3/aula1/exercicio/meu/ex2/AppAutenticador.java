package br.com.hendrikmartins.ada.desenvolva.modulo3.aula1.exercicio.meu.ex2;

public class AppAutenticador {
    public static void main(String[] args) {
        Autenticavel senha = new Cliente();
        Autenticavel cpf = new Administrador();

        imprimir( senha.autenticar("admin123"));
        imprimir( cpf.autenticar("123.456.789-00"));
        System.out.println("--------------------------");
        imprimir( senha.autenticar("errado"));
        imprimir( cpf.autenticar("errado"));
    }

    public static void imprimir(boolean verificar){
        if (verificar == true){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }


}

