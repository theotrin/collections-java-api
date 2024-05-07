package list.Pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adcionarContato(String nome, int numero) {
        Contato novoContato = new Contato(nome,numero);
        System.out.println("Contato adcionado nome: "+novoContato.getNome()+" numero: "+ novoContato.getNumero());
        contatoSet.add(novoContato);
    }

        public void exibirContatos() {
            System.out.println(contatoSet);
    }

    public void pesquisarContato(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatoSet){
            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        System.out.println(contatosPorNome);
    }

    public void atualizarNumeroDeContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        System.out.println("Dados atualizados! novo numero para contato: "+contatoAtualizado.getNumero());
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adcionarContato("Theo", 91119423);
        agenda.adcionarContato("Barry Allen", 9999981);
        agenda.adcionarContato("Mia Khalifa", 696969696);

//        agenda.exibirContatos();
        agenda.atualizarNumeroDeContato("Mia Khalifa", 12345678);
        agenda.pesquisarContato("Mi");
    }



}
