package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, contador;

        System.out.println("Digite o número desejado:");
        numero = entrada.nextInt();

        contador = 1;
        while (contador <= 10) {

            //System.out.println(numero + " x " + contador + " = " + (numero * contador));
            System.out.printf("%2d X %2d = %2d\n", numero, contador, (numero*contador));
            contador++;
        }

        entrada.close();

    }

}
