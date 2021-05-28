package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        final int TOTAL_NUMEROS = 10;
        int valor, impares, pares, count, valor_pares;
        double media;
       

        impares = 0;
        pares = 0;
        valor_pares = 0;
        

        for (count = 1; count <= TOTAL_NUMEROS; count++){

            System.out.printf("Digite o %d° valor: ", count);
            valor = entrada.nextInt();

            if (valor %2 == 0) {

                valor_pares = valor_pares + valor;
                pares++;
                
            }else{

                impares++;
            }
        }
       
        media = (valor_pares/pares);
        System.out.println("\nA média dos valores pares é: " + media);
        System.out.printf("\nA porcentagem de números Ímpares é: %.2f%%\n", (double)impares/TOTAL_NUMEROS*100);

        
        entrada.close();
    }

}
