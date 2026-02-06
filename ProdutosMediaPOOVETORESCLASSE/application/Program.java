package ProdutosMediaPOOVETORESCLASSE.application;

import ProdutosMediaPOOVETORESCLASSE.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos que quer adicionar: ");
        int n = sc.nextInt();


        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();

            System.out.println("Digite o preco do produto: ");
            double preco = sc.nextDouble();


            vetor[i] = new Produto(nome, preco);
        }


        double soma = 0;

        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("Media: %.2f%n",media);


        sc.close();
    }
}
