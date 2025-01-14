package br.com.hendrikmartins.ada.coding_tank.aula.conversao;

import java.util.Scanner;

public class MainConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer operacao;
        Double valor;
        Double resultado = 0d;

        do {
            System.out.println("Escolha a operação: ");
            System.out.println("1 - km -> mi");
            System.out.println("2 - m -> cm");
            System.out.println("3 - kg -> g");
            System.out.println("4 - ºC -> F");
            operacao = sc.nextInt();
        } while (operacao < 1 || operacao > 4);

        System.out.println("Escolha o valor da conversão");
        valor = sc.nextDouble();
        sc.close();

        switch (operacao) {
            case 1:
                resultado = CalcConversao.KM_milhas(valor);
                System.out.println("km -> mi, " + resultado + "milhas");
                break;
            case 2:
                resultado = CalcConversao.M_cm(valor);
                System.out.println("m -> cm, " + resultado + "cm");
                break;
            case 3:
                resultado = CalcConversao.Kg_g(valor);
                System.out.println("kg -> g, " + resultado + "gramas");
                break;
            case 4:
                resultado = CalcConversao.C_F(valor);
                System.out.println("ºC -> Fº, " + resultado + "Fahrenheit");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}


