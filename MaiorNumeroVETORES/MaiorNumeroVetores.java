package MaiorNumeroVETORES;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumeroVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros quer digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorNumero = vetor[0];
        int posicao = 0;

        for (int i = 1; i < vetor.length; i++){
                if (vetor[i] > vetor[i-1]){
                    maiorNumero = vetor[i];
                    posicao = i;
                }

        }

        System.out.println("Maior Valor: "+maiorNumero);
        System.out.println("Posicao do maior numero: "+posicao);




        sc.close();
    }
}
