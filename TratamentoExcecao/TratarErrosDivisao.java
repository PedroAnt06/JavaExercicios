package TratamentoExcecao;

/*🎯 Objetivo

Criar um programa que:
Leia dois números inteiros
Realize uma divisão
Trate os principais erros possíveis
📋 Regras do exercício
Você deve:
Ler dois números usando Scanner
Criar um método dividir(int a, int b)
Tratar os seguintes casos:
Divisão por zero → ArithmeticException
Entrada inválida (ex: letra em vez de número) → InputMismatchException
Garantir que o programa não quebre
Exibir mensagens claras de erro*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class TratarErrosDivisao {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o primeiro numero:");
            int a = sc.nextInt();

            System.out.println("Digite o segundo numero:");
            int b = sc.nextInt();

            int resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida: digite apenas numeros inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("Nao pode dividir por 0.");
        }
    }

    public static int dividir(int a, int b) {
        return a / b; // se b == 0, estoura ArithmeticException e cai no catch do main
    }
}
