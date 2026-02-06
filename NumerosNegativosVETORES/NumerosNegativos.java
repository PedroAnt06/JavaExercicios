package NumerosNegativosVETORES;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce quer digitar? ");
        int n = sc.nextInt();



        int[] num = new int[n];
        for (int i = 0; i < num.length; i++){
            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();

        }


        System.out.println("Numeros negativos: ");
        for (int i=0; i < num.length; i++){
            if (num[i] < 0){
                System.out.println(num[i]);;
            }

        }

        sc.close();
    }
}
