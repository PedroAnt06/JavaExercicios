package BancosPOOHERANCA.application;

import BancosPOOHERANCA.entities.Conta;
import BancosPOOHERANCA.entities.ContaEmpresarial;
import BancosPOOHERANCA.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {
        Conta conta = new Conta(001,"Pedro",00.00);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(002,"Joao",00.00,2000.00);

        //UPCASTING - Uma variavel do tipo de uma SuperClasse pode receber a instancia de uma SubClasse

        Conta conta1 = contaEmpresarial;
        Conta conta2 = new ContaEmpresarial(003, "Maria",00.00,1000.00);
        Conta conta3 = new ContaPoupanca(004,"Lucas",00.00,10.00);

        /*DOWNCASTING - Uma variavel do tipo de uma SubClasse para receber a instancia de uma SuperClasse dever realizar-se
        o casting do tipo que quer converter */
        ContaEmpresarial conta4 = (ContaEmpresarial) conta2;


    }
}
