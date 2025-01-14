package br.com.hendrikmartins.ada.coding_tank.treino.fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numero;
        int fatorial;
        String input;

        while (true) {
            System.out.println("Digite um número inteiro não negativo (ou 'exit' para sair):");
            input = sc.next().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            try {
                numero = Integer.parseInt(input);

                if (numero < 0) {
                    System.out.println("Número inválido, tente novamente.");
                    continue;
                }

                fatorial = 1;
                if (numero == 0) {
                    System.out.println(numero + "! = 1");
                } else {
                    for (int i = numero; i >= 1; i--) {
                        fatorial *= i;
                    }
                    System.out.println(numero + "! = " + fatorial);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro ou 'exit' para sair.");
            }
        }

        sc.close();
    }
}