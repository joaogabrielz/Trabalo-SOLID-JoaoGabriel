package OCP;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();

        terminal.processar(new PagamentoCartao(), 70);
        terminal.processar(new PagamentoPix(), 55);
        terminal.processar(new PagamentoDinheiro(), 30);
    }
}
