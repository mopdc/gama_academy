package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double primeiro, segundo;

        // ENTRADA:
        System.out.println("Digite o primeiro valor:");
        primeiro = entrada.nextDouble();

        System.out.println("Digite o segundo valor:");
        segundo = entrada.nextDouble();

        if(primeiro > segundo){
            System.out.printf(segundo + "," + segundo);
        }else{
            System.out.printf("\n%.2f, %.2f\n", primeiro, segundo);
        }

        entrada.close();
        

    }
    
}
