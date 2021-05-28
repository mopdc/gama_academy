package exercicios;

import java.security.SignatureSpi;
import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Exercicio02 {
    

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double primeiraNota, segundaNota, media;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = entrada.nextDouble();

        
        media = (primeiraNota + segundaNota) / 2;

        System.out.println("A notal média é: " + media);

        entrada.close();
    }
}