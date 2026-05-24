package OCP;

public class PagamentoPix implements Pagamento {
    public void quitar(double quantia){
        System.out.println("PIX confirmou R$" + quantia);
    }
}
