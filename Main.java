package sistemalanchonete;
import sistemalanchonete.cardapio.*;

public class Main {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        
        cardapio.adicionar(new Bebida(123,"Coca-cola",4.1f));
        cardapio.adicionar(new Comida(523,"Pastel de frango",3f));
        cardapio.adicionar(new Bebida(715,"Suco de cajú",2f));
        cardapio.adicionar(new Bebida(152,"Suco de manga",2.5f));
        
        //cardapio.mostrar();
        
        Comanda mesa2 = new Comanda(2);
        
        mesa2.pedir(cardapio.getItem(523),2);
        mesa2.pedir(cardapio.getItem(152),1);
        mesa2.pedirConta();
       
    }
    
}
