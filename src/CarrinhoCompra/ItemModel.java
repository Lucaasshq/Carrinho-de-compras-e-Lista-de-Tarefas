package CarrinhoCompra;

public class ItemModel {

    String nome;
    int quantidade;
    double preco;



    public ItemModel(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return "CarrinhoCompra.ItemModel{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
