package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Informe o valor do salário bruto:");
        salario = entrada.nextDouble();

        System.out.println("Informe o valor da prestação:");
        prestacao = entrada.nextDouble();

        salario = (salario * 0.3); 

        if(prestacao > salario){
            System.out.println("O empréstimo não pode ser concedido!");
        }else{
            System.out.println("O empréstimo pode ser concedio!");
        }   

        entrada.close();
    }
    
}
