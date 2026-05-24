public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10, "Frango com Catupiry");

        ArmazenamentoPedido armazenamento = new ArmazenamentoPedido();
        ApresentacaoPedido apresentacao = new ApresentacaoPedido();

        armazenamento.registrar(pedido);
        apresentacao.apresentar(pedido);
    }
}
