package screenmatch.principal;

import screenmatch.modelos.Movie;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public static void main(String[] args) {
        Movie filme1 = new Movie("Gigantes de Aço", 2014);
        filme1.setAvaliacao(9);
        Movie filme2 = new Movie("Piratas do Caribe", 2008);
        filme2.setAvaliacao(8);
        Movie filme3 = new Movie("Wicked", 2024);
        filme3.setAvaliacao(10);
        Serie serie1 = new Serie("Naruto", 2005);

        ArrayList<Titulo> novaLista = new ArrayList<>();

        novaLista.add(filme1);
        novaLista.add(filme2);
        novaLista.add(filme3);
        novaLista.add(serie1);

        //for (Titulo item: novaLista){
        //    System.out.println(item.getNome());
        //    if(item instanceof Movie filme){
        //        System.out.println("Classificação: "+ filme.getClassificacao());
        //    }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Harrison Ford");
        buscaPorArtista.add("Michael B Jordan");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Adam Sandler");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenaçõ: " + buscaPorArtista);
        System.out.println();
        System.out.println(novaLista);
        Collections.sort(novaLista);
        System.out.println("Lista de titulos ordenados: "+ novaLista);
    }
}

