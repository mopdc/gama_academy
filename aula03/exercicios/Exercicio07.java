package exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        final int TURMA = 5;
        final int ALUNOS = 5;
        double mediaAluno, mediaTurma, mediaGeral;

        mediaGeral = 0;
        for (int i=1; i <= TURMA; i++){

           System.out.println("\nTurma: " + i);

            mediaTurma = 0;
            for(int a=1; a <= ALUNOS; a++){
                
                System.out.printf("Digite a média do aluno %d: ",  a);
                mediaAluno = entrada.nextDouble();
                
                mediaTurma = mediaTurma + mediaAluno;

            }

            mediaTurma = mediaTurma / ALUNOS;
            System.out.printf("\nA média da turma %d é: %.2f\n", i, mediaTurma);

            mediaGeral = mediaGeral + mediaTurma;
        }
            
            mediaGeral = mediaGeral / TURMA;
            System.out.printf("A média geral das turmas é: %.2f:", mediaGeral);

            entrada.close();

    }
    
}
