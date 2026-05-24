package com.example.OCP;

public class Terminal {
    public void processar(Pagamento pagamento, double quantia){
        pagamento.quitar(quantia);
    }
}
