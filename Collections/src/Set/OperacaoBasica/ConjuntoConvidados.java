package Set.OperacaoBasica;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidadoSet(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removeConvidadoPorConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.addConvidadoSet("Jonas", 785432);
        conjuntoConvidados.addConvidadoSet("Felipe", 846542);
        conjuntoConvidados.addConvidadoSet("Pedro", 465431);
        conjuntoConvidados.addConvidadoSet("Bruna", 655321);
        conjuntoConvidados.addConvidadoSet("Amanda", 785432);

        System.out.println(conjuntoConvidados.contarConvidado());
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removeConvidadoPorConvite(135465);
        System.out.println(conjuntoConvidados.contarConvidado());

    }
}
