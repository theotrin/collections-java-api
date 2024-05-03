package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adcionarPessoa("Theo", 23,1.94);
        ordenacaoPessoa.adcionarPessoa("Shanks", 37,1.90);
        ordenacaoPessoa.adcionarPessoa("Gojo", 28,1.90);
        ordenacaoPessoa.adcionarPessoa("Edward New Gate", 67,2.70);

        System.out.println("Lista de pessoas ordenadas por idade: "+ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Lista de pessoas ordenadas por altura: "+ordenacaoPessoa.ordenarPorAltura());

    }
}
