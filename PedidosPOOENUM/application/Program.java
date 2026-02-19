package PedidosPOOENUM.application;

import PedidosPOOENUM.entities.Cliente;
import PedidosPOOENUM.entities.ItensPedido;
import PedidosPOOENUM.entities.Pedido;
import PedidosPOOENUM.entities.Produto;
import PedidosPOOENUM.entities.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente:");
        System.out.println("Nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Email: ");
        String emailCliente = sc.nextLine();

        System.out.println("Data de nascimento: ");
        Date aniversarioCliente = sdf.parse(sc.nextLine());

        Cliente cliente = new Cliente(nomeCliente, emailCliente, aniversarioCliente);

        System.out.println("Digite os dados do pedido: ");
        System.out.println("Status: ");
        StatusPedido statusPedido = StatusPedido.valueOf(sc.nextLine());

        Pedido pedido = new Pedido(new Date(), statusPedido, cliente);

        System.out.println("Quantos itens tem nesse pedido? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Dados do PEDIDO #"+i+" : ");
            System.out.println("Nome do produto: ");
            String nomeProduto = sc.next();
            System.out.println("Preco do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.println("Quantidade: ");
            int quantidadeProduto = sc.nextInt();
            Produto produto = new Produto(nomeProduto,precoProduto);
            ItensPedido item = new ItensPedido(quantidadeProduto,precoProduto,produto);
            pedido.addItem(item);
        }

        System.out.println(pedido.toString());



        sc.close();
    }
}
