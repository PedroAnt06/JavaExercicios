package ClientesHASHCODEEQUALS.application;

import ClientesHASHCODEEQUALS.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("pedro@email", "Pedro");
        Client c2 = new Client("antonio@email", "Antonio");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
