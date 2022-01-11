package sistemalanchonete.cardapio;

public abstract class Item {
    protected int id;
    protected String nome;
    protected float preco;

    public Item(int id, String nome, float preço) {
        this.id = id;
        this.nome = nome;
        this.preco = preço;
    }
    
    public abstract String tipo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preço) {
        this.preco = preço;
    }
    
    
}
