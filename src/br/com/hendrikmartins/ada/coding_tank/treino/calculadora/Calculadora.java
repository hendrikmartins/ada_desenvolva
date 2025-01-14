package br.com.hendrikmartins.ada.coding_tank.treino.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operacao;
        Double resultado;

        do {
            System.out.println("Digite o número da operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            operacao = sc.nextInt();

            if (operacao == 0) {
                System.out.println("Saindo da calculadora.");
                break;
            }

            if (operacao < 1 || operacao > 4) {
                System.out.println("Opção Inválida!");
                continue;
            }

            Double[] numeros = new Double[2];
            for (int i = 0; i <= 1; i++) {
                System.out.println("Digite o " + (i + 1) + "º número");
                numeros[i] = sc.nextDouble();
            }

            Double n_1 = numeros[0];
            Double n_2 = numeros[1];

            switch (operacao) {
                case 1:
                    resultado = Calculadora.Soma(n_1, n_2);
                    System.out.println("A soma é: " + resultado);
                    System.out.println();
                    break;
                case 2:
                    resultado = Calculadora.Subtracao(n_1, n_2);
                    System.out.println("A subtração é: " + resultado);
                    System.out.println();
                    break;
                case 3:
                    resultado = Calculadora.Multiplicacao(n_1, n_2);
                    System.out.println("A multiplicação é: " + resultado);
                    System.out.println();
                    break;
                case 4:
                    if (n_2 == 0) {
                        System.out.println("Não é possível dividir por 0.");
                        System.out.println();
                    } else {
                        resultado = Calculadora.Divisao(n_1, n_2);
                        System.out.println("A divisão é: " + resultado);
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (true);

        sc.close();
    }

    public static Double Soma(Double a, Double b) {
        return a + b;
    }

    public static Double Subtracao(Double a, Double b) {
        return a - b;
    }

    public static Double Multiplicacao(Double a, Double b) {
        return a * b;
    }

    public static Double Divisao(Double a, Double b) {
        return a / b;
    }
}

