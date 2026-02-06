package Estoque2POO.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Construtor criado para garantir que os atributos nao iniciem vazios

    public double ValorTotalNoEstoque(){
        double total = preco * quantidade;
        return total;
    }


    public void AdicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }


    public void RemoverProdutos(int quantidade){
        this.quantidade -= quantidade;
    }


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

}
