package Estoque3POOEncapsulado.application;

import Estoque3POOEncapsulado.entities.Produto;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    //  Neste exercicio estoque 3 eu coloquei os atributos da classe produto como Private, para garantir que os dados
    //  fossem acessado/modificados pelos getters e os setters

        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.println("Digite o preco do produto: ");
        double preco = sc.nextDouble();

        Produto produto = new Produto(nome, preco);

        System.out.println("PRODUTO: "+produto.getNome()+", PRECO: "+produto.getPreco()+", QUANTIDADE: "+produto.getQuantidade());
        System.out.println("====================================================================");

        System.out.println("Digite quantos produtos quer adicionar no estoque: ");
        produto.AdicionarProdutos(sc.nextInt());
        System.out.println("PRODUTO: "+produto.getNome()+", PRECO: "+produto.getPreco()+", QUANTIDADE: "+produto.getQuantidade());
        System.out.println("====================================================================");

        System.out.println("Qual o novo nome do produto? ");
        String nomeNovo = sc.next();
        produto.setNome(nomeNovo);
        System.out.println("PRODUTO: "+produto.getNome()+", PRECO: "+produto.getPreco()+", QUANTIDADE: "+produto.getQuantidade());
        System.out.println("====================================================================");

        System.out.println("Qual o novo preco do produto? ");
        double precoNovo = sc.nextDouble();
        produto.setPreco(precoNovo);
        System.out.println("PRODUTO: "+produto.getNome()+", PRECO: "+produto.getPreco()+", QUANTIDADE: "+produto.getQuantidade());
        System.out.println("====================================================================");

        System.out.println("Digite quantos produtos quer remover no estoque: ");
        produto.RemoverProdutos(sc.nextInt());
        System.out.println("PRODUTO: "+produto.getNome()+", PRECO: "+produto.getPreco()+", QUANTIDADE: "+produto.getQuantidade());
        System.out.println("====================================================================");

        System.out.println(produto.toString());

        sc.close();

    }
}
