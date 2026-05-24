package com.example.DIP;

public class GerenciadorNotificacao {
    private MeioNotificacao meio;

    public GerenciadorNotificacao(MeioNotificacao meio){
        this.meio = meio;
    }

    public void enviar(){
        meio.notificar("Pedido recebido com sucesso!");
    }
}
