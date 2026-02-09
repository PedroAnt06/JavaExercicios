package PensionatoPOOVETORES.application;

import PensionatoPOOVETORES.entities.Quarto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quarto[] quarto = new Quarto[10]; //1. Criei um vetor chamado quarto de tamanho 10 (0-9)

        for (int i= 0; i< 10;i++){        //2. Populei os 10 quartos, com o construtor (Todos Vazios)
            quarto[i] = new Quarto("Vazio","Vazio",false);
        }

        System.out.println("Quantos estudantes vao alocar?"); //3. Aloquei na variavel n Quantos vetores iam ser alterados
        int n = sc.nextInt();



        for (int i = 0; i < n; i++){ //4. Alterei todos os vetores que o usuario pediu com os novos dados de entrada
            System.out.println("===================================================");
            System.out.println("Registro do "+(i+1)+"o estudante");
            System.out.println("Digite o nome do "+(i+1)+"o estudante");
            String nome = sc.next();

            System.out.println("Digite o email do "+(i+1)+"o estudante: ");
            String email = sc.next();

            System.out.println("Digite qual quarto o "+(i+1)+"o estudante quer");
            int numero = sc.nextInt();
            while (quarto[numero-1].isStatus() == true){
                System.out.println("Quarto ja ocupado!");
                System.out.println("Digite novamente: ");
                numero = sc.nextInt();
            }
            System.out.println("===================================================");

            quarto[numero-1].setNome(nome);
            quarto[numero-1].setEmail(email);
            quarto[numero-1].setStatus(true);

        }

        System.out.println("===================================================");
        System.out.println("Relatorio");
        for (int i=0;i< quarto.length;i++){ //5. Aqui percorri todo o vetor, printando os atributos nome e email de cada um

            System.out.println("=======================");
            System.out.println("Quarto "+(i+1));
            System.out.println("Status da alocacao: ");
            if (quarto[i].isStatus() == true){
                System.out.println("OCUPADO");
            } else {
                System.out.println("LIVRE");
            }

            System.out.println("Nome do estudante: "+quarto[i].getNome());
            System.out.println("Email do estudante: "+quarto[i].getEmail());
            System.out.println("=======================");


        }
        System.out.println("===================================================");




        sc.close();
    }
}
