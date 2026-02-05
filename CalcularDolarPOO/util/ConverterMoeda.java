package CalcularDolarPOO.util;

public class ConverterMoeda {

    public static double IOF = 0.06;


    public static double calcularMoeda(double dolar, double preco){
        return preco * dolar * ( 1 + IOF);
    }



}
