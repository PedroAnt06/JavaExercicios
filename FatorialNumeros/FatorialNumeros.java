package FatorialNumeros;

import java.util.Scanner;

public class FatorialNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero que deseja o fatorial: ");

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++){
            fatorial *= i;

        }

        System.out.println(fatorial);

        sc.close();
    }
}
