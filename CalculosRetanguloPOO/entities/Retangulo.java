package CalculosRetanguloPOO.entities;

public class Retangulo {

    public double comprimento;
    public double altura;

    public double Area(){
        double area = comprimento * altura;
        return area;
    }

    public double Perimetro(){
        double perimetro = (comprimento * 2) + (altura * 2);
        return perimetro;
    }

    public double Diagonal(){
        double diagonal = Math.sqrt((comprimento * 2) + (altura * 2));
        return diagonal;
    }

    @Override
    public String toString(){
        return "AREA ="
                + String.format("%.2f%n", Area())
                + " PERIMETRO = "
                + String.format("%.2f%n", Perimetro())
                + " DIAGONAL = "
                +String.format("%.2f%n", Diagonal());
    }


}
