package Collections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    //Adicionar
    public void adicionarLivro(String autor, String titulo, int anoPublicacao) {
        listLivros.add(new Livro(autor, titulo, anoPublicacao));
    }

    //Exibir
    public void exibirLivros() {
        System.out.println(listLivros);
    }

    //Pesquisar por nome
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listPorAutor = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro l: listLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listPorAutor.add(l);
                }
            }
        }
        return listPorAutor;
    }

    //Pesquisa por intervalo de anos
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicio, int anoFinal) {
        List<Livro> listPorIntervalo = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFinal) {
                    listPorIntervalo.add(l);
                }
            }
        }
        return listPorIntervalo;
    }

    //Pesquisa por titulo
    public Livro pesquisaPorTitulo(String titulo) {
        Livro pesquisaTitulo = null;
        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    pesquisaTitulo = l;
                    break;
                }
            }
        }
        return pesquisaTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Joao", "O amor", 2019);
        catalogoLivros.adicionarLivro("Pedro", "O perdão", 2020);
        catalogoLivros.adicionarLivro("Clarice", "A misericordia", 2021);
        catalogoLivros.adicionarLivro("Fernanda", "A compaixão", 2022);

        catalogoLivros.exibirLivros();

        System.out.println(catalogoLivros.pesquisarPorAutor("Pedro"));

        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));

        System.out.println(catalogoLivros.pesquisaPorTitulo("A Compaixão"));

    }
}
