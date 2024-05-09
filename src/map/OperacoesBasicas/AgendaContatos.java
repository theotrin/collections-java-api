package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adcionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public void pesquisarPorNome(String nome) {
        Integer numeroEncontrado = null;
        if(!agendaContatoMap.isEmpty()) {
           numeroEncontrado = agendaContatoMap.get(nome);
            System.out.println(numeroEncontrado);
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adcionarContato("Theo", 991119423);
        agenda.adcionarContato("Ednes", 991820099);
        agenda.adcionarContato("Alexandre", 992156262);

        agenda.pesquisarPorNome("Alexandre");
        agenda.removerContato("Alexandre");
        agenda.exibirContatos();
    }
}
