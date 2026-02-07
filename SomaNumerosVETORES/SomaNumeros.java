package SomaNumerosVETORES;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vao ter em cada vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do Vetor A");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o numero: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do Vetor B");
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Digite o numero: ");
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Valores do Vetor C");
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }


        sc.close();
    }
}
