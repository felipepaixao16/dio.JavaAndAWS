package Collections.List.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void addProduct(long cod, String nome, double preco, int quantidade) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void showsProduct() {
        System.out.println(estoqueProdutoMap);
    }

    public double calculateValueTotalStock() {
        double valueTotalstock = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valueTotalstock += p.getQuantidade() * p.getPreco();
            }
        }
        return valueTotalstock;
    }

    public Produto getProductMoreExpensive() {
        Produto productMoreExpensive = null;
        double biggerPrice = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if(p.getQuantidade() > biggerPrice) {
                    productMoreExpensive = p;
                }
            }
        }
        return productMoreExpensive;
    }
}
