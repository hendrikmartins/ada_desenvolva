package br.com.hendrikmartins.ada.desenvolva.modulo3;

class Documento implements Imprimivel {
    private String texto;

    public Documento(String texto){
        this.texto = texto;
    }

    @Override
    public void imprimir() {
        System.out.println("Conteúdo do documento: " + texto);
    }
}
