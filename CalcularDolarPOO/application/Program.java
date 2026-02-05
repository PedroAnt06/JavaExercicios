package CalcularDolarPOO.application;

import CalcularDolarPOO.util.ConverterMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preco do dolar?");
        double dolar = sc.nextDouble();

        System.out.println("Qual o preco do produto?");
        double preco = sc.nextDouble();

        double convertido = ConverterMoeda.calcularMoeda(dolar, preco);
        System.out.printf("Voce pagará em reais: %.2f%n", convertido);


    }
}
