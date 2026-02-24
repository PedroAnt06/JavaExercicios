package BancosPOOHERANCA.entities;

public class Conta {
    private Integer numero;
    private String proprietario;
    protected Double saldo;

    public Conta(Integer numero, String proprietario, Double saldo) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(Double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void deposito(Double valor){
            saldo += valor;
            System.out.println("Depósito efetuado com sucesso!");

    }
}
