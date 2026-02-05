package CalculosRetanguloPOO.application;

import CalculosRetanguloPOO.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a comprimento e altura do Retangulo");
        retangulo.comprimento = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        double area = retangulo.Area();
        double perimetro = retangulo.Perimetro();
        double diagonal = retangulo.Diagonal();

        System.out.println("AREA = "+area+" PERIMETRO = "+perimetro+" DIAGONAL = "+diagonal);

        System.out.println("Meu toString - BONUS: "+ retangulo.toString());


        sc.close();
    }
}
