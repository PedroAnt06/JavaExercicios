package Estoque3POOEncapsulado.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //  Neste exercicio estoque 3 eu coloquei os atributos da classe produto como Private, para garantir que os dados
    //  fossem acessado/modificados pelos getters e os setters

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }


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
