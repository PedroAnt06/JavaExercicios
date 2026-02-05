package Duracao;

import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Hora Inicial: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a Hora Final: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("DUROU "+duracao+" HORA(S)");
        sc.close();
    }
}
