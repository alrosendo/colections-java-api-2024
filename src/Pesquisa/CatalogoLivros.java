package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoinicial, int anoFinal) {
        List<Livro> listaPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoinicial && l.getAnoPublicacao() <= anoFinal) {
                    listaPorIntervaloAnos.add(l);
                }
            }
        }
        return listaPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro 1", "autor 1", 2004);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 2001);
        catalogoLivros.adicionarLivro("livro 3", "autor 3", 2005);
        catalogoLivros.adicionarLivro("livro 4", "autor 4", 2003);

        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001, 2005));
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
    }
}