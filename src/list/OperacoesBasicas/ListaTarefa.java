package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adcionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa: tarefaList){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterTotalDeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("o numero total de tarefas é: "+listaTarefa.obterTotalDeTarefas());

        listaTarefa.adcionarTarefa("Fazer bolo");
        listaTarefa.adcionarTarefa("Fazer bolo");
        listaTarefa.adcionarTarefa("Fazer cachorro quente");

        System.out.println("o numero total de tarefas é: "+listaTarefa.obterTotalDeTarefas());

        listaTarefa.removerTarefa("fazer bolao");
        System.out.println("o numero total de tarefas é: "+listaTarefa.obterTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
