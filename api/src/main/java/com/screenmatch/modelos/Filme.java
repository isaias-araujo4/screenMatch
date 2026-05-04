package com.screenmatch.modelos;

public class Filme {
    String nome;
    private int anoDeLacamento;
    private boolean incluidoNoPlano = true;
    private double mediaAvaliacao;
    private double somaAvaliacao;
    private int quantidadeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLacamento() {
        return anoDeLacamento;
    }
    
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }
    
    public int getQuantidadeAvaliacoes() {
        return quantidadeAvaliacoes;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    

    public void exibeFichaTecnica() {
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lançamento: " + anoDeLacamento);
        System.out.println("incluso no plano: " + incluidoNoPlano);
        System.out.println("avaliação: " + media());
        System.out.println("total de avaliações: " + quantidadeAvaliacoes);
        System.out.println("duração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double avaliacao) {
        somaAvaliacao += avaliacao;
        quantidadeAvaliacoes++;
    }

    public double media() {
        return mediaAvaliacao = somaAvaliacao / quantidadeAvaliacoes;
    }
}