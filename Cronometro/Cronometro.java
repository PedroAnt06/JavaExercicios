package Cronometro;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas horas: ");
        int hora = scanner.nextInt();

        System.out.println("Digite quantos minutos: ");
        int minuto = scanner.nextInt();

        System.out.println("Digite quantos segundos: ");
        int segundos = scanner.nextInt();

         scanner.close();


         int tempoTotalSegundos = hora * 3600 + minuto * 60 + segundos;


        for ( int c = tempoTotalSegundos ; c >= 0 ; c--) {
            int Horas = c / 3600;
            int Minutos = (c % 3600) / 60;
            int Segundos = c % 60;
            System.out.println(Horas+":"+Minutos+":"+Segundos);
            Thread.sleep(1000);
        }



    }
}
