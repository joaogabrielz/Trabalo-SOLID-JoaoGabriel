package OCP;

public class PagamentoDinheiro implements Pagamento {
    public void quitar(double quantia){
        System.out.println("Dinheiro recebido: R$" + quantia);
    }
}
