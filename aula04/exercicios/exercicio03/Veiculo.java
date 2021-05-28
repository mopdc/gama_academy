package exercicios.exercicio03;

public class Veiculo {

    //ATRIBUTOS:
    String modelo, marca;
    double consumo;

    //MÉTODOS
    Veiculo(String marca, String modelo, double consumo){
        this.modelo = modelo; //this se refere ao atributo
        this.marca = marca;
        this.consumo = consumo;
    }

    void mostraVeiculo(){

        System.out.printf("\nVeículo da marca: %s, modelo: %s\n ", marca, modelo);
    }

    double obterConsumo(){
        return consumo;
    }
    
}
