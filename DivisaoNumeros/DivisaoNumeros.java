package DivisaoNumeros;

import java.util.Locale;
import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas divisoes quer fazer?");
        int n = sc.nextInt();

        double resultado = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Digite o primeiro numero: ");
            double a = sc.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double b = sc.nextDouble();

            if (b == 0){
                System.out.println("Divisao Impossível");
            } else{
                resultado = a / b;
                System.out.printf("Resultado: %.1f%n", resultado);
            }


        }




        sc.close();
    }
}
