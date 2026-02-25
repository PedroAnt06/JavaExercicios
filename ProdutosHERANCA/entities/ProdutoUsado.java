package ProdutosHERANCA.entities;

import java.time.LocalDate;

public class ProdutoUsado extends Produto{
    private LocalDate dataFabricacao;

    public ProdutoUsado(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return super.getNome() +" (usado) R$: " +getPreco()+ " (Data de Fabricacao: "+dataFabricacao+")";
    }
}
