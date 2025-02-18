import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Movie;
import screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Movie filme1 = new Movie("Gigantes de Aço",2014);

        //filme1.setNome("Gigantes de Aço");
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(180);
        filme1.setAnoDeLancamento(2014);


        //System.out.println(filme1.nome);
        //System.out.println(filme1.incluidoNoPlano);
        //System.out.println(filme1.duracaoEmMinutos);
        //System.out.println(filme1.anoDeLancamento);
        filme1.exibirFichaTecnica();
        //filme1.mediaAvaliacao();
        System.out.println("Total de avaliacoes "+ filme1.getTotalDeAvaliacoes());

        Movie filme2 = new Movie("Piratas do Caribe", 2008);

        //filme2.setNome("Piratas do Caribe");
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(200);
        filme2.exibirFichaTecnica();
        //filme2.mediaAvaliacao();

        Movie filme3 = new Movie("Wicked",2024);

        //filme3.setNome("Wicked");
        filme3.setIncluidoNoPlano(false);
        filme3.setDuracaoEmMinutos(220);
        filme3.setAnoDeLancamento(2024);

        Serie serie1 = new Serie("Naruto",2005);

        serie1.exibirFichaTecnica();
        serie1.setTemporadas(16);
        serie1.setEpPorTemporadas(25);
        serie1.setMinPorEpisodio(20);
        System.out.println("Duração da serie: "+ serie1.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Soma da duracao dos filmes: "+ calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Movie> listaDeFilme = new ArrayList<>();

        listaDeFilme.add(filme1);
        listaDeFilme.add(filme2);
        listaDeFilme.add(filme3);
        System.out.println("Tamanho da lista: "+ listaDeFilme.size());
        System.out.println(("Primeiro filme: "+ listaDeFilme.get(2).getNome()));
        System.out.println(listaDeFilme);
        System.out.println("toString do filme: "+ listaDeFilme.get(0).toString());
        System.out.println();
    }
}
