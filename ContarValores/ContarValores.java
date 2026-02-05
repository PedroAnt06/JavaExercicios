package ContarValores;

import java.util.Scanner;

public class ContarValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros quer digitar? ");
        int qtd = sc.nextInt();

        int soma = 0;

        for (int i = 0; i != qtd; i++){
            System.out.println("Digite o numero? ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("Soma: "+soma);

        sc.close();
    }
}
