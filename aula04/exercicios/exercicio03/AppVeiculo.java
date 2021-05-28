package exercicios.exercicio03;

public class AppVeiculo {

    public static void main(String[] args) {
        
        Veiculo w = new Veiculo("Volkswagem", "Gol", 15);
        Veiculo f = new Veiculo("Fiat", "Toro", 20);


        w.mostraVeiculo();
        System.out.println("O consumo é: " + w.obterConsumo());

        f.mostraVeiculo();
        System.out.println("O consumo é: " + f.obterConsumo());

    }
    
}
