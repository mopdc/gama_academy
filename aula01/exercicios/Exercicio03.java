package exercicios;

import java.security.SignatureSpi;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        // ENTRADA:
        java.util.Scanner entrada = new Scanner(System.in);
        double salarioAtual, novoSalario;

        System.out.println("Digite o valor do salário: ");
        salarioAtual = entrada.nextDouble();

        //PROCESSAMENTO:
        novoSalario = salarioAtual + (salarioAtual * 0.25);

        //SAÍDA:
        System.out.println("O novo salário é de: " + novoSalario);

        entrada.close();

    }

}
