package br.com.hendrikmartins.ada.desenvolva.modulo_1.exercícios.forca;

import java.util.Random;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Palavras[] palavras = Palavras.values();
        Random random = new Random();
        int indiceAleatorio = random.nextInt(palavras.length);
        String palavraSecreta = palavras[indiceAleatorio].toString();
        Scanner sc = new Scanner(System.in);
        int tentativas = 6;
        String letrasChutadas = "";

        StringBuilder palavraMascarada = new StringBuilder();
        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraMascarada.append("_");
        }

        Boneco boneco = new Boneco();

        System.out.println("---------------------------------");
        System.out.println("BEM-VINDO AO JOGO DA FORCA!");
        System.out.println("---------------------------------");
        System.out.println();

        while (tentativas > 0) {

            boneco.imprimirBoneco(tentativas);

            System.out.println("Adivinhe a palavra: " + palavraMascarada);
            System.out.println("Digite uma letra: ");
            char letra = sc.next().toUpperCase().charAt(0);

            if (letrasChutadas.contains(String.valueOf(letra))) {
                System.out.println("Você já tentou essa letra!");
                continue;
            }
            letrasChutadas += letra;

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraMascarada.setCharAt(i, letra);
                    acertou = true;
                }

            }
            if (acertou) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Errou!");
                tentativas--;
            }
            System.out.println("Tentativas restantes: " + tentativas);

            if (!palavraMascarada.toString().contains("_")) {
                System.out.println("---------------------------");
                System.out.println("Parabéns! Você venceu!");
                System.out.println("---------------------------");
                System.out.println();
                break;
            }
        }
        if (tentativas == 0) {
            boneco.imprimirBoneco(tentativas);
            System.out.println("---------------------------");
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
            System.out.println("---------------------------");
            System.out.println();

        }


    }
}

