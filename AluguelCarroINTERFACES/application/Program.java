package AluguelCarroINTERFACES.application;

import AluguelCarroINTERFACES.entities.AluguelCarro;
import AluguelCarroINTERFACES.entities.Veiculo;
import AluguelCarroINTERFACES.services.ServiceAluguel;
import AluguelCarroINTERFACES.services.TaxaBrasil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Digite os dados do aluguel:");
        System.out.println("Modelo do carro:");
        String modeloCarro = sc.nextLine();
        Veiculo carro = new Veiculo(modeloCarro);
        System.out.println("Retirada (DD/MM/YYYY hh:mm): ");
        LocalDateTime dataInicio = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.println("Retorno (DD/MM/YYYY hh:mm): ");
        LocalDateTime dataFim = LocalDateTime.parse(sc.nextLine(), formatter);

        AluguelCarro aluguelCarro = new AluguelCarro(dataFim, dataInicio, carro);

        System.out.println("Digite o preco por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.println("Digite o preco por dia: ");
        double precoPorDia = sc.nextDouble();

        ServiceAluguel serviceAluguel = new ServiceAluguel(precoPorDia,precoPorHora, new TaxaBrasil());

        serviceAluguel.processarFatura(aluguelCarro);

        System.out.println("Fatura:");
        System.out.println("Pagamento Basico: " + aluguelCarro.getFatura().getPagamentoBasico());
        System.out.println("Imposto: " + aluguelCarro.getFatura().getTaxa());
        System.out.println("Pagamento Total: " + aluguelCarro.getFatura().getTotalPayment());

        sc.close();



    }
}
