package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int valor, soma, i;

        soma = 0;
        i = 1;
        valor = 1; 
       
        while(valor != 0){

            System.out.printf("Digite o %d° valor: ", i);
            valor = entrada.nextInt();

            soma = soma +  valor;

            i++;    
               
        }

        System.out.println("A soma dos valores é: " + soma);
              
        entrada.close();
        
    }
    
}
