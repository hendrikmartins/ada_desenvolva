package br.com.hendrikmartins.ada.coding_tank.aula.arrayinversa;

import java.util.Arrays;
import java.util.Scanner;

public class InverteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer quantArray;

        System.out.println("Informe o tamanho da Array: ");
        quantArray = sc.nextInt();
        while (quantArray <= 0) {
            System.out.println("Valor inválido! Digite um número maior que 0.");
            quantArray = sc.nextInt();
        }

        Integer[] inversa = new Integer[quantArray];


        for (int i = 0; i < inversa.length; i++) {
            System.out.printf("Informe o %dº termo\n", (i+1));
            inversa[inversa.length-1-i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(inversa));

        sc.close();
    }

}
