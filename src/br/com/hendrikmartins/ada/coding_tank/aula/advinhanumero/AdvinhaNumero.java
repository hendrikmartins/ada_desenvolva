package br.com.hendrikmartins.ada.coding_tank.aula.advinhanumero;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Integer valor = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        int chute;

        System.out.println("Escolha um número de 1 - 10");
        do {
//            System.out.println("Advinhe o número:");
            chute = sc.nextInt();
            if (chute < valor) {
                System.out.println("O número é maior");
            } else if (chute > valor) {
                System.out.println("O número é menor");
            } else {
                System.out.println("Parabéns");
            }
        } while (chute != valor);
    }
}
