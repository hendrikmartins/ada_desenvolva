package br.com.hendrikmartins.ada.desenvolva.modulo3.aula2.armazem;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Armazem<Roupa> armazemRoupa = new Armazem<>("Rua das Roupas", "Roberto");
        Armazem<Livros> armazemLivros = new Armazem<>("Rua dos Livros", "Leonardo");
        Armazem<Eletronicos> armazemEletronicos = new Armazem<>("Rua dos Eletrônicos", "Eduardo");

        Eletronicos eletronico1 = new Eletronicos("celular", "Samsung");
        Eletronicos eletronico2 = new Eletronicos("TV", "LG");

        armazemEletronicos.setProdutos(eletronico1);
        armazemEletronicos.setProdutos(eletronico2);

        List<Eletronicos> eletronicosList = armazemEletronicos.getProdutos();

        for (Eletronicos eletronicos : eletronicosList) {
            System.out.println(eletronicos);
        }


//        System.out.println("--------------------------------------");

//        Roupa roupa1 = new Roupa("azul",'M');
//        Roupa roupa2 = new Roupa("preta",'G');
//
//        armazemRoupa.adicionarProdutos(roupa1);
//        armazemRoupa.adicionarProdutos(roupa2);
//
//        List<Roupa> roupaList = armazemRoupa.retornarProdutos();
//
//        for (Roupa roupa : roupaList) {
//            System.out.println(roupa);

//        System.out.println("--------------------------------------");

//        Livros livro1 = new Livros("1984", "George Orwell", "Ficção Política");
//        Livros livro2 = new Livros("As Cavernas de Aço", "Isaac Asimov", "Ficção Científica");
//
//        armazemLivros.adicionarProdutos(livro1);
//        armazemLivros.adicionarProdutos(livro2);
//
//        List<Livros> livrosList = armazemLivros.retornarProdutos();
//
//        for (Livros livros : livrosList) {
//            System.out.println(livros);
//        }
//

    }


}

