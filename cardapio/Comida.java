package sistemalanchonete.cardapio;

public class Comida extends Item{
    
    public Comida(int id,String nome, float preco) {
        super(id, nome, preco);
    }

    @Override
    public String tipo() {
        return "comida";
    }
}
