package com.example.DIP;

public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacao g1 = new GerenciadorNotificacao(new Email());
        GerenciadorNotificacao g2 = new GerenciadorNotificacao(new SMS());
        GerenciadorNotificacao g3 = new GerenciadorNotificacao(new WhatsApp());

        g1.enviar();
        g2.enviar();
        g3.enviar();
    }
}
