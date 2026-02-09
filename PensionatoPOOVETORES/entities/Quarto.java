package PensionatoPOOVETORES.entities;

public class Quarto { /*6. Entidade Quarto criada, com esses atributos, um contrutor para nao iniciar vazio(Null), e
getts e setts para melhor acesso aos atributos */

    String nome;
    String email;
    boolean status;

    public Quarto() {
    }

    public Quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Quarto(String nome, String email, boolean status) {
        this.nome = nome;
        this.email = email;
        this.status = status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
