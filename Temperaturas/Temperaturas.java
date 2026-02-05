package Temperaturas;

import java.util.Locale;
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite a Temperatura em Celcius: ");
            double tempc = sc.nextDouble();
            double tempf = ((tempc * 9) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempf);
            System.out.println("Deseja repetir? (s/n) ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');



        sc.close();
    }
}
