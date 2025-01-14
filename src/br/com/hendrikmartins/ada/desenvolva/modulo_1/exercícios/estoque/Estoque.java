package br.com.hendrikmartins.ada.desenvolva.modulo_1.exercícios.estoque;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

    }

    public static class teste2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite uma senha de 4 dígitos: ");
            String senhaCorreta = sc.nextLine();

            // Validação da entrada (agora aceita qualquer caractere, pois trataremos como string)
            if (senhaCorreta.length() != 4) {
                System.out.println("Senha inválida. Digite uma senha com 4 caracteres.");
                sc.close();
                return;
            }

            long tempoInicial = System.currentTimeMillis();
            int tentativas = 0;
            boolean senhaEncontrada = false;

            for (int d1 = 0; d1 <= 9; d1++) {
                for (int d2 = 0; d2 <= 9; d2++) {
                    for (int d3 = 0; d3 <= 9; d3++) {
                        for (int d4 = 0; d4 <= 9; d4++) {
                            String senhaTeste = String.valueOf(d1) + d2 + d3 + d4;
                            tentativas++;

                            if (senhaTeste.equals(senhaCorreta)) {
                                senhaEncontrada = true;
                                break; // Sai do loop mais interno
                            }
                        }
                        if (senhaEncontrada) break; // Sai do loop intermediário
                    }
                    if (senhaEncontrada) break; // Sai do loop externo
                }
                if (senhaEncontrada) break; // Sai do loop mais externo
            }

            long tempoFinal = System.currentTimeMillis();
            long tempoGasto = tempoFinal - tempoInicial;

            if (senhaEncontrada) {
                System.out.println("Senha encontrada: " + senhaCorreta);
                System.out.println("Número de tentativas: " + tentativas);
                System.out.println("Tempo gasto: " + tempoGasto + " milissegundos");
            } else {
                System.out.println("Senha não encontrada (isso não deveria acontecer com 4 dígitos numéricos).");
            }

            sc.close();
        }
    }
}
