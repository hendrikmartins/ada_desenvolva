package br.com.hendrikmartins.ada.desenvolva.modulo4.aula3.exercicio;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class AppHora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valorHora = 10.00;
        double valorMinuto = valorHora/60;


//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat;
//        String horaInicial = sc.nextLine();
//        simpleDateFormat("HH:mm");
        System.out.println("Digite a hora de entra: ");
        LocalTime entrada = LocalTime.parse(sc.nextLine());

        System.out.println("Digite hora de entrada no almoço: ");
        LocalTime almocoInicial = LocalTime.parse(sc.nextLine());

        System.out.println("Digite hora de volta do almoço: ");
        LocalTime almocoFinal = LocalTime.parse(sc.nextLine());

        System.out.println("Digite a hora de saída");
        LocalTime saida = LocalTime.parse(sc.nextLine());

        var horasTotal = Duration.between(entrada, saida);
        var horaAlmoco = Duration.between(almocoInicial, almocoFinal);



        var horasTrabalhadas = horasTotal.toMinutes() - horaAlmoco.toMinutes();
        double resultado = horasTrabalhadas * valorMinuto;



        System.out.println(horasTrabalhadas);
        System.out.println(resultado);
//        System.out.println("Já se passaram " + horasTrabalhadas.toHours() + ":"
//                + horasTotal.toMinutesPart() + " horas");
//        var horasTotal = Duration.between(entrada, saida);
//        resultado += horasTotal.toMinutes();

//        System.out.println("Já se passaram " + horasTrabalhadas.toHours() + ":"
//                + horasTrabalhadas.toMinutes() + " horas");






    }

}
