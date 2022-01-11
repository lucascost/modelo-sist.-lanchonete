package sistemalanchonete;

import sistemalanchonete.cardapio.Item;

public interface Mesa {
    public void pedir(Item item, int quantidade);
    public void pedirConta();
    public void pagar();
}
