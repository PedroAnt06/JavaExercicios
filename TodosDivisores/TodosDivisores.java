package TodosDivisores;

import java.util.Scanner;

public class TodosDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                int divisores = i;
                System.out.println(divisores);
            }
        }

        sc.close();
    }
}
