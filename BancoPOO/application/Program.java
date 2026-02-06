package BancoPOO.application;

import BancoPOO.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta = null;

        System.out.println("Digite o numero da Conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o nome do titular da Conta: ");
        String nomeConta = sc.next();

        char resp;


        do {
            System.out.println("Voce quer fazer deposito inicial? (s/n)");
            resp = sc.next().charAt(0);;

            if (resp == 's'){
                System.out.println("Quanto quer depositar?");
                double depositoInicial = sc.nextDouble();
                conta = new Conta(numeroConta,nomeConta,depositoInicial);
                break;

            } else if (resp == 'n'){
                conta = new Conta(numeroConta,nomeConta);
                break;
            } else {
                System.out.println("Entrada Invalida!");
                System.out.println("Digite Novamente: (s/n)");
            }
        } while (resp != 's' && resp != 'n');

        System.out.println("==================================");
        System.out.println("Dados da Conta: ");
        System.out.println("Numero: "+ conta.getNumero());
        System.out.println("Nome: "+ conta.getNome());
        System.out.println("Saldo: "+ conta.getSaldo());
        System.out.println("==================================");

        System.out.println("Digite o valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("==================================");
        System.out.println("Dados da Conta: ");
        System.out.println("Numero: "+ conta.getNumero());
        System.out.println("Nome: "+ conta.getNome());
        System.out.println("Saldo: "+ conta.getSaldo());
        System.out.println("==================================");

        System.out.println("Digite o valor para sacar: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("==================================");
        System.out.println("Dados da Conta: ");
        System.out.println("Numero: "+ conta.getNumero());
        System.out.println("Nome: "+ conta.getNome());
        System.out.println("Saldo: "+ conta.getSaldo());
        System.out.println("==================================");


        sc.close();
    }





}
