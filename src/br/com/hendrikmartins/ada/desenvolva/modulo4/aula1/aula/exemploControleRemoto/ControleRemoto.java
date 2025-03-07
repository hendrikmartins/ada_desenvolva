package br.com.hendrikmartins.ada.desenvolva.modulo4.aula1.aula.exemploControleRemoto;

public interface ControleRemoto {

    void ligar();
    void desligar();
    String trocarCanal(String numeroCanal);
    String aumentarVolume();
    String abaixarVolume();
    String mute();

}
