package BancosPOOHERANCA.entities;

public class ContaEmpresarial extends Conta{

    private Double limite;

    public ContaEmpresarial(Integer numero, String proprietario, Double saldo, Double limite) {
        super(numero, proprietario, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void emprestimo (Double valor){
        if (valor <= limite){
            saldo += valor - 10; //taxa de 10 reais
        } else {
            System.out.println("Valor excede seu limite!");
        }

    }
}
