package br.com.hendrikmartins.ada.coding_tank.treino.contarVogaisECons;

import java.util.Scanner;

public class ContadorVogCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        int vogais = 0;
        int consoantes = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) { // Verifica se é uma letra
                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);
        sc.close();
    }
}
