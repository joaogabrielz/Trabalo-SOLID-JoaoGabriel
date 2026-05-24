package DIP;

public class Email implements MeioNotificacao {
    public void notificar(String aviso){
        System.out.println("E-mail disparado: " + aviso);
    }
}
