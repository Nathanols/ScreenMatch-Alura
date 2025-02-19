package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

//criacao da classe Movie que estende todos os
//atributos e metodos da classe mae Titulo
public class Movie extends Titulo implements Classificavel {

    private String diretor;

    //Criando um metodo construtor de um filme
    public Movie(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    //Criando Getters e Setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //Sobrescrevendo metodos usados em outras classes
    @Override
    public int getClassificacao() {
        return mediaAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNome() +" ("+ this.getAnoDeLancamento()+ ")";
    }
}
