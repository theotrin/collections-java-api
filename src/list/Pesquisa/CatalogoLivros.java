package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adcionarLivros(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livrosList.isEmpty()) {
            for(Livro livro: livrosList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();

        if(!livrosList.isEmpty()) {
            for(Livro livro: livrosList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarLivroPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro livro: livrosList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adcionarLivros("Manual do viajante da galáxia", "Niew", 1990);
        catalogoLivros.adcionarLivros("O programador pragmático", "Andrew Hunt", 1970);
        catalogoLivros.adcionarLivros("Coraline e o mundo secreto", "Niew Gaiman", 1975);
        catalogoLivros.adcionarLivros("Coraline e o mundo magico", "Niew Gaiman", 1975);

        System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Coraline e o mundo secreto"));
        System.out.println("resultado da pesquisa: "+ catalogoLivros.pesquisarPorAutor("Niew Gaiman"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(1980,1990));

    }

}
