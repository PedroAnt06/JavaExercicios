package MediaTestes;

import java.util.Locale;
import java.util.Scanner;

public class MediaTestes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos testes deseja calcular a média: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            System.out.println("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double nota3 = sc.nextDouble();

            double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
            System.out.printf("%.1f%n",media);
        }




        sc.close();
    }
}
