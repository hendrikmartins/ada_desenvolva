package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.teste;

import br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio.Paciente;

import java.util.Scanner;

public class CalculadoraIMCtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.print("Digite seu nome: ");
        paciente.setNome(sc.nextLine());

        do {
            System.out.print("Digite sua idade: ");
            paciente.setIdade(sc.nextInt());
            if (paciente.getIdade() <= 0) {
                System.out.println("Idade inválida!");
                System.out.println("---------------------");
            }
        } while (paciente.getIdade() <= 0);

        do {
            System.out.print("Digite seu peso (em kg): ");
            paciente.setPeso(sc.nextDouble());
            if (paciente.getPeso() <= 0) {
                System.out.println("Peso Inválido!");
                System.out.println("---------------------");
            }
        } while (paciente.getPeso() <= 0);

        System.out.print("Digite seu peso (em kg): ");
        paciente.setPeso(sc.nextDouble());

        System.out.print("Digite sua altura (em metros): ");
        paciente.setAltura(sc.nextDouble());



        System.out.println(paciente.toString());
    }
}
