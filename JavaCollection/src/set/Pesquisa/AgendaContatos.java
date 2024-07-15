package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void addContato(String nome, String numero){
        contatosSet.add(new Contato(numero, nome));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisaNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c: contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizaContato(String nome, String numero){
        Contato contatoAtt = null;
        for (Contato c: contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtt = c;
                break;
            }
        }
        return contatoAtt;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.addContato("rafa", "12 98878764");
        agenda.addContato("pe", "12 9125648");
        agenda.addContato("rafa 2", "12 9852965");
        agenda.addContato("ro", "12 9856486");
        agenda.addContato("ju", "12 9632542");

        agenda.exibirContatos();

        agenda.atualizaContato("ju", "123456789");

        agenda.exibirContatos();

        System.out.println(agenda.pesquisaNome("rafa"));
    }
}
