package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploAnimais;

public class ValidadorDeCPF {

    public static String PAIS_ORIGEM = "BRASIL";

    public static boolean validarNumeroCpf(String cpf){
        if(cpf.equalsIgnoreCase("11111111111")){
            return true;
        } else {
            return false;
        }
    }

}
