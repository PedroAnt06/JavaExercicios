package AlturasPOOVETORES.application;

import AlturasPOOVETORES.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pessoas deseja inserir? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];




        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Dados da "+(i+1)+"a pessoa: ");
            System.out.println("Digite o nome dessa pessoa: ");
            String nome = sc.next();
            System.out.println("Digite a idade dessa pessoa: ");
            int idade = sc.nextInt();
            System.out.println("Digite a altura dessa pessoa: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome,idade,altura);
        }


        double somaAlturas = 0.0;
        int qtdPessoasDeMenor16 = 0;

        for (int i = 0; i < pessoas.length; i++){  //percorre o vet
            somaAlturas += pessoas[i].getAltura();

            if ( pessoas[i].getIdade() < 16 ){
                qtdPessoasDeMenor16 += 1;
            }
        }

        double alturaMedia = somaAlturas / pessoas.length;

        System.out.printf("Altura Media: %.2f%n",alturaMedia);

        double porcentagemDeMenor = (qtdPessoasDeMenor16 * 100) / pessoas.length;

        System.out.println("Pessoas com menos de 16 anos: "+porcentagemDeMenor+"%");


        for (int i = 0; i < pessoas.length; i++){  //percorre o vet

            if ( pessoas[i].getIdade() < 16 ){
                System.out.println(pessoas[i].getNome());
            }
        }



        sc.close();
    }
}
