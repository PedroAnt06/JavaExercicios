package PosicoesMATRIZ;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas:");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas]; //cria matriz

        for (int i = 0; i < matriz.length; i++){ //percorre todos os elementos linhas-coluna
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o elemento da posicao: "+i+","+j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um numero que pertence a matriz:");
        int x = sc.nextInt();



        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == x) {
                    System.out.println("Numero escolhido: " + x);
                    System.out.println("Posicao: " + i + "," + j);

                    if (i > 0) System.out.println("Topo: " + matriz[i - 1][j]);
                    if (j > 0) System.out.println("Esquerda: " + matriz[i][j - 1]);
                    if (i < matriz.length - 1) System.out.println("Baixo: " + matriz[i + 1][j]);
                    if (j < matriz[i].length - 1) System.out.println("Direita: " + matriz[i][j + 1]);
                }


            }
        }
        sc.close();
    }
}
