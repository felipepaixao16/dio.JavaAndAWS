package Collections.List.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        setContatos.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(setContatos);
    }

    public Set<Contato> searchByName(String nome) {
        Set<Contato> nameSearch = new HashSet<>();
        for (Contato c : setContatos) {
            if (c.getNome().startsWith(nome)) {
                nameSearch.add(c);
            }
        }
        return nameSearch;
    }

    public Contato putNumberContact(String nome, int newNumber) {
        Contato contatoAtual = null;
        for (Contato c : setContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(newNumber);
                contatoAtual = c;
                break;
            }
        }
        return contatoAtual;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContato("Felipe", 988965412);
        agendaContatos.addContato("Samile", 981452874);
        agendaContatos.addContato("Felipe Silva", 986315674);
        agendaContatos.addContato("Samuel", 999245816);
        agendaContatos.addContato("Felipe Paixão", 991254785);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.searchByName("Felipe"));
        agendaContatos.putNumberContact("Samile", 992143698);
        agendaContatos.exibirContato();
    }
}
