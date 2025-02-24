package br.com.hendrikmartins.ada.desenvolva.modulo1.exercícios.matrizTransposta;

import java.util.Scanner;

public class QuadradoMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz quadrada:");
        int tam = sc.nextInt();

        int[][] matriz = new int[tam][tam];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int somaMagica = 0;
        for (int j = 0; j < tam ; j++) {
            somaMagica += matriz[0][j];
        }

        boolean eQuadradoMagico = true;
        for (int i = 0; i < tam; i++) {
            int somaLinha = 0, somaColuna = 0;
            for (int j = 0; j < tam; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha != somaMagica || somaColuna != somaMagica) {
                eQuadradoMagico = false;
                break;
            }
        }
        int diagonalPrincipal = 0, diagonalSecundaria = 0;
        for (int i = 0; i < tam; i++) {
            diagonalPrincipal += matriz[i][i];
            diagonalSecundaria += matriz[i][tam - i - 1];
        }
        if (diagonalPrincipal != somaMagica || diagonalSecundaria != somaMagica) {
            eQuadradoMagico = false;
        }


        if (eQuadradoMagico) {
            System.out.println("A matriz é um quadrado mágico.");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
    }
}
