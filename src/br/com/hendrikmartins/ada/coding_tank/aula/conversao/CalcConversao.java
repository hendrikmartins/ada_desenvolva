package br.com.hendrikmartins.ada.coding_tank.aula.conversao;

public class CalcConversao {
    public static Double KM_milhas(Double km) {
        return km * 0.621371;
    }

    public static Double M_cm(Double m) {
        return m * 100;
    }

    public static Double Kg_g(Double kg) {
        return kg * 1000;
    }

    public static Double C_F(Double c) {
        return (c * 9 / 5) + 32;
    }

}
