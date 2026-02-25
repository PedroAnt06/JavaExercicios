package ProdutosHERANCA.application;

import ProdutosHERANCA.entities.Produto;
import ProdutosHERANCA.entities.ProdutoImportado;
import ProdutosHERANCA.entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Dados Produto #"+i);
            System.out.println("Comum, Usando ou Importado (c/u/i)");
            char ch = sc.next().charAt(0);

            while (ch != 'c' && ch != 'u' && ch != 'i'){
                System.out.println("Digite um caracter valido (c/u/i)");
            }


            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Preco");
            double preco = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Taxa Alfandega: ");
                double txalf = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome,preco,txalf));

            } else if (ch == 'u') {
                System.out.println("Data de Fabricacao (dd/MM/yyyy): ");
                sc.nextLine();
                String dataStr = sc.nextLine();
                LocalDate data = LocalDate.parse(dataStr, formatter);
                produtos.add(new ProdutoUsado(nome, preco, data));

            } else {
                produtos.add(new Produto(nome, preco));

            }
        }

        System.out.println("Etiquetas de Preco: ");
        for (Produto p : produtos){
            System.out.println(p.etiquetaPreco());
        }





        sc.close();




    }
}
