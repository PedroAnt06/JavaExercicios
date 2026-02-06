package Estoque2POO.application;

import Estoque2POO.entities.Produto;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.println("Digite o preco do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();


        Produto produto = new Produto(nome, preco, quantidade);
        // Nesse projeto estoque2, adicionei um contrutor para que meus atributos nao iniciassem nulos ou vazios

        System.out.println(produto.nome + "     " + produto.preco + "     " + produto.quantidade + "     " + produto.ValorTotalNoEstoque());

        System.out.println("Digite quantos produtos quer adicionar no estoque: ");
        produto.AdicionarProdutos(sc.nextInt());

        System.out.println(produto.nome + "     " + produto.preco + "     " + produto.quantidade + "     " + produto.ValorTotalNoEstoque());

        System.out.println("Digite quantos produtos quer remover no estoque: ");
        produto.RemoverProdutos(sc.nextInt());


        System.out.println(produto.nome + "     " + produto.preco + "     " + produto.quantidade + "     " + produto.ValorTotalNoEstoque());

        System.out.println(produto.toString());

        sc.close();

    }
}
