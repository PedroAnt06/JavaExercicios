package PostoCombustivel;

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Escolha de Produtos: ");
        System.out.println("1. Alcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Sair");
        System.out.println("==========================");
        System.out.println("Escolha o seu produto preferido: ");
        int produto = sc.nextInt();


        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while (produto != 4){
            if (produto == 1){
                alcool += 1;
            } else if (produto == 2) {
                gasolina += 1;
            } else if (produto == 3) {
                diesel += 1;
            }
            System.out.println("Escolha novamente o seu produto preferido: ");
            produto = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);


        sc.close();
    }
}
