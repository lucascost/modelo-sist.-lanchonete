package sistemalanchonete.cardapio;

public class Bebida extends Item{

    public Bebida(int id,String nome, float preco) {
        super(id, nome, preco);
    }

    @Override
    public String tipo() {
        return "bebida";
    }
}
