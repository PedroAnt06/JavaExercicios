package Intervalos;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        double x = sc.nextDouble();

        if (x <= 25.00 && x >= 0) {
            System.out.println("Intervalo [0,25] ");
        } else if (x > 25.00 && x <= 50.00) {
            System.out.println("Intervalo (25,50]");
        } else if (x > 50.00 && x <= 75.00) {
            System.out.println("Intervalo (50, 75]");
        } else if (x > 75.00 && x <= 100){
            System.out.println("Intervalo (75, 100]");
        } else {
            System.out.println("Fora de Intervalo");
        }

        sc.close();
    }







}
