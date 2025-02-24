package br.com.hendrikmartins.ada.desenvolva.modulo1.exercícios.forcaBruta;

import java.util.Scanner;

public class forca_bruta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        String senha = "";

        while (true){
            System.out.println("Informe uma senha com quatro digitos positivos: ");
            senha = entrada.nextLine ();
            if (senha.length () == 4 ) {
                break;
            }
            for (int i = 0; i < senha.length (); i++) {
                if ( senha.charAt ( i ) < '0' || senha.charAt ( i ) > '9' ) {
                    System.out.println ( "Senha invalida, digite novamente" );
                }
            }
        }

        int tentativas = 0;

        long inicio = System.currentTimeMillis ();

        String senhaLocalizada = "";

        for (int i = 0; i < senha.length(); i++) {
            for (int j = 0; j < 10; j++) {
                tentativas++;
                if (Character.forDigit(j, 10) == senha.charAt(i)) {
                    senhaLocalizada = senhaLocalizada + j;
                    break;
                }
            }
        }

        long fim = System.currentTimeMillis ();
        long tempoGasto = ( fim - inicio );

        System.out.println ( "Tentativas: " + tentativas );
        System.out.println ( "Tempo gasto: " + tempoGasto + " Ms " );
        System.out.println ( "Senha Localizada: " + senhaLocalizada );

        entrada.close ();
    }

}