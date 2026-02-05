package FuncionarioPOO.entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;


    public double SalarioLiquido(){
        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }

    public void AumentarSalario(double porcentagem){
        this.salarioBruto *= (porcentagem/100) + salarioBruto;
    }

}
