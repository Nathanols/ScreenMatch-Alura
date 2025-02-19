package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //public void inclui(Movie f){
    //    tempoTotal += f.getDuracaoEmMinutos();
    //}

    //public void inclui(Serie s){
    //    tempoTotal += s.getDuracaoEmMinutos();
    //}

    /**
     * Soma os tempos das series e titulos para informar
     * quanto tempo será necessario para assistir todos
     * @param
     */
    public void inclui (Titulo t){
        tempoTotal+= t.getDuracaoEmMinutos();
    }
}
