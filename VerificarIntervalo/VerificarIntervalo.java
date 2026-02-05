package VerificarIntervalo;

import java.util.Scanner;

public class VerificarIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos valores quer digitar: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Digite o numero: ");
            int num = sc.nextInt();

            if (num >= 10 && num <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in+" in");
        System.out.println(out+" out");

        sc.close();
    }
}
