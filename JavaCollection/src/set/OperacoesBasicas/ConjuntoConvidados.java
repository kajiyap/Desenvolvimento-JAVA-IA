package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void addConvidado (String nome, int codigo){
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removeCodigo (int codigo){
        Convidado convidadoRemover = null;
        for (Convidado c: convidadosSet){
            if (c.getCodigo() == codigo){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    //Teste de metódos
    public static void main(String[] args) {
        ConjuntoConvidados convidadosSet = new ConjuntoConvidados();

        convidadosSet.addConvidado("rafael", 0);
        convidadosSet.addConvidado("murilo", 1);
        convidadosSet.addConvidado("pedro", 2);
        convidadosSet.addConvidado("rodrigo", 3);
        convidadosSet.addConvidado("bruno", 4);
        convidadosSet.addConvidado("abner",5);

        System.out.println("contagem de convidados: "+convidadosSet.contarConvidados());

        convidadosSet.removeCodigo(3);

        convidadosSet.exibirConvidados();
    }
}
