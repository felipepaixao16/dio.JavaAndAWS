package Collections.List.OperadoresBasicos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    //Construtor
    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    //Método adicionar item
    public void adicionarItem(String nome, int preco, int quantidade) {
        listaItem.add(new Item(nome, preco, quantidade));
    }

    //Método remover item
    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i: listaItem) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        listaItem.removeAll(itemParaRemover);
    }

    //Método valor total
    public int valorCarrinho() {
        int num = 0;
        for (Item i : listaItem) {
            num += i.getPreco() * i.getQuantidade();
        }
        return num;
    }

    //Método exibir itens
    public void exibirItens() {
        System.out.println(listaItem);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaDeItens = new CarrinhoDeCompras();

        listaDeItens.adicionarItem("Teclado", 24, 3);
        listaDeItens.adicionarItem("Caderno", 18, 1);
        listaDeItens.adicionarItem("Mouse", 35, 1);
        listaDeItens.adicionarItem("Doce", 2, 7);

        listaDeItens.exibirItens();

        listaDeItens.removerItem("Teclado");

        System.out.println("O valor total do carrinho é de: " + listaDeItens.valorCarrinho());
    }
}
