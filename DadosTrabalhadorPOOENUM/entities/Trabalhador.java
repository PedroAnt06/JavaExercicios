package DadosTrabalhadorPOOENUM.entities;

import DadosTrabalhadorPOOENUM.entities.enums.LevelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private LevelTrabalhador level;
    private Double salarioBase;
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, LevelTrabalhador level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LevelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(LevelTrabalhador level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }

    public void addContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }

    public Double calcularRenda(int year, int month) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (HoraContrato c : contratos) {
            cal.setTime(c.getData());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (c_year == year && c_month == month) {
                soma += c.valorTotal();
            }
        }

        return soma;
    }
}
