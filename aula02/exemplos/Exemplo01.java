package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("A resposta é " + 10);
        System.out.printf("A resposta é %d\n", 10);

        //FORMATOS:
        //%d = int   %f = decimal   %s = String
        //%xf ou %.yf | x = número de casas inteiras e y = número de casas decimais


        System.out.printf("A média é: %.2f", 12.675485);
    }
    
}
