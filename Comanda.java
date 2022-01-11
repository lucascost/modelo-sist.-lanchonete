package sistemalanchonete;

import java.util.ArrayList;
import java.util.List;
import sistemalanchonete.cardapio.Item;

public class Comanda implements Mesa{
    List<Pedido> itens;
    int mesa;
    boolean aberto;
    String observacao;

    public Comanda(int mesa) {
        this.itens = new ArrayList<>();
        this.mesa = mesa;
        this.aberto = true;  
    }

    @Override
    public void pedir(Item item, int quantidade) {
        this.itens.add(new Pedido(item,quantidade));
    }

    @Override
    public void pedirConta() {
        float total = total();
        
        System.out.println("------------------------");
        System.out.println("Mesa "+this.mesa+":");
        if(itens.isEmpty())
            System.out.println("Sem itens para exibir.");
        else{
            for(Pedido pedido:this.itens){
                Item item =pedido.getItem();
                System.out.printf("%s(%d)- R$ %.2f \n",item.getNome(),pedido.getQuantidade(), pedido.total());
            }
            System.out.println("------------------------");
            System.out.printf("Total: R$ %.2f\n",total);
        }
    }

    @Override
    public void pagar() {
        this.aberto = false;
    }
    
    private float total(){
        float total = 0;
        for(Pedido item:this.itens)
            total += item.total();
            
        return total;
    }
}
