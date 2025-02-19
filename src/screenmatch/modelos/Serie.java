package screenmatch.modelos;

//criacao da classe Serie que estende todos os
//atributos e metodos da classe mae Titulo
public class Serie extends Titulo{

    private int temporadas;
    private int epPorTemporada;
    private boolean ativa;
    private int minPorEpisodio;

    //Criando um metodo contrutor de uma serie
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //criando os metodos getters e setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporadas() {
        return epPorTemporada;
    }

    public void setEpPorTemporadas(int epPorTemporadas) {
        this.epPorTemporada = epPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinPorEpisodio() {
        return minPorEpisodio;
    }

    public void setMinPorEpisodio(int minPorEpisodio) {
        this.minPorEpisodio = minPorEpisodio;
    }

    //sobrescrevendo metodos ja criados em outras classes
    //para se "comprtarem de outra maneira"
    /**
     * Calcula o tempo Total de uma serie em minutos
     * @return
     */
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epPorTemporada * minPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: "+ this.getNome() +" ("+ this.getAnoDeLancamento()+ ")";
    }
}
