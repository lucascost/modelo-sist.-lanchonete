package sistemalanchonete;

import sistemalanchonete.cardapio.Item;

class Pedido {
    private Item item;
    private int quantidade;
    private String observacao;

    public Pedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }
    
    public void adicionarObs(String obs){
        this.observacao = obs;
    }
    
    public float total(){
        return this.item.getPreco() * this.quantidade;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    
}
