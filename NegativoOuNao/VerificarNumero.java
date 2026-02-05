package NegativoOuNao;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int x = sc.nextInt();

        sc.close();

        if (x > 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NAO POSITIVO");
        }


    }
}
