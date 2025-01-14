package br.com.hendrikmartins.ada.coding_tank.treino.tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTabuada;

        System.out.println("Digite um número inteiro: ");
        nTabuada = sc.nextInt();

        System.out.println("Tabuada do " + nTabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(nTabuada + " x " + i + " = " + nTabuada * i);
        }
        sc.close();
    }
}
