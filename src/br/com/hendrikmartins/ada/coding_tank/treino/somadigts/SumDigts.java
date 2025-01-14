package br.com.hendrikmartins.ada.coding_tank.treino.somadigts;

import java.util.Scanner;

public class SumDigts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Digite um número inteiro positivo: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    break;
                } else {
                    System.out.println("Entrada inválida!");
                    sc.next();
                }
            }
        }
        int somaDigitos = inteiroArray(numero);
        System.out.println("A soma dos digitos é: " + somaDigitos);

        sc.close();
    }

    public static int inteiroArray (int num){
        String numeroStr = Integer.toString(num);
        int soma = 0;
        int[]digitos = new int[numeroStr.length()];
        for (int i = 0; i<numeroStr.length();i++){
            digitos[i]=Character.getNumericValue(numeroStr.charAt(i));
            soma += digitos[i];
        }
        return soma;
    }
}
