package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual operação quer fazer: (Digite apenas: - ; + ; / ; *");
        String operacao = scanner.nextLine();

        System.out.println("Digite agora o seu primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite agora o seu segundo numero: ");
        int num2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora(num1,num2);

        float resultado = 0;

        switch (operacao) {
            case "+" -> resultado = calculadora.somar();
            case "-" -> resultado = calculadora.subtrair();
            case "*" -> resultado = calculadora.multiplicar();
            case "/" -> resultado = calculadora.dividir();
        }

        System.out.println("A sua operacao de " + operacao + " do numero (" + num1 + ") com o (" + num2 + ") e igual a " + resultado);
    }

    float num1;
    float num2;


    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float somar() {
        return num1 + num2;
    }

    public float subtrair() {
        return num1 - num2;
    }

    public float multiplicar() {
        return num1 * num2;
    }

    public float dividir() {
        if (num2 == 0) {
            System.out.println("Nao pode dividir por zero!");
        }
        return num1 / num2;
    }
}


