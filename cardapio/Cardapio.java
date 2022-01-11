package sistemalanchonete.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Item>[] itens;
    
    public Cardapio(){
        this.itens = new List[2];
        this.itens[0] = new ArrayList<>();//Bebidas
        this.itens[1] = new ArrayList<>();//comidas
    }
    
    public void adicionar(Bebida item){
        this.itens[0].add(item);
    }
    
    public void adicionar(Comida item){
        this.itens[1].add(item);
    }
    
    
    public void mostrar(){ 
        System.out.println("------------------------");
        System.out.println("Cardápio do dia:  ");
        System.out.println("\nBebidas");
        
        for(Item item:this.itens[0]){
            System.out.printf("\n%s - R$ %.2f",item.getNome(),item.getPreco());
        }
        
        System.out.println("\n\nComidas");
        
        for(Item item:this.itens[1]){
            System.out.printf("\n%s - R$ %.2f",item.getNome(),item.getPreco());
        }
        System.out.println("\n------------------------\n");
        
    }

    public Item getItem(int id) {
        Item selecionado=null;
        
        for(Item item:this.itens[0])
            if(item.id == id)
                selecionado = item;
        
        for(Item item:this.itens[1])
            if(item.id == id)
                selecionado = item;      
                
                
        return selecionado;
    }
    
    
}
