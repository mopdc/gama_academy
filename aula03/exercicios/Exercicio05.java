package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int TOTAL_NUMEROS = 10;
        int valor, impares, pares, count;

        impares = 0;
        pares = 0;
        

        for (count = 1; count <= TOTAL_NUMEROS; count++){

            System.out.printf("Digite o %d° valor: ", count);
            valor = entrada.nextInt();

            if (valor %2 == 0) {

                pares++;
                
            }else{
                impares++;
            }
        }
       
        System.out.printf("\nO total de pares é: %d", pares);
        System.out.printf("\nO total de ímpares é: %d", impares);

     
        
        entrada.close();
    }
    
}
