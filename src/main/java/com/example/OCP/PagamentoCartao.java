package com.example.OCP;

public class PagamentoCartao implements Pagamento {
    public void quitar(double quantia){
        System.out.println("Cartao processou R$" + quantia);
    }
}
