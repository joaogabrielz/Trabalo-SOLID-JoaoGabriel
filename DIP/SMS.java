package DIP;

public class SMS implements MeioNotificacao {
    public void notificar(String aviso){
        System.out.println("SMS disparado: " + aviso);
    }
}
