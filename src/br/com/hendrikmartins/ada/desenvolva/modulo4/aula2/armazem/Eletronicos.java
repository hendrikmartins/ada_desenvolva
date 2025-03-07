package br.com.hendrikmartins.ada.desenvolva.modulo4.aula2.armazem;

public class Eletronicos {
    private String tipo;
    private String marca;

    public Eletronicos(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Eletronicos{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
