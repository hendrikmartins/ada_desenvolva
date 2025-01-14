package br.com.hendrikmartins.ada.coding_tank.aula.arrayparimpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;

        System.out.println("Informe quantos números serão inseridos: ");
        quantidadeNumeros = sc.nextInt();
        while (quantidadeNumeros <= 0) {
            System.out.println("Entrada Inválida. Digite um número maior que 0.");
            quantidadeNumeros = sc.nextInt();
        }

        Integer[] arrayNumeros = new Integer[quantidadeNumeros];
        Integer par = 0;
        Integer impar = 0;


        for (int i = 0; i<arrayNumeros.length;i++){
            System.out.println("Informe o "+(i+1)+ " número.");
            arrayNumeros[i] = sc.nextInt();
            if (arrayNumeros[i]%2 ==0){
                par++;
            }else {
                impar++;
            }
        }

        System.out.println(par + " números pares");
        System.out.println(impar + " números ímpares");
    }


}
