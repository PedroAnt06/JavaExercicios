package Multiplos;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0){
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();


    }
}
