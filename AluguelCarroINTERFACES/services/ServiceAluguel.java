package AluguelCarroINTERFACES.services;

import AluguelCarroINTERFACES.entities.AluguelCarro;
import AluguelCarroINTERFACES.entities.Fatura;

import java.time.Duration;

public class ServiceAluguel {
    private Double precoPorHora;
    private Double precoPorDia;

    private TaxService taxaBrasil;

    public ServiceAluguel(Double precoPorDia, Double precoPorHora, TaxService taxaBrasil) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaBrasil = taxaBrasil;
    }

    public void processarFatura(AluguelCarro aluguelCarro){
        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        double horas = minutos / 60;
        double pagamentoBasico;
        if (horas <= 12){
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas/24);
        }

        double tax = taxaBrasil.tax(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura());
    }
}
