package exemplos.exemplo03;

public class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Desenhando um retângulo");        
    }

    @Override
    public void msg() {
        System.out.println("Mensagem do quadrado");
    }
    
}
