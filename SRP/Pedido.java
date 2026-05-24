public class Pedido {
    private int id;
    private String prato;

    public Pedido(int id, String prato){
        this.id = id;
        this.prato = prato;
    }

    public int getId(){
        return id;
    }

    public String getPrato(){
        return prato;
    }
}
