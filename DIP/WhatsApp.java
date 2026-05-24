package DIP;

public class WhatsApp implements MeioNotificacao {
    public void notificar(String aviso){
        System.out.println("WhatsApp disparado: " + aviso);
    }
}
