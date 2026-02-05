package ParOuImpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int x = sc.nextInt();

        sc.close();

        if (x % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }



    }
}
