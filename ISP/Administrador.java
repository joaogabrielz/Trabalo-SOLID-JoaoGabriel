package ISP;

public class Administrador implements GerenciadorPedido, GerenciadorEntrega, Relatorista, Notificador {
    public void gerenciarPedido(){
        System.out.println("Administrador gerenciou o pedido!");
    }
    public void gerenciarEntrega(){
        System.out.println("Administrador gerenciou a entrega!");
    }
    public void gerarRelatorio(){
        System.out.println("Administrador gerou o relatorio!");
    }
    public void notificar(){
        System.out.println("Administrador enviou a notificacao!");
    }
}
