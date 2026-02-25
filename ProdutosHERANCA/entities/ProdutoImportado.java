package ProdutosHERANCA.entities;

public class ProdutoImportado extends Produto{

    private Double taxaImport;

    public ProdutoImportado(Double taxaImport) {
        this.taxaImport = taxaImport;
    }

    public ProdutoImportado(String nome, Double preco, Double taxaImport) {
        super(nome, preco);
        this.taxaImport = taxaImport;
    }

    public Double precoTotal(){
        return super.getPreco() + taxaImport;
    }

    @Override
    public String etiquetaPreco() {
        return super.getNome() + " R$: " +precoTotal()+ " (Taxa alfandegaria: R$ "+taxaImport+")";
    }
}
