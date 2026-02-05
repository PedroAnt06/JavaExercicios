package NotasAlunoPOO.entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;



    public double NotaFinal(){
        double notaFinal = nota1 + nota2 + nota3;
        return notaFinal;
    }

    public String MostrarStatus(double notaFinal){
        if (notaFinal >= 60){
            return "PASS";
        } else {
            double notaFaltante = 60 - notaFinal;
            return "FAILED " + "FALTANDO :"+String.format("%.2f%n",notaFaltante);
        }
    }

}


