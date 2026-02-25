package FuncionariosHERANCA.application;

import FuncionariosHERANCA.entities.Funcionario;
import FuncionariosHERANCA.entities.FuncionarioTeceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();



        System.out.println("Digite o numero de Funcionarios:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++){
            System.out.println("Digite os dados do Funcionario #"+i);
            System.out.println("Terceirizado? (s/n)");
            char sn = sc.next().charAt(0);
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Horas:");
            int horas = sc.nextInt();
            System.out.println("Valor por Hora:");
            double valorHora = sc.nextDouble();

            if (sn == 's'){
                System.out.println("Despesa Adicional:");
                double despAdc = sc.nextDouble();
                FuncionarioTeceirizado funcionarioTeceirizado = new FuncionarioTeceirizado(horas,nome,valorHora,despAdc);
                funcionarios.add(funcionarioTeceirizado);
            } else {
                Funcionario funcionario = new Funcionario(horas,nome,valorHora);
                funcionarios.add(funcionario);
            }

        }

        for (Funcionario f : funcionarios){
            System.out.println(f.getNome()+" - R$: "+f.pagamento());
        }



        sc.close();

    }
}
