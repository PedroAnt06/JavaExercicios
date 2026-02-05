package CalcularLinhas;

import java.util.Scanner;

public class CalcularLinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int n = sc.nextInt();

        System.out.println("Linhas | Quadrado | Cubo");
        for (int i = 1; i <= n; i++){
            System.out.print(i + "|");
            System.out.print(i*i + "|");
            System.out.println(i*i*i + "|");

        }




        sc.close();
    }
}
