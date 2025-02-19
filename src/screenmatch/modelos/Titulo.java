package screenmatch.modelos;

import java.util.Scanner;

//SuperClasse que compartilha todos os seus metodos
//e atributos com as suas SubClasses Movie e Serie

//Implementa o Comparable<>
public class Titulo implements Comparable<Titulo> {

    Scanner ler = new Scanner(System.in);

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private double media = 0;
    private int duracaoEmMinutos;

    //Criando metodo construtor de Titulo
    public Titulo(String nome, int anoDeLancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);

    }

    //Criando getters e setters
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public double getMedia() {
        return media;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //criando metodos que poderão ser usados pelas subclasses

    /**
     * Exibe uma previa com informações do filme ou serie
     */
    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Incluido no plano? " + incluidoNoPlano);
        System.out.println("Duracao do filme " + duracaoEmMinutos + " minutos");
        System.out.println("Ano de lançamento " + anoDeLancamento);
    }

    /**
     * Calcula a media de avaliação dos filmes e series
     * @return
     */
    public int mediaAvaliacao() {
        while (avaliacao != -1) {
            System.out.println("Digite a avaliacao ou -1 para sair: ");
            avaliacao = ler.nextDouble();

            if (avaliacao != -1) {
                somaDasAvaliacoes += avaliacao;
                totalDeAvaliacoes++;
                media = somaDasAvaliacoes / totalDeAvaliacoes;
            }
        }
        return  (int)media;
    }

    //Sobrescrita do metodo compareTo que pertence
    //ao Comparable<> que foi implementado pela classe
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}

