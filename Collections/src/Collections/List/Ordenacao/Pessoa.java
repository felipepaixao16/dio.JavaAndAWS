package Collections.List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    //métodos
    private String nome;
    private int idade;
    private double altura;

    //contrutor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "\nPessoa" +
                "\nnome:" + nome +
                "\nidade:" + idade +
                "\naltura:" + altura + "\n \n";
    }
}

class ComparatorByHeight implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
