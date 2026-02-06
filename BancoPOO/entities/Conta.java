package BancoPOO.entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;


    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }


    public int getNumero() {
        return numero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (saldo >= valor) {
            this.saldo -= (valor + 5);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

}