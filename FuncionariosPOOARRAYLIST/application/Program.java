package FuncionariosPOOARRAYLIST.application;

import FuncionariosPOOARRAYLIST.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos Funcionarios quer registrar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionario #"+(i+1)+":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id,nome,salario));
        }

        System.out.println("Digite o Id do funcionario que terá aumento:");
        int id = sc.nextInt();


        Funcionario result = funcionarios.stream() //Cria uma nova lista que contenha somente o usuario correto
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);

        if (result == null){
            System.out.println("Id nao existe!");
        } else {
            System.out.println("Digite a porcentagem de aumento:");
            double porcentagem = sc.nextDouble();
            result.aumentarSalario(porcentagem);
        }

        System.out.println("Lista de funcionarios:");

        for (Funcionario y : funcionarios) {
            System.out.println(y.toString());
        }

        sc.close();


    }
}
