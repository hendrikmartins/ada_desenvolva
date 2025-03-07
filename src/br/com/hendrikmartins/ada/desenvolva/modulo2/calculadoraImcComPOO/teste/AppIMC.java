package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.teste;

import br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio.*;

import java.util.Scanner;


public class AppIMC {
    public static void main(String[] args) {
        CalculoIMC calculoIMC = new CalculoIMCImpl();
        InterpretadorIMC interpretadorIMC = new InterpretadorIMCImpl();
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC(calculoIMC, interpretadorIMC);
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("Digite o nome: ");
        paciente.setNome(sc.nextLine());

        System.out.println("Digite a idade: ");
        paciente.setIdade(sc.nextInt());

        System.out.println("Digite o peso: ");
        paciente.setPeso(sc.nextDouble());

        System.out.println("Digite a altura: ");
        paciente.setAltura(sc.nextDouble());


        System.out.println(paciente.toString());
        String resultado = calculadoraIMC.calcularEInterpretar(paciente);
        System.out.println("IMC: " + resultado);
        System.out.println("---------------------");
        sc.close();
    }
}
