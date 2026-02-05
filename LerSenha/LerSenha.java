package LerSenha;

import java.util.Scanner;

public class LerSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Sua Senha: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");

            System.out.println("Digite Sua Senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");


        sc.close();
    }
}
