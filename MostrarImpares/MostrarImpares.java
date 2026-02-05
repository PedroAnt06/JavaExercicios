package MostrarImpares;

import java.util.Scanner;

public class MostrarImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite ate que numero quer printar os impares, inclusive o numero digitado (Se for o caso)");
        int x = sc.nextInt();

        for (int i = 0; i >= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
