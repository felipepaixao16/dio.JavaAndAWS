package Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> listPessoa;

    //contrutor
    public OrdenacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    //método
    public void addPeople(String nome, int idade, double altura) {
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> sortByAge() {
        List<Pessoa> peopleByAge = new ArrayList<>(listPessoa);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Pessoa> orderByHeight() {
        List<Pessoa> peopleByHeight = new ArrayList<>(listPessoa);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.addPeople("Lucas", 21, 1.83);
        ordenacaoPessoa.addPeople("Marcos", 28, 1.56);
        ordenacaoPessoa.addPeople("João", 32, 1.68);
        ordenacaoPessoa.addPeople("Natanael", 22, 1.75);

        System.out.println(ordenacaoPessoa.sortByAge());
        System.out.println(ordenacaoPessoa.orderByHeight());
    }
}
