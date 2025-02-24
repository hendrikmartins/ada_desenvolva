package br.com.hendrikmartins.ada.desenvolva.modulo1.exercícios.matrizTransposta;


public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i !=j) {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Elementos da diagonal principal:");


//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] ints : matriz) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
