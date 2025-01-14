package br.com.hendrikmartins.ada.coding_tank.aula.calculadoraimc;

import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double peso;
        Double altura;

        do {
            System.out.println("Informe o peso em Kg");
            peso = sc.nextDouble();
        } while (peso < 0);

        do {
            System.out.println("Informe o peso em m");
            altura = sc.nextDouble();
        } while (altura < 0);
        sc.close();

        Double IMC = CalcIMC.IMC(peso, altura);
        System.out.println(IMC);
        String resultado = CalcIMC.Categoria(IMC);
        System.out.println(resultado);
    }

}
