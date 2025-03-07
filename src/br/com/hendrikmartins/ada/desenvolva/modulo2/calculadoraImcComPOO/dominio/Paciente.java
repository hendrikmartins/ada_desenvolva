package br.com.hendrikmartins.ada.desenvolva.modulo2.calculadoraImcComPOO.dominio;


public class Paciente {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Paciente(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "---------------------" + '\n' +
                "----Paciente----" + '\n' +
                "nome: " + nome + '\n' +
                "idade: " + idade + '\n' +
                "altura: " + altura + '\n' +
                "peso: " + peso;
    }
}