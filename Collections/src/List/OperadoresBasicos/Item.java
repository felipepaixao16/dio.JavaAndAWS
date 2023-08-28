package List.OperadoresBasicos;

public class Item {
    private String nome;
    private int preco;
    private int quantidade;

    public Item(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nItem:" + nome +
                "\npreço:" + preco +
                "\nquantidade:" + quantidade + "\n \n";
    }
}
