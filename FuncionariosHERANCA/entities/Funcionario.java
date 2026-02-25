package FuncionariosHERANCA.entities;

public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Funcionario() {
    }

    public Funcionario(Integer horas, String nome, Double valorPorHora) {
        this.horas = horas;
        this.nome = nome;
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento(){
        return valorPorHora * horas;
    }
}
