package ImprimirNumerosVETORES;

import java.util.Locale;
import java.util.Scanner;

public class ImprimirNumeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que quer digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Valores: ");
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

        double soma = 0;

        for (int i=0; i< vetor.length;i++){
            soma += vetor[i];
        }

        double media = soma / vetor.length;


        System.out.printf("Soma: %.2f%n",soma);
        System.out.printf("Media: %.2f%n",media);

        sc.close();
    }
}
