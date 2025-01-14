package br.com.hendrikmartins.ada.coding_tank.aula.arraynotas;

import java.util.Scanner;

public class ArrayNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeNotas;

        do {
        System.out.println("Digite a quantidade de alunos");
        quantidadeNotas = sc.nextInt();
        } while (quantidadeNotas<=0);

        Integer[] notas = new Integer[quantidadeNotas];
        Double somaNotas = 0d;


        for (int i = 0; i < notas.length; i++) {
            do {
            System.out.println("informe a nota do aluno " + (i + 1) + ":");
            notas[i] = sc.nextInt();
            if (notas[i] <0 || notas[i]> 10){
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
            }while (notas[i] <0 || notas[i]> 10);

            somaNotas += notas[i];
        }

        Double media = somaNotas / quantidadeNotas;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno" + i + " nota " + notas[i]);
        }

        System.out.println("A média dos alunos foi: " + media);


    }

}


