package br.com.hendrikmartins.ada.coding_tank.treino.palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String entrada = sc.nextLine();

        String entradaProcessada = entrada.replaceAll("[\\tW_]", "").toLowerCase();

        String entradaInvertida = new StringBuilder(entradaProcessada).reverse().toString();

        if (entradaProcessada.equals(entradaInvertida)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        sc.close();
    }
}
