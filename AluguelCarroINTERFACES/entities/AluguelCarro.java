package AluguelCarroINTERFACES.entities;

import java.time.LocalDateTime;

public class AluguelCarro {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime fim, LocalDateTime inicio, Veiculo veiculo) {
        this.fim = fim;
        this.inicio = inicio;
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
