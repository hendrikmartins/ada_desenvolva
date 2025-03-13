package br.com.hendrikmartins.ada.desenvolva.modulo3.aula2;


import br.com.hendrikmartins.ada.desenvolva.modulo3.aula1.exercicio.professor.Pdf;

public class TesteGenerics {

    public static void main(String[] args) {
        Caixa caixaDeString = new Caixa<>();
        caixaDeString.setConteudo("Uma String");
        caixaDeString.setConteudo(123);

        Caixa<Pdf> caixaComArquivosPdf = new Caixa<>();
        caixaComArquivosPdf.setConteudo(new Pdf());

        CarrinhoControle<Gasolina> carrinho = new CarrinhoControle<>();

        CarrinhoControle<Pilha> carrinhoDePilha = new CarrinhoControle<>();
    }
}
