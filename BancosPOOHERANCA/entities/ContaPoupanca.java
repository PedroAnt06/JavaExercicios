package BancosPOOHERANCA.entities;

public class ContaPoupanca extends Conta{

    private Double taxaJuros;

    public ContaPoupanca(Integer numero, String proprietario, Double saldo, Double taxaJuros) {
        super(numero, proprietario, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


    public void atualizarSaldo() {
        saldo += saldo * taxaJuros;
    }
}
