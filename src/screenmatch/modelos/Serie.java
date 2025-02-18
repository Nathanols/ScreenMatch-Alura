package screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int epPorTemporada;
    private boolean ativa;
    private int minPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

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

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epPorTemporada * minPorEpisodio;
    }
}
