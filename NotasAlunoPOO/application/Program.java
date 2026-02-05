package NotasAlunoPOO.application;

import NotasAlunoPOO.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        aluno.nota3 = sc.nextDouble();

        double notaFinal = aluno.NotaFinal();
        String status = aluno.MostrarStatus(notaFinal);

        System.out.println("Nota Final: "+ notaFinal);
        System.out.println("Status: "+ status);

        sc.close();
    }
}
