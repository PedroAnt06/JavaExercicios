package EstoquePOO.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    //1. Sao criados atributos dessa classe, ou pode pensar como se fossem, colunas de um BD

    public double ValorTotalNoEstoque(){
        double total = preco * quantidade;
        return total;
    }

    //2. Foi criado esse Metodo que retorna o "total" (O valor de Preco * Quantidade)

    public void AdicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    /*3. Foi criado esse Metodo que adiciona a quantidade que chega do parametro (O que estao dentro dos "()")
    vem da classe que cria um objeto e chama esse metodo mandando o parametro "quantidade" + a "quantidade" da entidade
    produto definida por this.quantidade, ou seja, quando tem o this quer dizer que eu quero o atributo dessa classe e nao
    o que chegou do parametro.
    */

    public void RemoverProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    /*4. Foi criado esse Metodo que remove a quantidade que chega do parametro (O que estao dentro dos "()")
    vem da classe que cria um objeto e chama esse metodo mandando o parametro "quantidade" - a "quantidade" da entidade
    produto definida por this.quantidade, ou seja, quando tem o this quer dizer que eu quero o atributo dessa classe e nao
    o que chegou do parametro.
    */

    @Override
    public String toString(){
        return "Nome: "
                + nome
                + ", Preco: "
                + String.format("%.2f%n", preco)
                + ", Quantidade :"
                +quantidade
                +", Valor Total no Estoque: "
                +String.format("%.2f%n", ValorTotalNoEstoque());
    }

    /*14. Esse metodo foi criado para manter uma formatacao padrao, porem esse to String ja existe nativamente da nossa classe
    Object que eh como se Fosse: EX. produto(objeto) eh do tipo Produto(classe) porem essa classe tambem
    faz parte de outra chamada Object (Object(tipo - classe) -> Produto(tipo - classe) -> product(objeto)),
    e por isso usa-se o @Override que sobrescreve aquela classe object e traz para a classe Produto.
    */
}
