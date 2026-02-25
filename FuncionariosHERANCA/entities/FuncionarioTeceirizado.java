package FuncionariosHERANCA.entities;

public class FuncionarioTeceirizado extends Funcionario{

    private Double despesaAdicional;

    public FuncionarioTeceirizado(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    public FuncionarioTeceirizado(Integer horas, String nome, Double valorPorHora, Double despesaAdicional) {
        super(horas, nome, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public final Double pagamento() {
        return super.pagamento() + despesaAdicional + (despesaAdicional * 0.1);
    }
}
