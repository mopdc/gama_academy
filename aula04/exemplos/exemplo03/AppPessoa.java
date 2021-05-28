package exemplos.exemplo03;

public class AppPessoa{

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Mariana", 123456);
        Pessoa p2 = new Pessoa("Nina", 789456);

        //p.nome = "Mariana";
        p.apresentar();
        System.out.println("Meu telefone é: " + p.obterTelefone());

        //p2.nome = "Nina";
        p2.apresentar();
        System.out.println("Meu telefone é: " + p2.obterTelefone());

        
    }


}