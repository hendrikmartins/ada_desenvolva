package br.com.hendrikmartins.ada.desenvolva.modulo_1.exercícios.estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();


        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. Adicionar produto");
            System.out.println("Menu:");
            System.out.println("2. Remover produto");
            System.out.println("3. Consultar quantidade em estoque");
            System.out.println("4. Calcular valor total em estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println();
            System.out.println("------------------------------");

            int opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = sc.next();
                    System.out.println("Digite a quantidade a ser adicionada: ");
                    int quantidade = sc.nextInt();
                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    Produto novoProduto = new Produto(nomeProduto, quantidade, preco);
                    estoque.add(novoProduto);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = sc.next();
                    for (int i = 0; i < estoque.size(); i++) {
                        if (estoque.get(i).nome.equals(nomeProduto)) {
                            System.out.println("Digite a quantidade a ser removida: ");
                            quantidade = sc.nextInt();
                            if (estoque.get(i).quantidade >= quantidade) {
                                estoque.get(i).quantidade -= quantidade;
                                System.out.println("Quantidade restante do produto " +
                                        nomeProduto + ": " + estoque.get(i).quantidade);
                            } else {
                                System.out.println("Quantidade a remover maior que a disponível.");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = sc.next();
                    for (Produto produto : estoque) {
                        if (produto.nome.equals(nomeProduto)) {
                            System.out.println("Quantidade em estoque: " + produto.quantidade);
                            break;
                        }
                    }
                    break;
                case 4:
                    double valorTotal = 0;
                    for (Produto produto : estoque) {
                        valorTotal += produto.quantidade * produto.preco;
                    }
                    System.out.println("Valor total em estoque: " + valorTotal);
                    break;
                case 5:
                    System.out.println("Encerrando programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida.");
                    break;

            }


        }
    }
}
