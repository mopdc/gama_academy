package uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int distancia;
        double combustivel, consumo;

        distancia = entrada.nextInt();
        combustivel = entrada.nextDouble();

        consumo = distancia/combustivel;

        System.out.printf(consumo, "Km");

        entrada.close();
    }

}