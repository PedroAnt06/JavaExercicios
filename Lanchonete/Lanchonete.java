package Lanchonete;

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Codigo do Item: ");
        int codigo = sc.nextInt();

        System.out.println("Digite a Quantidade do(s) Item(s): ");
        int qtd = sc.nextInt();

        double total = 0;
        if (codigo == 1){
            total = qtd * 4;
        } else if (codigo == 2){
            total = qtd * 4.50;
        } else if (codigo == 3) {
            total = qtd * 5;
        } else if (codigo == 4) {
            total = qtd * 2;
        } else if (codigo == 5) {
            total = qtd * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();



    }


}
