package CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoRepositoy {

    private List<ItemModel> listaItens;

    public CarrinhoRepositoy() {
        this.listaItens = new ArrayList<ItemModel>();
    }

    public void adicionarItem(ItemModel itemModel) {
        listaItens.add(itemModel);
    }

    public void removerItem(String nome) {
        listaItens.removeIf(item -> item.getNome().equals(nome));
    }

    public void calcularValorTotal() {
        double total = 0;
        for (ItemModel itemModel : listaItens) {
            total += itemModel.getPreco() * itemModel.getQuantidade();
        }
        System.out.println("Total: " + total);
    }


    public int obterQuantidade() {
        return listaItens.size();
    }

    public void obterItems() {
        for ( ItemModel itemModel : listaItens ) {
            System.out.println(itemModel);
        }
    }



}
