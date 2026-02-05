package LerCoordenadas;

import java.util.Scanner;

public class LerCoordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite X: ");
        int x = sc.nextInt();
        System.out.println("Digite Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Q1");

            } else if (x < 0 && y > 0) {
                System.out.println("Q2");

            } else if (x < 0 && y < 0) {
                System.out.println("Q3");

            } else if (x > 0 && y < 0) {
                System.out.println("Q4");

            }

            System.out.println("Digite X novamente: ");
            x = sc.nextInt();
            System.out.println("Digite Y novamente: ");
            y = sc.nextInt();

        }

        sc.close();
    }
}
