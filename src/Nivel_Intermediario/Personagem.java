package Nivel_Intermediario;

import java.util.List;

public abstract class Personagem {
    private String nome;
    private int idade;
    private Afiliacao afiliacao;
    private int nivelDeForca;
    private List<Filmes> filme;

    public Personagem(String nome, int idade, Afiliacao afiliacao) {
        this.nome = nome;
        this.idade = idade;
        this.afiliacao = afiliacao;
    }

    /*
     *  TODO: Sobrecarga do atributo nivelDeForca
     * */
    public Personagem(String nome, int idade, Afiliacao afiliacao, int nivelDeForca) {
        this(nome, idade, afiliacao);
        this.nivelDeForca = nivelDeForca;
    }

    /*
     *  TODO: Sobrecarga do atributo filme
     * */
    public Personagem(String nome, int idade, Afiliacao afiliacao, int nivelDeForca, List<Filmes> filme) {
        this(nome, idade, afiliacao, nivelDeForca);
        this.filme = filme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Afiliacao getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(Afiliacao afiliacao) {
        this.afiliacao = afiliacao;
    }

    public int getNivelDeForca() {
        return nivelDeForca;
    }

    public void setNivelDeForca(int nivelDeForca) {
        this.nivelDeForca = nivelDeForca;
    }

    public List<Filmes> getFilme() {
        return filme;
    }

    public void setFilme(List<Filmes> filme) {
        this.filme = filme;
    }

    public String apresentar(){
        return "Eu sou" + nome +". (" + afiliacao + ")";
    }

    public abstract void falar();

    @Override
    public String toString() {
        return "Personagem de Star Wars: " + nome;
    }
}
