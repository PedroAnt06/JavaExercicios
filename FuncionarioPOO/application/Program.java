package FuncionarioPOO.application;

import FuncionarioPOO.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Digite o salario bruto do funcionario: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Digite o imposto do funcionario: ");
        funcionario.imposto = sc.nextDouble();


        System.out.println("Funcionario : "+ funcionario.nome + ", Salario Liquido: "+ funcionario.SalarioLiquido());

        System.out.println("Qual a porcentagem para adicionar sobre o salario: ");
        funcionario.AumentarSalario(sc.nextDouble());

        System.out.println("Funcionario : "+ funcionario.nome + ", Salario Liquido: "+ funcionario.salarioBruto);




        sc.close();
    }
}
