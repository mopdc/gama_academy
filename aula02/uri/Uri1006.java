package uri;

import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double notaA, notaB, notaC, media;

        notaA = entrada.nextDouble();
        notaB = entrada.nextDouble();
        notaC = entrada.nextDouble();
    
        notaA = notaA*2;
        notaB = notaB*3;
        notaC = notaC*5;

        media = (notaA + notaB + notaC)/(2+3+5);

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();

    }
    
}
