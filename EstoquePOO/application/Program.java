package EstoquePOO.application;

import EstoquePOO.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto(); //5. Criacao do Objeto produto da classe Produto


        System.out.println("Digite o nome do produto: ");
        produto.nome = sc.next(); // 6. adiciona a entrada a exatamente o atributo da entidade produto (nome)
        System.out.println("Digite o preco do produto: ");
        produto.preco = sc.nextDouble(); // 7. adiciona a entrada a exatamente o atributo da entidade produto (preco)
        System.out.println("Digite a quantidade do produto: ");
        produto.quantidade = sc.nextInt(); // 8. adiciona a entrada a exatamente o atributo da entidade produto (quantidade)

        System.out.println(produto.nome + "     " + produto.preco + "     " + produto.quantidade + "     " + produto.ValorTotalNoEstoque());
        /*9. Mostra esses atributos da entidade produto, e no final chama a funcao de ver o valorTotalNoEstoque
        (Que faz um calculo - explicado no topico 2)
        */

        System.out.println("Digite quantos produtos quer adicionar no estoque: ");
        produto.AdicionarProdutos(sc.nextInt());
        /*10. A entrada que o usuario enviar no "sc.nextInt()" eh atribuida e ja enviada como parametro
        para a funcao AdicionarProdutos (Mais explicacoes dessa funcao no topico 3)
        */

        System.out.println(produto.nome + "     " + produto.preco + "     " + produto.quantidade + "     " + produto.ValorTotalNoEstoque());
        /*11. Mostra esses atributos da entidade produto, e no final chama a funcao de ver o valorTotalNoEstoque
        (Que faz um calculo - explicado no topico 2)
        */

        System.out.println("Digite quantos produtos quer remover no estoque: ");
        produto.RemoverProdutos(sc.nextInt());
        /*12. A entrada que o usuario enviar no "sc.nextInt()" eh atribuida e ja enviada como parametro
        para a funcao RemoverProdutos (Mais explicacoes dessa funcao no topico 4)
        */

        System.out.println(produto.nome + "     " + produto.preco + "     " + produto.quantidade + "     " + produto.ValorTotalNoEstoque());
        /*13. Mostra esses atributos da entidade produto, e no final chama a funcao de ver o valorTotalNoEstoque
        (Que faz um calculo - explicado no topico 2)
        */

        System.out.println(produto.toString());
        //15. Essa chamada desse metodo substitui todas essa formatacoes dos topicos 9, 11 e 13

        sc.close();

    }
}
