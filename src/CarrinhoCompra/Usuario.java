package CarrinhoCompra;

public class Usuario {

    public static void main(String[] args) {

        CarrinhoRepositoy carrinho = new CarrinhoRepositoy();

        carrinho.adicionarItem(new ItemModel("Arroz", 5, 5));
        carrinho.adicionarItem(new ItemModel("Bisteca de gado", 5, 35));
        carrinho.adicionarItem(new ItemModel("Aveia", 1, 3.50));

        carrinho.removerItem("Arroz");
        System.out.println("Quantidade itens: " + carrinho.obterQuantidade());
        carrinho.obterItems();
        carrinho.calcularValorTotal();
    }
}
