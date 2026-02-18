package DadosTrabalhadorPOOENUM.application;

import DadosTrabalhadorPOOENUM.entities.Departamento;
import DadosTrabalhadorPOOENUM.entities.HoraContrato;
import DadosTrabalhadorPOOENUM.entities.Trabalhador;
import DadosTrabalhadorPOOENUM.entities.enums.LevelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do Departamento:");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Digite dados do Trabalhador:");
        System.out.println("Nome:");
        String nomeTrabalhador = sc.next();
        System.out.println("Level:");
        String levelTrabalhador = sc.next();
        System.out.println("Salario:");
        double salarioTrabalhador = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, LevelTrabalhador.valueOf(levelTrabalhador),salarioTrabalhador, new Departamento(nomeDepartamento));

        System.out.println("Quantos contratos terao: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Digite os dados CONTRATO #"+i+" :");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Valor por hora:");
            double valorPorHora = sc.nextDouble();
            System.out.println("Duracao (HORAS):");
            int horas = sc.nextInt();
            HoraContrato contrato = new HoraContrato(contractDate, valorPorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println("Digite o MES e o ANO (MM/YYYY)");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: "+ trabalhador.getNome());
        System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
        System.out.print("Total do mes "+mesEAno+" : "+ trabalhador.calcularRenda(ano,mes));



        sc.close();
    }
}
