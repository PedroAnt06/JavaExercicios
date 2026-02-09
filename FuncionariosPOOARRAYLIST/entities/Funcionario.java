package FuncionariosPOOARRAYLIST.entities;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public double getSalario() {
        return salario;
    }

    public double aumentarSalario(double porcentagem){
        return salario = (salario * (porcentagem/100)) + (salario);
    }

    @Override
    public String toString() {
        return id +
                ", " +
                nome +
                ", " +
                salario;
    }
}
