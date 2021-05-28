package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero, count;

        System.out.println("Digite um número");
        numero = entrada.nextInt();

        count = 1;

        while (count < numero) {
            
            System.out.printf("%d, ", count);

            count = count * 2;
        }

        System.out.printf("%d", numero);

        entrada.close();
    }
    
}
