package list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adcionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado convidado: convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        System.out.println("convidado código: "+convidadoParaRemover.getCodigoConvite()+" foi removido");
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public static void main(String[] args) {
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
        listaConvidados.adcionarConvidado("Theo Trindade", 44);
        listaConvidados.adcionarConvidado("Plebeu", 999);

        System.out.println(listaConvidados.contarConvidados());
        listaConvidados.removerConvidadoPorCodigoConvite(999);
        System.out.println(listaConvidados.contarConvidados());
    }
}
