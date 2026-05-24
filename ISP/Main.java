package ISP;

public class Main {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.gerenciarPedido();

        Administrador administrador = new Administrador();
        administrador.gerenciarPedido();
        administrador.gerenciarEntrega();
        administrador.gerarRelatorio();
        administrador.notificar();
    }
}
