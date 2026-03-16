package AluguelCarroINTERFACES.services;

public class TaxaBrasil {
    public double tax (double valor){
        if (valor <= 100) {
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }
}
