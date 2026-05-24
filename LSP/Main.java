package LSP;

public class Main {
    public static void main(String[] args) {
        Comida comida = new Comida();
        comida.preparar();

        Comida pizza = new Pizza();
        pizza.preparar();

        Comida hamburguer = new Hamburguer();
        hamburguer.preparar();

        Comida bebida = new Bebida();
        bebida.preparar();
    }
}
