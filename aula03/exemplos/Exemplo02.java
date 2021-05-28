package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont, soma;

        soma = 0;
        cont = 0;

        while (cont < 5) { // CONDIÇÃO: enquanto for verdadeiro
            System.out.print(cont + "+");
            soma = soma + cont;
            cont++; // INCREMENTO: passo
        }

        System.out.println(" = " + soma);

    }
}
