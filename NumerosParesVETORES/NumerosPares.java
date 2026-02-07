package NumerosParesVETORES;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i<vetor.length; i++){
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextInt();
        }

        int quantidadePares = 0;
        System.out.println("Numeros Pares:");
        for (int i = 0;i< vetor.length;i++){
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
                quantidadePares += 1;
            }
        }

        System.out.println("Quantidade de numeros pares: "+quantidadePares);




        sc.close();
    }
}
