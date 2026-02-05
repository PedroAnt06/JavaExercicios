package SomaProgressiva;

import java.util.Locale;
import java.util.Scanner;

public class SomaProgressiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero, para sair digite 0: ");
        double x = sc.nextDouble();
        double soma = x;

        while (x != 0){
            System.out.println("Digite o proximo numero: ");
            x = sc.nextDouble();
            soma += x;
            System.out.printf("Soma Atual: %.2f%n", soma);
        }

        System.out.printf("Soma Final: %.2f%n", soma);

        sc.close();
    }
}
