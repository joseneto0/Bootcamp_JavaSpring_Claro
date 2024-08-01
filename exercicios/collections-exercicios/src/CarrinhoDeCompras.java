import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listItem;

    public CarrinhoDeCompras(){
        this.listItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item item: listItem){
            if (item.getNome().equals(nome)){
                listItem.remove(item);
                return;
            }
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item: listItem){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public List<Item> exibirItems(){
        return listItem;
    }


}
