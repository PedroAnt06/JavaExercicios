/*1. Classe Pessoa
Crie uma classe chamada Pessoa com os atributos:
nome (String)
idade (int)
E métodos:
fazerAniversario() → aumenta a idade em 1
apresentar() → imprime "Olá, meu nome é X e tenho Y anos."
Exercício:
Crie um objeto dessa classe no main, altere atributos e chame os métodos*/


package Pessoa;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.close();

        Pessoa pessoa = new Pessoa(nome,idade);

        pessoa.apresentacao();
        pessoa.aniversario();
    }

    int idade;
    String nome;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    public void apresentacao (){
        System.out.println("Ola me chamo "+nome+" e tenho "+idade+" anos.");
    }

    public void aniversario (){
        idade += 1;
        System.out.println("Hoje e meu aniversario e tenho agora "+idade);
    }

}
