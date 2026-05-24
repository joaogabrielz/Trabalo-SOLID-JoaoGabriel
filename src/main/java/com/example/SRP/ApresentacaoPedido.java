package com.example.SRP;

public class ApresentacaoPedido {
    public void apresentar(Pedido pedido) {
        System.out.println("Id do pedido: " + pedido.getId());
        System.out.println("Prato: " + pedido.getPrato());
    }
}
